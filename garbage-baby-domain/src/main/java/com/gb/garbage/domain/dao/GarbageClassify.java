package com.gb.garbage.domain.dao;

import lombok.Data;

import java.util.Date;

/**
 * 垃圾分类对象
 * @author yyc
 * @date 2020/2/27 15:57
 */
@Data
public class GarbageClassify {
    /**
     * 自增长id
     */
    private Long id;
    /**
     * 垃圾分类id
     */
    private Long classifyId;
    /**
     * 垃圾分类图片url(多张图片以逗号分隔，最多5张图片)
     */
    private String imageUrl;
    /**
     * 父垃圾分类id
     */
    private Long parentId;
    /**
     * 英文名称
     */
    private String nameEn;
    /**
     * 中文名称
     */
    private String nameCn;
    /**
     * 垃圾分类级别
     */
    private Integer level;
    /**
     * 垃圾分类类型。1：生活垃圾；2：建筑垃圾；3：医用垃圾；4：化学垃圾；5：其他
     */
    private Integer type;
    /**
     * 是否启用。0：无效；1：有效
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
