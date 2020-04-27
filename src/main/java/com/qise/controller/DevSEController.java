package com.qise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jql
 * @date 2020/4/25 - 10:29
 */
@Controller
@RequestMapping(value = "/dev/flatform/app")
public class DevSEController {

    @RequestMapping(value="/begin")
    public String maintain(){
        return "devHome/appMaintain";
    }

}
