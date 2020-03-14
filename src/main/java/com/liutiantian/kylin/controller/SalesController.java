package com.liutiantian.kylin.controller;


import com.liutiantian.kylin.service.ISalesService;
import com.liutiantian.kylin.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 刘甜甜
 * @since 2020-03-13
 */
@RestController
@RequestMapping("/sales")
public class SalesController {
    @Autowired
    private ISalesService iSalesService;
    @RequestMapping("/list")
    public ResultEntity list(){
        return ResultEntity.ok(iSalesService.list());
    }
}

