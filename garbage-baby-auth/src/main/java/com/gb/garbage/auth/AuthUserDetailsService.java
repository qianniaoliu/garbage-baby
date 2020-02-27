package com.gb.garbage.auth;

import com.gb.garbage.domain.dao.GarbageUser;
import com.gb.garbage.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: ShenLong
 * @CreateDate: 2018/5/24 10:29
 */
@Component
public class AuthUserDetailsService implements UserDetailsService {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        SysUser sysUser = new SysUser(s);
        sysUser.setId(1L);
        sysUser.setPassword(validUser(s));
        GrantedAuthority grantedAuthority = new SimpleGrantedAuthority("ADMIN");
        List<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(grantedAuthority);
        sysUser.setAuthorities(authorities);
        return sysUser;
    }

    public String validUser(String username){
        GarbageUser user = userMapper.selectByUserName(username);
        if(user == null){
            return null;
        }else {
            return user.getPassword();
        }
    }
}
