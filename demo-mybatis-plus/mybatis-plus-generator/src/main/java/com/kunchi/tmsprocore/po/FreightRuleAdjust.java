package com.kunchi.tmsprocore.po;

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
 * 
 * </p>
 *
 * @author dongping
 * @since 2020-09-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="FreightRuleAdjust对象", description="")
public class FreightRuleAdjust implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "逻辑自增主键")
    private String uid;

    @ApiModelProperty(value = "规则调整单号，生生时间戳+随机数")
    private String ruleAdjustOrderNo;

    @ApiModelProperty(value = "计费规则id")
    private String freightRuleUid;

    @ApiModelProperty(value = "规则编码，规则调整单号")
    private String ruleCode;

    @ApiModelProperty(value = "调整后的版本号")
    private String adjustRuleVersion;

    @ApiModelProperty(value = "调整后的规则的uid")
    private String newFreightRuleUid;

    @ApiModelProperty(value = "1:未调整  2：已经调整")
    private Integer adjustStatus;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateDate;

    @ApiModelProperty(value = "创建人")
    private String createBy;


}
