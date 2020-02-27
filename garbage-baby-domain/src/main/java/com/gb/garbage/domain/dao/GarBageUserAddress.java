package com.gb.garbage.domain.dao;

import lombok.Data;

import java.util.Date;

/**
 * 用户地址对象
 * @author yyc
 * @date 2020/2/27 18:19
 */
@Data
public class GarBageUserAddress {
    /**
     * 自增长id
     */
    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 地址
     */
    private String address;
    /**
     * 排序:默认地址排序
     */
    private Integer sort;
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
