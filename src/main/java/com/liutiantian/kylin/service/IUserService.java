package com.liutiantian.kylin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liutiantian.kylin.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liutiantian.kylin.entity.UserVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 刘甜甜
 * @since 2020-03-03
 */
public interface IUserService extends IService<User> {


    IPage selectPageVo(Page<User> page, UserVo vo);
}
