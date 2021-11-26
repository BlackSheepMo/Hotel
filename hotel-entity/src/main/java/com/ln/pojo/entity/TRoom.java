package com.ln.pojo.entity;

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
@ApiModel(value="TRoom对象", description="")
public class TRoom implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "编号")
      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "房间标题")
    private String title;

    @ApiModelProperty(value = "房间图片")
    private String photo;

    @ApiModelProperty(value = "房间编号")
    @TableField("roomNum")
    private String roomnum;

    @ApiModelProperty(value = "房型")
    @TableField("roomTypeId")
    private Integer roomtypeid;

    @ApiModelProperty(value = "所属楼层")
    @TableField("floorId")
    private Integer floorid;

    @ApiModelProperty(value = "状态(1-可预订 2-已预订 3-已入住)")
    private Integer status;

    @ApiModelProperty(value = "房间描述")
    @TableField("roomDesc")
    private String roomdesc;

    @ApiModelProperty(value = "要求")
    @TableField("roomRequirement")
    private String roomrequirement;

    @ApiModelProperty(value = "备注")
    private String remark;


}
