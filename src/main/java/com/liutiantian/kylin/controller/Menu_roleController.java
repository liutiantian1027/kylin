package com.liutiantian.kylin.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.liutiantian.kylin.entity.Menu_role;
import com.liutiantian.kylin.service.IMenu_roleService;
import com.liutiantian.kylin.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 刘甜甜
 * @since 2020-03-03
 */
@RestController
@RequestMapping("/menu_role")
public class Menu_roleController {
    @Autowired
    private IMenu_roleService iMenu_roleService;
    @RequestMapping("/insert")
    public ResultEntity insert(Integer rid,Integer [] mids){
            //先删除中间表中的rid
//        QueryWrapper wrapper = new QueryWrapper();
//        wrapper.eq("rid",rid);
//        iMenu_roleService.removeById(rid);
//
//
//        List list = new ArrayList();
//        for (Integer mid:mids) {
//            Menu_role menuRole = new Menu_role();
//            menuRole.setMid(mid);
//            menuRole.setRid(rid);
//            list.add(menuRole);
//        }
//        iMenu_roleService.saveBatch(list);
        try {
            iMenu_roleService.insertBatch(rid,mids);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultEntity.ok(false);
        }
        return ResultEntity.ok(true);
    }
}

