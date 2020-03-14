package com.liutiantian.kylin.mapper;

import com.liutiantian.kylin.entity.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 刘甜甜
 * @since 2020-03-03
 */
public interface MenuMapper extends BaseMapper<Menu> {
    List<Menu> listMenus();

    List<Menu> listByUsername(String userName);
}
