package com.liutiantian.kylin.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.liutiantian.kylin.entity.Menu_role;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 刘甜甜
 * @since 2020-03-03
 */
public interface IMenu_roleService extends IService<Menu_role> {


    void insertBatch(Integer rid, Integer[] mids)throws Exception;


}
