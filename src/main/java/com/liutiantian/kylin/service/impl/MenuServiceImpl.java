package com.liutiantian.kylin.service.impl;

import com.liutiantian.kylin.entity.Menu;
import com.liutiantian.kylin.mapper.MenuMapper;
import com.liutiantian.kylin.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 刘甜甜
 * @since 2020-03-03
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {
    @Autowired
    private MenuMapper menuMapper;
    @Override
    public List<Menu> listMenus() {
        return menuMapper.listMenus();
    }

    @Override
    public List<Menu> listByUsername(String userName) {
        return menuMapper.listByUsername(userName);
    }
}
