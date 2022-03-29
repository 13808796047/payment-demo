package com.example.paymentdemo.controller;


import com.example.paymentdemo.entity.Product;
import com.example.paymentdemo.service.ProductService;
import com.example.paymentdemo.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Summer
 * @since 2022-03-29
 */
@Api(tags = "商品管理")
@RestController
@RequestMapping("/products")
public class ProductController {

    @Resource
    private ProductService productService;
    @ApiOperation("商品列表")
    @GetMapping()
    public R index(){
        List<Product> list = productService.list();
        return R.ok().data("products",list);
    }
}
