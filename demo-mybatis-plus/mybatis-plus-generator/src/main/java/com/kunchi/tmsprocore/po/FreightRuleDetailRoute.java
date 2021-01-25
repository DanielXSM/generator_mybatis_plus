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
@ApiModel(value="FreightRuleDetailRoute对象", description="")
public class FreightRuleDetailRoute implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "逻辑主键id")
    private String uid;

    @ApiModelProperty(value = "计重规则的外键id")
    private String freightRuleDetailUid;

    @ApiModelProperty(value = "1:启用 2：未启用")
    private Integer routeStatus;

    @ApiModelProperty(value = "出发地省编码")
    private String startAddressProvinceCode;

    @ApiModelProperty(value = "出发地省名称")
    private String startAddressProvinceName;

    @ApiModelProperty(value = "出发地市编码")
    private String startAddressCityCode;

    @ApiModelProperty(value = "出发地市名字")
    private String startAddressCityName;

    @ApiModelProperty(value = "出发地区编码")
    private String startAddressAreaCode;

    @ApiModelProperty(value = "出发地区名字")
    private String startAddressAreaName;

    @ApiModelProperty(value = "目的地省编码")
    private String endAddressProvinceCode;

    @ApiModelProperty(value = "目的地省名称")
    private String endAddressProvinceName;

    @ApiModelProperty(value = "目的地市编码")
    private String endAddressCityCode;

    @ApiModelProperty(value = "目的地市名称")
    private String endAddressCityName;

    @ApiModelProperty(value = "目的地区编码")
    private String endAddressAreaCode;

    @ApiModelProperty(value = "目的地区名称")
    private String endAddressAreaName;

    @ApiModelProperty(value = "1：正向插入 2:反向生成 ")
    private Integer positive;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateDate;

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @ApiModelProperty(value = "更新人")
    private String updateBy;


}
