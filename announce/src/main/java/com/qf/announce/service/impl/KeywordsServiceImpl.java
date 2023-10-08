package com.qf.announce.service.impl;

import com.qf.announce.entity.Keywords;
import com.qf.announce.mapper.KeywordsMapper;
import com.qf.announce.service.KeywordsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class KeywordsServiceImpl implements KeywordsService {

    @Resource
    private KeywordsMapper keywordsMapper;

    @Override
    @Transactional
    public int addKeywords(List<String> keywordsList, String announceId, String announceFlag) {
        int num = -1;
        return 0;
    }

    @Override
    public Long countKeywords(String announceId) {
        return null;
    }

    @Override
    public List<Keywords> showKeywords(String keywords) {
        return null;
    }

    @Override
    public int delKeywords(List<String> announceId, List<Long> keywordsIdList) {
        return 0;
    }
}
