package com.example.paymentdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @author Summer
 * @date 2022/3/29 14:02
 */
@Data
public class BaseEntity {
    // 定义主键策略,跟随数据的主键自增
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    private Date createTime;// 创建时间
    private Date updateTime;// 更新时间
}
