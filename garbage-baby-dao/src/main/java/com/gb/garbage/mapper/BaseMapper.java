package com.gb.garbage.mapper;

/**
 * @author yyc
 * @date 2020/2/27 15:09
 */
public interface BaseMapper<T> {
    /**
     * 按照逐渐删除
     *
     * @param id
     * @return
     */
    int deleteById(Long id);


    /**
     * 插入新记录
     *
     * @param record
     * @return
     */
    int insert(T record);


    /**
     * 按照主键查询一条数据
     *
     * @param id
     * @return
     */
    T selectById(Long id);


    /**
     * 更新
     *
     * @param record
     * @return
     */
    int updateById(T record);

    /**
     * 根据id删除多条记录
     * @param ids
     * @return
     */
    int deleteByArrayKey(Long ...ids);

}
