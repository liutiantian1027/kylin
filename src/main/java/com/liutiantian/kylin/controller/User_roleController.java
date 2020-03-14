package com.liutiantian.kylin.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.liutiantian.kylin.entity.User_role;
import com.liutiantian.kylin.service.IUser_roleService;
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
@RequestMapping("/user_role")
public class User_roleController {
    @Autowired
    private IUser_roleService iUser_roleService;
    @RequestMapping("/insert")
    public ResultEntity insert(Integer uid,Integer rids[]){
        //先删除
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("uid",uid);
        iUser_roleService.remove(queryWrapper);
        //再进行执行保存
        if(rids!=null && rids.length>0){
            //创建批量保存的集合
            List<User_role> roleArrayList = new ArrayList<>();
            //for循环遍历角色的id
            for (Integer rid:rids){
                //创建用户角色对象
                User_role user_role = new User_role();
                //设置用户的id值
                user_role.setUid(uid);
                //设置用户角色id
                user_role.setRid(rid);
                //加入到集合中
                roleArrayList.add(user_role);
            }
            iUser_roleService.saveBatch(roleArrayList);
        }
        //返回结果
        return ResultEntity.ok(true);
    }
}

