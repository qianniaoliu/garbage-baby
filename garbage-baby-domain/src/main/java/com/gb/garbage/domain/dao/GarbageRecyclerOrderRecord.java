package com.gb.garbage.domain.dao;

import lombok.Data;

import java.util.Date;

/**
 * 商家订单记录对象
 * @author yyc
 * @date 2020/2/27 16:59
 */
@Data
public class GarbageRecyclerOrderRecord {
    /**
     * 自增长id
     */
    private Long id;
    /**
     * 订单id
     */
    private Long orderId;
    /**
     * 商家id
     */
    private Long recyclerId;

    /**
     * 商家接单状态: 1:商家接单处理中 2:商家支付中 3:商家取消 4:完成
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
