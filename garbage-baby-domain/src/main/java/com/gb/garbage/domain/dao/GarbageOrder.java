package com.gb.garbage.domain.dao;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单对象
 * @author yyc
 * @date 2020/2/27 16:01
 */
@Data
public class GarbageOrder {
    /**
     * 自增长id
     */
    private Long id;
    /**
     * 订单id
     */
    private Long orderId;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 骑手id
     */
    private Long riderId;
    /**
     * 回收商家id
     */
    private Long recyclerId;
    /**
     * 垃圾id
     */
    private Long garbageId;
    /**
     * 重量
     */
    private Double weight;
    /**
     * 距离(默认km)
     */
    private Double distance;
    /**
     * 发单地址
     */
    private String address;
    /**
     * 订单垃圾主图
     */
    private String mainImgUrl;
    /**
     * 垃圾附图地址,多张图片已逗号隔开(最多5张)
     */
    private String detailImgUrl;
    /**
     * 预约时间
     */
    private Date appointment;
    /**
     * 预估金额
     */
    private BigDecimal estimatedAmount;
    /**
     * 实际支付金额
     */
    private BigDecimal realAmount;
    /**
     * 用户实际收入金额
     */
    private BigDecimal userAmount;
    /**
     * 骑手实际收入金额
     */
    private BigDecimal riderAmount;
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
