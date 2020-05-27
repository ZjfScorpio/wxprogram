package com.wxprogram.entity;

import lombok.Data;


@Data
public class Area {
    private Integer id;
    private String name;
    private Integer priority;
    private Long createTime;
    private Long lastEditTime;
}
