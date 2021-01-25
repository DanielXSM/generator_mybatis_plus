package com.kunchi.tmsprocore.po;

import java.math.BigDecimal;
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
@ApiModel(value="FreightRuleDetailCalc对象", description="")
public class FreightRuleDetailCalc implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "逻辑主键")
    private String uid;

    @ApiModelProperty(value = "计价明细的id")
    private String freightRuleDetailUid;

    @ApiModelProperty(value = "计价方式 1：sequel_calc首续重 2：unit_calc单价3:charter_calc整车")
    private String calcWayCode;

    @ApiModelProperty(value = "计价方式名称")
    private String calcWayName;

    @ApiModelProperty(value = "1：启用  2：未启用")
    private Integer calcStatus;

    @ApiModelProperty(value = "左范围值")
    private BigDecimal leftValue;

    @ApiModelProperty(value = "右范围的值")
    private BigDecimal rightValue;

    @ApiModelProperty(value = "首续重的类型  1：特殊价 2： 首续重价格")
    private String calcType;

    @ApiModelProperty(value = "首续重类类型名称  1：特殊价 2：首续重价")
    private String calcTypeName;

    @ApiModelProperty(value = "首续重的特殊价格")
    private BigDecimal calcSpecialPrice;

    @ApiModelProperty(value = "首重")
    private BigDecimal firstHeavyWeight;

    @ApiModelProperty(value = "首重价格")
    private BigDecimal firstHeavyPrice;

    @ApiModelProperty(value = "续重重量")
    private BigDecimal continueHeavyWeight;

    @ApiModelProperty(value = "续重价格")
    private BigDecimal continueHeavyPrice;

    @ApiModelProperty(value = "最低收费")
    private BigDecimal minCharge;

    @ApiModelProperty(value = "单价")
    private BigDecimal unitPrice;

    @ApiModelProperty(value = "包车价格")
    private BigDecimal packagePrice;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateDate;

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @ApiModelProperty(value = "更新人")
    private String updateBy;


}
