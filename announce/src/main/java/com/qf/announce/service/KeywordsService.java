package com.qf.announce.service;

import com.qf.announce.entity.Keywords;

import java.util.List;

public interface KeywordsService {

    int addKeywords(List<String> keywordsList, String announceId,String announceFlag);

    Long countKeywords(String announceId);

    List<Keywords> showKeywords(String keywords);

    int delKeywords(List<String> announceId, List<Long> keywordsIdList);
}
