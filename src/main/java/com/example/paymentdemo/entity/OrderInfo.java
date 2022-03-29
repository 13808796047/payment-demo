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
@TableName("t_order_info")
@ApiModel(value = "OrderInfo对象", description = "")
public class OrderInfo extends BaseEntity {

    @ApiModelProperty("订单标题")
    @TableField("title")
    private String title;

    @ApiModelProperty("商户订单编号")
    @TableField("order_no")
    private String orderNo;

    @ApiModelProperty("用户id")
    @TableField("user_id")
    private Long userId;

    @ApiModelProperty("支付产品id")
    @TableField("product_id")
    private Long productId;

    @ApiModelProperty("订单金额(分)")
    @TableField("total_fee")
    private Integer totalFee;

    @ApiModelProperty("订单二维码连接")
    @TableField("code_url")
    private String codeUrl;

    @ApiModelProperty("订单状态")
    @TableField("order_status")
    private String orderStatus;


}
