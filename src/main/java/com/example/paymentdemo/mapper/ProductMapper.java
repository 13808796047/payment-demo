package com.example.paymentdemo.mapper;

import com.example.paymentdemo.entity.Product;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Summer
 * @since 2022-03-29
 */
@Mapper
public interface ProductMapper extends BaseMapper<Product> {

}
