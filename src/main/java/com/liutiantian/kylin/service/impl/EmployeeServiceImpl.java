package com.liutiantian.kylin.service.impl;

import com.liutiantian.kylin.entity.Employee;
import com.liutiantian.kylin.mapper.EmployeeMapper;
import com.liutiantian.kylin.service.IEmployeeService;
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
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {

}
