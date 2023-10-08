package com.qf.announce.controller;

import com.qf.announce.service.KeywordsService;
import com.qf.common.base.resp.ResponseResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/keywords")
public class KeywordsController {

    @Resource
    private KeywordsService keywordsService;

    public ResponseResult<Integer> del(@RequestParam("announceIdList") List<String> announceIdList,
                                       @RequestParam("keywordsIdList") List<Long> keywordsIdList){
        return null;
    }
}
