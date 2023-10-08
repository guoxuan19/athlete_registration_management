package com.qf.common.base.resp;

import lombok.Getter;

@Getter
public enum ResponseStatus {
    SUCCESS(200,"成功"),
    SYS_ERROR(400,"系统错误"),
    FILE_UPLOAD_ERROR(400100, "文件上传失败"),
    ANNOUNCE_ADD_ERROR(400101, "公告添加失败"),
    ANNOUNCE_MODIFY_ERROR(400102, "公告修改失败"),
    ANNOUNCE_DEL_ERROR(400103, "公告删除失败"),
    KEYWORDS_ADD_ERROR(400104, "关键词添加失败"),
    KEYWORDS_MODIFY_ERROR(400105, "关键词修改失败"),
    KEYWORDS_DEL_ERROR(400106, "关键词删除失败")

    ;

    private Integer code;
    private String message;

    ResponseStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
