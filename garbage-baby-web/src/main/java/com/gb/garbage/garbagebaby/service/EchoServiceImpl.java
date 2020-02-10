package com.gb.garbage.garbagebaby.service;

import org.apache.dubbo.config.annotation.Service;

/**
 * @author shenlong
 * @date 2020-02-10
 */
@Service(version = "1.0.1")
public class EchoServiceImpl implements EchoService {
    @Override
    public void sayHello() {

    }
}
