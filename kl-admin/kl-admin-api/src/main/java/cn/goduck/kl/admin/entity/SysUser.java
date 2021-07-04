package cn.goduck.kl.admin.entity;

import cn.goduck.kl.common.core.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Desc: 用户信息表
 * Author: Kon
 * Date: 2021/6/24 15:39
 */
@ApiModel(value="cn-goduck-kl-admin-entity-SysUser")
@Data
@EqualsAndHashCode(callSuper=true)
@TableName(value = "sys_user")
public class SysUser extends BaseEntity {
    /**
     * 部门id
     */
    @TableField(value = "dept_id")
    @ApiModelProperty(value="部门id")
    private Long deptId;

    /**
     * 用户名
     */
    @TableField(value = "username")
    @ApiModelProperty(value="用户名")
    private String username;

    /**
     * 昵称
     */
    @TableField(value = "nickname")
    @ApiModelProperty(value="昵称")
    private String nickname;

    /**
     * 性别（0女 1男 2未知）
     */
    @TableField(value = "gender")
    @ApiModelProperty(value="性别（0女 1男 2未知）")
    private Integer gender;

    /**
     * 密码
     */
    @TableField(value = "`password`")
    @ApiModelProperty(value="密码")
    private String password;

    /**
     * 用户头像
     */
    @TableField(value = "avatar")
    @ApiModelProperty(value="用户头像")
    private String avatar;

    /**
     * 联系方式
     */
    @TableField(value = "mobile")
    @ApiModelProperty(value="联系方式")
    private String mobile;

    /**
     * 用户邮箱
     */
    @TableField(value = "email")
    @ApiModelProperty(value="用户邮箱")
    private String email;

    /**
     * 用户状态（0正常 1禁用）
     */
    @TableField(value = "`status`")
    @ApiModelProperty(value="用户状态（0正常 1禁用）")
    private Boolean status;

    /**
     * 删除标识（0未删除 1已删除）
     */
    @TableLogic
    @TableField(value = "deleted")
    @ApiModelProperty(value="删除标识（0未删除 1已删除）")
    private Boolean deleted;
}