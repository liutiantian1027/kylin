package com.liutiantian.kylin.service.impl;

import com.liutiantian.kylin.entity.Test;
import com.liutiantian.kylin.mapper.TestMapper;
import com.liutiantian.kylin.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 刘甜甜
 * @since 2020-03-03
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

}
