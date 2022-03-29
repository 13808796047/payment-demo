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
@TableName("t_refund_info")
@ApiModel(value = "RefundInfo对象", description = "")
public class RefundInfo extends BaseEntity {

    @ApiModelProperty("商户订单编号")
    @TableField("order_no")
    private String orderNo;

    @ApiModelProperty("商户退款单编号")
    @TableField("refund_no")
    private String refundNo;

    @ApiModelProperty("支付系统退款单号")
    @TableField("refund_id")
    private String refundId;

    @ApiModelProperty("原订单金额(分)")
    @TableField("total_fee")
    private Integer totalFee;

    @ApiModelProperty("退款金额(分)")
    @TableField("refund")
    private Integer refund;

    @ApiModelProperty("退款原因")
    @TableField("reason")
    private String reason;

    @ApiModelProperty("退款状态")
    @TableField("refund_status")
    private String refundStatus;

    @ApiModelProperty("申请退款返回参数")
    @TableField("content_return")
    private String contentReturn;

    @ApiModelProperty("退款结果通知参数")
    @TableField("content_notify")
    private String contentNotify;


}
