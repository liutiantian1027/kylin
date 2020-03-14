package com.liutiantian.kylin.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.liutiantian.kylin.entity.Product;
import com.liutiantian.kylin.entity.ProductVo;
import com.liutiantian.kylin.entity.Productsales;
import com.liutiantian.kylin.service.IProductService;
import com.liutiantian.kylin.service.IProductsalesService;
import com.liutiantian.kylin.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 刘甜甜
 * @since 2020-03-13
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService iProductService;
    @Autowired
    private IProductsalesService iProductsalesService;
    @RequestMapping("list")
    public ResultEntity list(@RequestParam(defaultValue = "1")long current,
                             @RequestParam(defaultValue = "3")long size, ProductVo productVo,Product product){
        Page page = new Page(current,size);
       IPage<ProductVo> pageInfo = iProductService.selectPageVo(page,productVo,product);
       return ResultEntity.ok(pageInfo);
    }
    @RequestMapping("/insert")
    public ResultEntity insert(@RequestBody Product product,Integer pid,Integer cids[]){
        boolean save = iProductService.save(product);

        if(cids!=null && cids.length>0){
            List<Productsales> list = new ArrayList<>();
            for (Integer cid:cids) {
                Productsales productsales = new Productsales();
                productsales.setCid(cid);
                productsales.setPid(pid);
                list.add(productsales);
            }
            iProductsalesService.saveBatch(list);
        }
        return ResultEntity.ok(true);

    }
    @RequestMapping("/delete")
    public ResultEntity delete(Integer ids[]){
        for (Integer id:ids) {
            QueryWrapper wrapper = new QueryWrapper();
            wrapper.eq("pid",ids);
            iProductsalesService.remove(wrapper);
        }
        boolean flag = iProductService.removeByIds(Arrays.asList(ids));
        return ResultEntity.ok(flag);
    }
}

