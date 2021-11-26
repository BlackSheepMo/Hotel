package com.ln.pojo.entity;

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
@ApiModel(value="SysUser对象", description="")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户编号")
      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户名")
    @TableField("userName")
    private String username;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "真实姓名	")
    @TableField("realName")
    private String realname;

    @ApiModelProperty(value = "性别（1-男 2-女）")
    private Integer sex;

    @ApiModelProperty(value = "所属部门，对应部门表主键")
    @TableField("deptId")
    private Integer deptid;

    @ApiModelProperty(value = "状态（1-可用 2-禁用）")
    private Integer status;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "电话")
    private String phone;

    @ApiModelProperty(value = "用户类型（1-超级管理员 2-普通用户）")
    @TableField("userType")
    private Integer usertype;

    @ApiModelProperty(value = "入职日期")
    @TableField("hireDate")
    private LocalDateTime hiredate;

    @ApiModelProperty(value = "创建人")
    @TableField("createdBy")
    private Integer createdby;

    @ApiModelProperty(value = "创建时间")
    @TableField("createDate")
    private LocalDateTime createdate;

    @ApiModelProperty(value = "修改人")
    @TableField("modifyBy")
    private Integer modifyby;

    @ApiModelProperty(value = "修改时间")
    @TableField("modifyDate")
    private LocalDateTime modifydate;

    @ApiModelProperty(value = "备注")
    private String remark;


}
