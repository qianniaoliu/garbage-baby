package com.gb.garbage.mapper;

import com.gb.garbage.domain.dao.GarbageUser;

/**
 * @author shenlong
 * @date 2020-02-18
 */
public interface GarbageUserMapper extends BaseMapper<GarbageUser>{

    /**
     * 通过用户名获取密码
     * @param username
     * @return
     */
    GarbageUser selectByUserName(String username);
}
