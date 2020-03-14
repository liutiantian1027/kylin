package com.liutiantian.kylin.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class NationVo implements Serializable {
    private Integer value;
    private String label;
    private List<NationVo> children;
}
