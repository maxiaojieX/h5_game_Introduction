package com.h5.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xiaojie.Ma on 2018/12/18.
 */
@Controller
public class TestAction {

    @RequestMapping("/")
    public String index() {
        return "home/index";
    }

}
