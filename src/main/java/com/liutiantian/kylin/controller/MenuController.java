package com.liutiantian.kylin.controller;


import com.liutiantian.kylin.entity.User;
import com.liutiantian.kylin.service.IMenuService;
import com.liutiantian.kylin.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 刘甜甜
 * @since 2020-03-03
 */
@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private IMenuService iMenuService;
    @RequestMapping("/list")
    public ResultEntity list(){
        return ResultEntity.ok(iMenuService.listMenus());
    }

    @RequestMapping("/listByUserName")
    public ResultEntity listByUserNAme(HttpServletRequest request, @RequestParam(defaultValue = "libai") String userName){
        System.err.println("0000000000000000"+request.getSession().getId()+"1111");
        User user = (User) request.getSession().getAttribute("user");
        if(user!=null){
            userName = user.getUsername();
            System.err.println("00000000000000"+userName);
        }
        return ResultEntity.ok(iMenuService.listByUsername(userName));
    }
}

