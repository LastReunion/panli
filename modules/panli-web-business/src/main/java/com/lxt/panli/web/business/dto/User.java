package com.lxt.panli.web.business.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @Desc
 * @Auth liuxutao
 * @Date 2020/3/14 22:14
 */
@Data
@Builder
public class User {

    private String username;
    private Integer age;

}
