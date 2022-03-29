package com.example.paymentdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Summer
 * @date 2022/3/29 10:37
 */
@RestController
@RequestMapping("/api/product")
public class ProductController {
    @GetMapping("/test")
    public String test(){
       return "test" ;
    }
}
