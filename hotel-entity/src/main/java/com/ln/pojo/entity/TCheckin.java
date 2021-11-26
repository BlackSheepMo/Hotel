package com.ln.pojo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author zxg
 * @since 2021-11-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TCheckin对象", description="")
public class TCheckin implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "编号")
      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "所属房型")
    @TableField("roomTypeId")
    private Integer roomtypeid;

    @ApiModelProperty(value = "所属房间")
    @TableField("roomId")
    private Long roomid;

    @ApiModelProperty(value = "入住人姓名")
    @TableField("customerName")
    private String customername;

    @ApiModelProperty(value = "入住人身份证号")
    @TableField("idCard")
    private String idcard;

    @ApiModelProperty(value = "手机号")
    private String phone;

    @ApiModelProperty(value = "入住日期")
    @TableField("arriveDate")
    private LocalDate arrivedate;

    @ApiModelProperty(value = "离店日期")
    @TableField("leaveDate")
    private LocalDate leavedate;

    @ApiModelProperty(value = "实付金额")
    @TableField("payPrice")
    private BigDecimal payprice;

    @ApiModelProperty(value = "关联预订订单ID")
    @TableField("ordersId")
    private Long ordersid;

    @ApiModelProperty(value = "状态（1-入住中  2-已离店）")
    private Integer status;

    @ApiModelProperty(value = "创建时间")
    @TableField("createDate")
    private LocalDateTime createdate;

    @ApiModelProperty(value = "创建人")
    @TableField("createdBy")
    private Integer createdby;

    @ApiModelProperty(value = "修改时间")
    @TableField("modifyDate")
    private LocalDateTime modifydate;

    @ApiModelProperty(value = "修改人")
    @TableField("modifyBy")
    private Integer modifyby;

    @ApiModelProperty(value = "备注")
    private String remark;


}
