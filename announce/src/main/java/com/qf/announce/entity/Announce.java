package com.qf.announce.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

@Data
@TableName(value = "t_announce")
public class Announce {
    /**
     * 公告id
     */
    @TableId(value = "announce_id", type = IdType.INPUT)
    private Long announceId;

    /**
     * 公告标题
     */
    @TableField(value = "announce_title")
    private String announceTitle;

    /**
     * 管理员账号
     */
    @TableField(value = "announce_writer_account")
    private String announceWriterAccount;

    /**
     * 发布状态：1未发布 2已发布 3已撤回
     */
    @TableField(value = "announce_status")
    private Integer announceStatus;

    /**
     * 关键词
     */
    @TableField(value = "announce_keywords")
    private String announceKeywords;

    /**
     * 浏览次数
     */
    @TableField(value = "announce_views_time")
    private Long announceViewsTime;

    /**
     * 最后一次操作时间
     */
    @TableField(value = "announce_operate_time")
    private Date announceOperateTime;

    /**
     * 公告内容
     */
    @TableField(value = "announce_content")
    private String announceContent;

    /**
     * 附件
     */
    @TableField(value = "announce_file")
    private String announceFile;

    public static final String COL_ANNOUNCE_ID = "announce_id";

    public static final String COL_ANNOUNCE_TITLE = "announce_title";

    public static final String COL_ANNOUNCE_WRITER_ACCOUNT = "announce_writer_account";

    public static final String COL_ANNOUNCE_STATUS = "announce_status";

    public static final String COL_ANNOUNCE_KEYWORDS = "announce_keywords";

    public static final String COL_ANNOUNCE_VIEWS_TIME = "announce_views_time";

    public static final String COL_ANNOUNCE_OPERATE_TIME = "announce_operate_time";

    public static final String COL_ANNOUNCE_CONTENT = "announce_content";

    public static final String COL_ANNOUNCE_FILE = "announce_file";
}