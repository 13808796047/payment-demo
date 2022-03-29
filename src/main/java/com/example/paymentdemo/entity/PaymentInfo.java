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
@TableName("t_payment_info")
@ApiModel(value = "PaymentInfo对象", description = "")
public class PaymentInfo extends BaseEntity {

    @ApiModelProperty("商户订单编号")
    @TableField("order_no")
    private String orderNo;

    @ApiModelProperty("支付系统交易编号")
    @TableField("transaction_id")
    private String transactionId;

    @ApiModelProperty("支付类型")
    @TableField("payment_type")
    private String paymentType;

    @ApiModelProperty("交易类型")
    @TableField("trade_type")
    private String tradeType;

    @ApiModelProperty("交易状态")
    @TableField("trade_state")
    private String tradeState;

    @ApiModelProperty("支付金额(分)")
    @TableField("payer_total")
    private Integer payerTotal;

    @ApiModelProperty("通知参数")
    @TableField("content")
    private String content;


}
