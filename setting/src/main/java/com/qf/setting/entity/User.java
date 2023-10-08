package com.qf.setting.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "t_user")
public class User {
    /**
     * 用户id
     */
    @TableId(value = "user_id", type = IdType.INPUT)
    private Long userId;

    /**
     * 用户账号
     */
    @TableField(value = "user_account")
    private String userAccount;

    /**
     * 用户密码
     */
    @TableField(value = "user_password")
    private String userPassword;

    /**
     * 用户权限：1普通用户 2管理员
     */
    @TableField(value = "user_permissions")
    private Integer userPermissions;

    public static final String COL_USER_ID = "user_id";

    public static final String COL_USER_ACCOUNT = "user_account";

    public static final String COL_USER_PASSWORD = "user_password";

    public static final String COL_USER_PERMISSIONS = "user_permissions";
}