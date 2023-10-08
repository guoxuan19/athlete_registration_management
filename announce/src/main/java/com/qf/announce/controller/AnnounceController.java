package com.qf.announce.controller;

import com.qf.announce.common.dto.AnnounceDto;
import com.qf.announce.service.AnnounceService;
import com.qf.common.base.resp.ResponseResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/announce")
public class AnnounceController {

    @Resource
    private AnnounceService announceService;

    @PostMapping("/add")
    public ResponseResult<Integer> add(@RequestParam String announceId,
                                       @RequestParam String announceTitle,
                                       @RequestParam String announceWriterAccount,
                                       @RequestParam String announceFile,
                                       @RequestParam MultipartFile multipartFile,
                                       @RequestParam List<String> keywordsList) {
        return null;
    }
}
