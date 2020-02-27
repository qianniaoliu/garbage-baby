package com.gb.garbage.domain.dao;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户账号对象
 * @author yyc
 * @date 2020/2/27 18:33
 */
@Data
public class GarbageUserAmount {
    /**
     * 自增长id
     */
    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 用户账号余额
     */
    private BigDecimal balances;
    /**
     * 用户账号总提现金额
     */
    private BigDecimal totalCashAmount;
    /**
     * 用户账号总充值金额
     */
    private BigDecimal totalRechargeAmount;
    /**
     * 用户账号交易总收入金额
     */
    private BigDecimal totalIncomeAmount;
    /**
     * 用户账号交易总支付金额
     */
    private BigDecimal totalPayAmount;
    /**
     * 账户是否冻结。0：无效；1：有效
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
