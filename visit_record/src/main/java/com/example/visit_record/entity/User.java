package com.example.visit_record.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author CDHong
 * @since 2019-07-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    /**
     * 真实名称
     */
    @TableField("user_name")
    private String userName;

    /**
     * 登录名
     */
    @TableField("log_name")
    private String logName;

    /**
     * 用户类型 系统用户,临时用户
     */
    @TableField("user_type")
    private String userType;

    /**
     * 部门编号
     */
    @TableField("dept_id")
    private Integer deptId;

    /**
     * 登录密码
     */
    @TableField("user_pwd")
    private String userPwd;

    /**
     * 邮箱
     */
    @TableField("email")
    private String email;

    /**
     * 联系方式
     */
    @TableField("phone")
    private String phone;

    /**
     * 性别
     */
    @TableField("sex")
    private Integer sex;

    /**
     * 排序号
     */
    @TableField("order_num")
    private Integer orderNum;

    /**
     * 状态
     */
    @TableField("status")
    private Integer status;

    /**
     * 删除标志
     */
    @TableField("del_flg")
    private Integer delFlg;

    /**
     * 创建者
     */
    @TableField("create_by")
    private String createBy;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 更新者
     */
    @TableField("update_by")
    private String updateBy;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;


}
