package com.kunchi.smart.tool.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 日志流水表
 * </p>
 *
 * @author carrey
 * @since 2020-08-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="LogOperationResume对象", description="日志流水表")
public class LogOperationResume implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "操作模块")
    private String module;

    @ApiModelProperty(value = "操作模块实体主键")
    private Long moduleEntityId;

    @ApiModelProperty(value = "操作方法名称")
    private String functionName;

    @ApiModelProperty(value = "操作方法参数")
    private String functionParam;

    @ApiModelProperty(value = "操作前的实体json")
    private String beforeEntity;

    @ApiModelProperty(value = "操作后的实体json")
    private String afterEntity;

    @ApiModelProperty(value = "差异描述信息")
    private String differences;

    @ApiModelProperty(value = "状态(0-失败;1-成功)")
    private Boolean status;

    @ApiModelProperty(value = "异常信息")
    private String errorMsg;

    @ApiModelProperty(value = "操作人")
    private String operationBy;

    @ApiModelProperty(value = "操作时间")
    private LocalDateTime operationDate;


}
