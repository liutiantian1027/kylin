package com.liutiantian.kylin.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liutiantian.kylin.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liutiantian.kylin.entity.UserVo;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 刘甜甜
 * @since 2020-03-03
 */
public interface UserMapper extends BaseMapper<User> {


    IPage selectPageVo(Page<User> page, UserVo vo);
}
