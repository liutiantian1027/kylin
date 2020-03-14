package com.liutiantian.kylin.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liutiantian.kylin.entity.Product;
import com.baomidou.mybatisplus.extension.service.IService;
import com.liutiantian.kylin.entity.ProductVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 刘甜甜
 * @since 2020-03-13
 */
public interface IProductService extends IService<Product> {


    IPage<ProductVo> selectPageVo(Page page, ProductVo productVo,Product product);
}
