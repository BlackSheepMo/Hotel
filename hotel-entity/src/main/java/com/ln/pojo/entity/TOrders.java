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
@ApiModel(value="TOrders对象", description="")
public class TOrders implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "预订编号")
      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "预订单号")
    @TableField("ordersNo")
    private String ordersno;

    @ApiModelProperty(value = "预订人账号ID")
    @TableField("accountId")
    private Long accountid;

    @ApiModelProperty(value = "房型编号")
    @TableField("roomTypeId")
    private Integer roomtypeid;

    @ApiModelProperty(value = "房间ID")
    @TableField("roomId")
    private Long roomid;

    @ApiModelProperty(value = "预订人姓名")
    @TableField("reservationName")
    private String reservationname;

    @ApiModelProperty(value = "身份证号码")
    @TableField("idCard")
    private String idcard;

    @ApiModelProperty(value = "电话号码")
    private String phone;

    @ApiModelProperty(value = "状态1-待确认  2-已确认 3-已入住")
    private Integer status;

    @ApiModelProperty(value = "预定时间（创建时间）")
    @TableField("reserveDate")
    private LocalDateTime reservedate;

    @ApiModelProperty(value = "到店时间")
    @TableField("arriveDate")
    private LocalDate arrivedate;

    @ApiModelProperty(value = "离店时间")
    @TableField("leaveDate")
    private LocalDate leavedate;

    @ApiModelProperty(value = "预订价格")
    @TableField("reservePrice")
    private BigDecimal reserveprice;

    @ApiModelProperty(value = "备注")
    private String remark;


}
