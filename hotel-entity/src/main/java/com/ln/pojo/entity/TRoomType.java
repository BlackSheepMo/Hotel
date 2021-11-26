package com.ln.pojo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="TRoomType对象", description="")
public class TRoomType implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "房型编号")
      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "房型名称")
    @TableField("typeName")
    private String typename;

    @ApiModelProperty(value = "房型图片")
    private String photo;

    @ApiModelProperty(value = "参考价格")
    private BigDecimal price;

    @ApiModelProperty(value = "可入住人数")
    @TableField("liveNum")
    private Integer livenum;

    @ApiModelProperty(value = "床位数")
    @TableField("bedNum")
    private Integer bednum;

    @ApiModelProperty(value = "房间数量")
    @TableField("roomNum")
    private Integer roomnum;

    @ApiModelProperty(value = "已预定数量")
    @TableField("reservedNum")
    private Integer reservednum;

    @ApiModelProperty(value = "可住房间数")
    @TableField("avilableNum")
    private Integer avilablenum;

    @ApiModelProperty(value = "已入住数量")
    @TableField("livedNum")
    private Integer livednum;

    @ApiModelProperty(value = "房型状态（1-可预订 2-房型已满）")
    private Integer status;

    @ApiModelProperty(value = "备注")
    private String remark;


}
