package com.gb.garbage.domain.dao;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 垃圾对象
 * @author yyc
 * @date 2020/2/27 15:41
 */
@Data
public class Garbage {
    /**
     * 自增长id
     */
    private Long id;
    /**
     * 垃圾id
     */
    private Long garbageId;
    /**
     * 分类id
     */
    private Long classifyId;
    /**
     * 垃圾图片url(多张图片以逗号分隔，最多5张图片)
     */
    private String imageUrl;
    /**
     * 英文名称
     */
    private String nameEn;
    /**
     * 中文名称
     */
    private String nameCn;
    /**
     * 单位价格
     */
    private BigDecimal unitPrice;
    /**
     * 单位
     */
    private String unit;
    /**
     * 大小件。0：小件垃圾；1：大件垃圾
     */
    private Integer piece;
    /**
     * 是否启用。0：未启用；1：启用
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
