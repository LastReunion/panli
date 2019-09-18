package com.lxt.panli.web.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author liuxutao
 * @create 2019-09-18 21:18
 */
@Controller
public class WebController {

    @RequestMapping(value = "/", method = {RequestMethod.GET})
    public String index() {
        return "index";
    }
}
