package com.example.paymentdemo.service.impl;

import com.example.paymentdemo.entity.Product;
import com.example.paymentdemo.mapper.ProductMapper;
import com.example.paymentdemo.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Summer
 * @since 2022-03-29
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
