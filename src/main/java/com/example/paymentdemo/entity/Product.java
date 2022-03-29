package com.example.paymentdemo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.paymentdemo.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Summer
 * @since 2022-03-29
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("t_product")
@ApiModel(value = "Product对象", description = "")
public class Product extends BaseEntity {

    @ApiModelProperty("商品名称")
    @TableField("title")
    private String title;

    @ApiModelProperty("价格(分)")
    @TableField("price")
    private Integer price;


}
