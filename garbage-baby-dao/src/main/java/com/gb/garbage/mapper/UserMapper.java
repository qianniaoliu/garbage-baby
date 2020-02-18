package com.gb.garbage.mapper;

import com.gb.garbage.domain.User;

/**
 * @author shenlong
 * @date 2020-02-18
 */
public interface UserMapper {

    /**
     * 通过用户名获取密码
     * @param username
     * @return
     */
    User selectByUserName(String username);
}
