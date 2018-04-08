package com.ssm.crud.entity;

import lombok.Data;

@Data
public class Department {
    private Integer deptId;

    private String deptName;

    public Department(Integer deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public Department() {
        super();
    }
}