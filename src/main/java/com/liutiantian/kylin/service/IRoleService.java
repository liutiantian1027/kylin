package com.liutiantian.kylin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liutiantian.kylin.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liutiantian.kylin.entity.RoleVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 刘甜甜
 * @since 2020-03-03
 */
public interface IRoleService extends IService<Role> {


    IPage<RoleVo> selectPageVo(Page page, RoleVo roleVo);
}
