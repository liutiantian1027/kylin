package com.liutiantian.kylin.mapper;

import com.liutiantian.kylin.entity.Nation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liutiantian.kylin.entity.NationVo;

import java.util.List;

/**
 * <p>
 * 城市字典表 Mapper 接口
 * </p>
 *
 * @author 刘甜甜
 * @since 2020-03-03
 */
public interface NationMapper extends BaseMapper<Nation> {

    List<NationVo> findAll();
}
