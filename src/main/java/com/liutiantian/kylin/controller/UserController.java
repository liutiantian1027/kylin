package com.liutiantian.kylin.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liutiantian.kylin.entity.User;
import com.liutiantian.kylin.entity.UserVo;
import com.liutiantian.kylin.service.IUserService;
import com.liutiantian.kylin.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;


    @RequestMapping("/list")
    public ResultEntity list(@RequestParam(defaultValue = "1")long current,
                             @RequestParam(defaultValue = "3")long size, UserVo vo){
        Page<User> page = new Page<>(current, size);
//        QueryWrapper queryWrapper = new QueryWrapper();
//        Page pageInfo = iUserService.page(page, queryWrapper);
       IPage pageInfo = iUserService.selectPageVo(page,vo);
        return ResultEntity.ok(pageInfo);
    }
    @RequestMapping("/delete")
    public ResultEntity delete(Integer ids[]){
        boolean flag = iUserService.removeByIds(Arrays.asList(ids));
        return ResultEntity.ok(flag);
    }
    @RequestMapping("/insert")
    public ResultEntity insert(@RequestBody User user){
        boolean save = iUserService.save(user);
        return ResultEntity.ok(save);
    }
    @RequestMapping("/update")
    public ResultEntity update(@RequestBody User entity){
        boolean flag = iUserService.updateById(entity);
        return  ResultEntity.ok(flag);
    }
    @RequestMapping("/del")
    public ResultEntity del(@RequestBody Integer id){

        boolean flag = iUserService.removeById(id);
        return ResultEntity.ok(flag);
    }
    @RequestMapping("login")
    public ResultEntity login(HttpServletRequest request, @RequestBody User user){
        HttpSession session = request.getSession();
        //打印sessionid
        System.out.println(session.getId()+"=======================");
        //定义查询条件
        QueryWrapper wrapper = new QueryWrapper();
        //username是唯一的
        wrapper.eq("username",user.getUsername());
        //获取实体对象
        User entity = iUserService.getOne(wrapper);
        //判断查询结果
        if(entity!=null){
            //判断密码
            if(entity.getPassword().equals(user.getPassword())){
                //存储回话
                session.setAttribute("user",entity);
                //返回结果
                return ResultEntity.ok(entity);
            }
        }
        return ResultEntity.error(5001,"用户名或密码错误");
    }
    @RequestMapping("loginOut")
    public ResultEntity loginOut(HttpServletRequest request){
        //获取session对象
        HttpSession session = request.getSession();
        //输出的sessionid
        System.out.println(session.getId()+"00000000000000000");
        session.removeAttribute("user");
        return ResultEntity.ok(true);
    }
}

