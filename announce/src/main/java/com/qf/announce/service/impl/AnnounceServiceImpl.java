package com.qf.announce.service.impl;

import com.qf.announce.common.dto.AnnounceDto;
import com.qf.announce.entity.Announce;
import com.qf.announce.mapper.AnnounceMapper;
import com.qf.announce.service.AnnounceService;
import com.qf.announce.service.KeywordsService;
import com.qf.common.base.exception.AnnounceException;
import com.qf.common.base.resp.ResponseStatus;
import com.qf.common.base.utils.CommonBeanUtils;
import com.qf.common.base.utils.FileUploadUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class AnnounceServiceImpl implements AnnounceService {

    @Resource
    private AnnounceMapper announceMapper;

    @Resource
    private KeywordsService keywordsService;

    /**
     * 关键词最多只能输入五个
     */
    public static final int NUM = 5;
    /**
     * 公示公告添加标记
     */
    public static final String ADD_FLAG = "add";
    /**
     * 公示公告修改标记
     */
    public static final String MODIFY_FLAG = "modify";

    @Override
    @Transactional
    public int addAnnounce(String announceId, String announceTitle, String announceWriterAccount, String announceContent, String announceFile, MultipartFile multipartFile, List<String> keywordsList) {
        if(keywordsList.size() > NUM){
            throw new AnnounceException(ResponseStatus.ANNOUNCE_ADD_ERROR);
        }
        announceId = UUID.randomUUID().toString();
        announceFile = multipartFile.getOriginalFilename();
        AnnounceDto announceDto = new AnnounceDto();
        announceDto.setAnnounceId(Long.valueOf(announceId));
        announceDto.setAnnounceTitle(announceTitle);
        announceDto.setAnnounceWriterAccount(announceWriterAccount);
        announceDto.setAnnounceContent(announceContent);
        announceDto.setAnnounceFile(announceFile);
        int num = announceMapper.insert(CommonBeanUtils.copyForBean(announceDto, Announce::new));
        if (num <= 0){
            throw new AnnounceException(ResponseStatus.ANNOUNCE_ADD_ERROR);
        }
        FileUploadUtils.uploadToServer(multipartFile);
        keywordsService.addKeywords(keywordsList, String.valueOf(announceDto.getAnnounceId()),ADD_FLAG);
        return num;
    }
}
