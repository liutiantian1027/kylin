package com.liutiantian.kylin.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liutiantian.kylin.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liutiantian.kylin.entity.RoleVo;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 刘甜甜
 * @since 2020-03-03
 */
public interface RoleMapper extends BaseMapper<Role> {
    IPage<RoleVo> selectPageVo(Page<?> page, RoleVo roleVo);


}
