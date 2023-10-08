package com.qf.announce.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface AnnounceService {
    int addAnnounce(String announceId, String announceTitle, String announceWriterAccount, String announceContent,
                    String announceFile, MultipartFile multipartFile, List<String> keywordsList);
}
