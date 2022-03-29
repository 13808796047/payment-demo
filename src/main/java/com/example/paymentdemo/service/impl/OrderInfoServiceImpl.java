package com.example.paymentdemo.service.impl;

import com.example.paymentdemo.entity.OrderInfo;
import com.example.paymentdemo.mapper.OrderInfoMapper;
import com.example.paymentdemo.service.OrderInfoService;
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
public class OrderInfoServiceImpl extends ServiceImpl<OrderInfoMapper, OrderInfo> implements OrderInfoService {

}
