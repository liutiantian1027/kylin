package com.liutiantian.kylin.service;

import com.liutiantian.kylin.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 刘甜甜
 * @since 2020-03-03
 */
public interface IMenuService extends IService<Menu> {

    List<Menu> listMenus();

    List<Menu> listByUsername(String userName);
}
