package com.ssm.crud.entity;

import lombok.Data;

/**
 * @author Ernest
 * @date 2018/4/4 13:34
 */
@Data
public class Result<T> {

    //提示码
    private Integer code;

    //提示信息
    private String msg;

    //具体内容
    private T extend;
}

