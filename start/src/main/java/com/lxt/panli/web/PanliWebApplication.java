package com.lxt.panli.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @author liuxutao
 * @create 2019-09-06 20:44
 */
@SpringBootApplication(scanBasePackages = "com.lxt.panli.web")
//@EnableScheduling     //启用定时任务
//@EnableCaching        //启用缓存
@EntityScan
public class PanliWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PanliWebApplication.class, args);
    }
}
