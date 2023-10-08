package com.qf.announce.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "t_keywords")
public class Keywords {
    /**
     * 关键词id
     */
    @TableId(value = "keywords_id", type = IdType.INPUT)
    private Long keywordsId;

    /**
     * 关键词内容
     */
    @TableField(value = "keywords_content")
    private String keywordsContent;

    /**
     * 公告id
     */
    @TableField(value = "announce_id")
    private Long announceId;

    /**
     * 状态
     */
    @TableField(value = "`status`")
    private Integer status;

    public static final String COL_KEYWORDS_ID = "keywords_id";

    public static final String COL_KEYWORDS_CONTENT = "keywords_content";

    public static final String COL_ANNOUNCE_ID = "announce_id";

    public static final String COL_STATUS = "status";
}