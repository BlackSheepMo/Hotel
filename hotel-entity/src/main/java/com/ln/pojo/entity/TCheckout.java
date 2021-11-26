package com.ln.pojo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
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
@ApiModel(value="TCheckout对象", description="")
public class TCheckout implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "编号")
      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "退房记录编号")
    @TableField("checkOutNumber")
    private String checkoutnumber;

    @ApiModelProperty(value = "关联入住ID")
    @TableField("checkInId")
    private Long checkinid;

    @ApiModelProperty(value = "消费金额")
    @TableField("consumePrice")
    private BigDecimal consumeprice;

    @ApiModelProperty(value = "创建时间")
    @TableField("createDate")
    private LocalDateTime createdate;

    @ApiModelProperty(value = "操作人")
    @TableField("createdBy")
    private Integer createdby;

    @ApiModelProperty(value = "备注")
    private String remark;


}
