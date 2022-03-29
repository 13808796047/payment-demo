package com.example.paymentdemo.controller;

import com.example.paymentdemo.config.WxPay;
import com.example.paymentdemo.vo.R;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Summer
 * @date 2022/3/29 15:43
 */
@Api(tags = "测试控制器")
@RestController
@RequestMapping("api/test")
public class TestController {
    @Resource
    private WxPay wxPay;
    @GetMapping
    public R test(){
        String mchId = wxPay.getMchId();
        return R.ok().data("mch_id",mchId);
    }
}
