package com.lxt.panli.web.business.controller;

import com.lxt.panli.web.business.config.SwaggerCustomIgnore;
import com.lxt.panli.web.business.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @Desc
 * @Auth liuxutao
 * @Date 2020/3/14 22:12
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @SwaggerCustomIgnore
    @GetMapping("/list")
    public Object getUserList(){
        return Arrays.asList(User.builder().age(18).username("枣面包").build());
    }

    @PostMapping("create")
    public Object creteUser(){
        return User.builder().age(18).username("枣面包").build();
    }

}
