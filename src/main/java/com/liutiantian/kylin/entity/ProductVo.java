package com.liutiantian.kylin.entity;

import lombok.Data;

@Data
public class ProductVo extends Product{
    private String provinceName;
    private String cityName;
    private String districtName;
    private Integer cid;
    private String cname;
}
