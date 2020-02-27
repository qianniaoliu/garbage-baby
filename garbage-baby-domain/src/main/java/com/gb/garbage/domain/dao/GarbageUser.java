package com.gb.garbage.domain.dao;

import lombok.Data;

import java.util.Date;

/**
 * 用户信息对象
 * @author yyc
 * @date 2020/2/27 15:25
 */
@Data
public class GarbageUser {
    /**
     * 自增长id
     */
    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 用户头像url
     */
    private String imageUrl;
    /**
     * 昵称
     */
    private String nickName;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 手机号
     */
    private String phoneNumber;
    /**
     * e-mail
     */
    private String email;
    /**
     * 用户类型
     */
    private Integer type;
    /**
     * 联系方式
     */
    private String contact;
    /**
     * 描述信息
     */
    private String description;
    /**
     * 身份证id
     */
    private String identityCard;
    /**
     * 真实名称
     */
    private String realName;
    /**
     * 审核状态。0：审核中；1：审核通过；2：审核驳回
     */
    private Integer auditStatus;
    /**
     * 是否有效。0：无效；1：有效
     */
    private Integer status;
    /**
     * 数据有效性。0：无效；1：有效
     */
    private Integer yn;
    /**
     * 创建时间
     */
    private Date created;
    /**
     * 修改时间
     */
    private Date modified;

}
