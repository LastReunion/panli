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
        String result = "你终于来了，等你好久啦，猪^(*￣(oo)￣)^\n" +
                "虽然不知道今天发生了什么，但是还是不想看到你难过的样子额\n" +
                "加油ヾ(◍°∇°◍)ﾉﾞ要振作丫\n" +
                "晚安";
        return result;
    }

}
