package com.ssm.crud.enums;

import lombok.Getter;

/**
 * @author Ernest
 * @date 2018/4/4 13:32
 */
@Getter
public enum ResultEnums {
    SUCCESS(100, "成功"),
    FAIL(200, "失败"),
    ;
    private Integer code;

    private String msg;

    ResultEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}

