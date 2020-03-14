package com.liutiantian.kylin.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liutiantian.kylin.entity.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liutiantian.kylin.entity.ProductVo;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 刘甜甜
 * @since 2020-03-13
 */
public interface ProductMapper extends BaseMapper<Product> {

    IPage<ProductVo> selectPageVo(Page page, ProductVo productVo,Product product);
}
