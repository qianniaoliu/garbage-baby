package com.gb.garbage.domain.dao;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 用户账号交易流水
 * @author yyc
 * @date 2020/2/27 18:37
 */
@Data
public class GarbageUserTransaction {
    /**
     * 自增长id
     */
    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 用户交易金额
     */
    private BigDecimal amount;
    /**
     * 交易类型: 1:用户充值 2:用户提现 3:交易支付 4:交易收入
     */
    private Integer transType;
    /**
     * 描述
     */
    private String description;
}
