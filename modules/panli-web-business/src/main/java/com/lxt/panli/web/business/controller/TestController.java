package com.lxt.panli.web.business.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuxutao
 * @create 2019-09-06 20:55
 */
@RestController
@RequestMapping("/web")
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "success";
    }

}
