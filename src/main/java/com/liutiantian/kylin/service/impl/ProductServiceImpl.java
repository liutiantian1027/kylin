package com.liutiantian.kylin.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liutiantian.kylin.entity.Product;
import com.liutiantian.kylin.entity.ProductVo;
import com.liutiantian.kylin.mapper.ProductMapper;
import com.liutiantian.kylin.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 刘甜甜
 * @since 2020-03-13
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public IPage<ProductVo> selectPageVo(Page page, ProductVo productVo,Product product) {
        return productMapper.selectPageVo(page,productVo,product);
    }
}
