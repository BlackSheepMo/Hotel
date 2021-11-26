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
@ApiModel(value="SysPermisson对象", description="")
public class SysPermisson implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "权限菜单编号")
      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "父级菜单编号")
    private Integer pid;

    @ApiModelProperty(value = "菜单类型(菜单为menu，权限为permission)")
    private String type;

    @ApiModelProperty(value = "菜单名称")
    private String title;

    @ApiModelProperty(value = "权限编码")
    @TableField("permissionCode")
    private String permissioncode;

    @ApiModelProperty(value = "菜单图标")
    private String icon;

    @ApiModelProperty(value = "菜单地址")
    private String href;

    @ApiModelProperty(value = "是否展开（1-展开 2-折叠）")
    private Integer spread;


}
