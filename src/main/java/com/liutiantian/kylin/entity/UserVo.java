package com.liutiantian.kylin.entity;

import lombok.Data;

@Data
public class UserVo extends User{
    private String provinceName;
    private String cityName;
    private String districtName;

    //角色表的属性
    private String rids;
    private String rnames;
    private String rnameZhs;

}
