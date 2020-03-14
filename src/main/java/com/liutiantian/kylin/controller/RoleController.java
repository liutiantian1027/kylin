package com.liutiantian.kylin.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liutiantian.kylin.entity.Role;
import com.liutiantian.kylin.entity.RoleVo;
import com.liutiantian.kylin.service.IMenu_roleService;
import com.liutiantian.kylin.service.IRoleService;
import com.liutiantian.kylin.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 刘甜甜
 * @since 2020-03-03
 */
@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private IRoleService iRoleService;
    @Autowired
    private IMenu_roleService iMenu_roleService;
    @RequestMapping("/list")
    public ResultEntity getList(){

        return ResultEntity.ok(iRoleService.list());
    }
    @RequestMapping("/select")
    public ResultEntity selectPageVo(@RequestParam(defaultValue = "1")long current,
                                     @RequestParam(defaultValue = "3")long size, RoleVo roleVo) {
        Page page = new Page<>(current, size);
        IPage<RoleVo> pageInfo = iRoleService.selectPageVo(page,roleVo);
        return ResultEntity.ok(pageInfo);
    }
    @RequestMapping("/deletes")
    public ResultEntity deletes(Integer ids[]){
        for (Integer id:ids){
            QueryWrapper wrapper =  new QueryWrapper<>();
            wrapper.eq("rid",id);
            iMenu_roleService.remove(wrapper);
        }
        boolean flag = iRoleService.removeByIds(Arrays.asList(ids));
        return ResultEntity.ok(flag);
    }
    @RequestMapping("/update")
    public ResultEntity update(@RequestBody Role entity){
        boolean flag = iRoleService.updateById(entity);
        return ResultEntity.ok(flag);
    }
}

