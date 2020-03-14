package com.liutiantian.kylin.service;

import com.liutiantian.kylin.entity.Nation;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liutiantian.kylin.entity.NationVo;

import java.util.List;

/**
 * <p>
 * 城市字典表 服务类
 * </p>
 *
 * @author 刘甜甜
 * @since 2020-03-03
 */
public interface INationService extends IService<Nation> {

    /**
     * 查询所有的数据
     * @return
     */
   List<NationVo> findAll();
}
