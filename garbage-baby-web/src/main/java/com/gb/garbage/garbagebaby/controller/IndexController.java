package com.gb.garbage.garbagebaby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author shenlong
 * @date 2020-02-10
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/index")
    public String index(){
        return "/index";
    }
}
