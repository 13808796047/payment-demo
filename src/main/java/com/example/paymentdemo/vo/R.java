package com.example.paymentdemo.vo;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Summer
 * @date 2022/3/29 13:32
 */
@Data
public class R {
    private Integer code;// 响应码
    private String message; // 响应消息
    private Map<String, Object> data = new HashMap<>();

    public static R ok() {
        R r = new R();
        r.setCode(200);
        r.setMessage("操作成功");
        return r;
    }

    public static R error() {
        R r = new R();
        r.setCode(400);
        r.setMessage("操作失败");
        return r;
    }

    public R data(String key, Object value) {
        this.data.put(key, value);
        return this;
    }
}
