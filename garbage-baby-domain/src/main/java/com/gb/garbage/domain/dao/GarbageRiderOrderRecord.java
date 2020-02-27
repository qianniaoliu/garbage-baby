package com.gb.garbage.domain.dao;

import lombok.Data;

import java.util.Date;

/**
 * 骑手订单记录表
 * @author yyc
 * @date 2020/2/27 18:15
 */
@Data
public class GarbageRiderOrderRecord {
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
    private Long riderId;

    /**
     * 骑手接单状态: 1:骑手取货中 2:骑手送货中 3:骑手取消 4:完成
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
