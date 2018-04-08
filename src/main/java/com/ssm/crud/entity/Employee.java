package com.ssm.crud.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Pattern;

@Data
public class Employee {
    private Integer empId;

    @Pattern(regexp = "(^[a-zA-Z0-9_-]{5,16}$)|(^[\\u2E80-\\u9FFF]{2,5})"
            , message = "用户名必须是2-5位中文或者5-16位英文和数字的组合")
    private String empName;

    private String gender;

    @Pattern(regexp = "(^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$)"
            , message = "邮箱格式不正确")
    private String email;

    private Integer dId;

    private Department department;

    public Employee() {
        super();
    }

    public Employee(Integer empId, String empName, String gender, String email, Integer dId) {
        this.empId = empId;
        this.empName = empName;

        this.gender = gender;
        this.email = email;
        this.dId = dId;
        this.department = department;
    }
}