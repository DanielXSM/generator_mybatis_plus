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
@ApiModel(value="FreightRuleDetail对象", description="")
public class FreightRuleDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "uid")
    private String uid;

    @ApiModelProperty(value = "关联主表id")
    private String freightRuleUid;

    @ApiModelProperty(value = "原寄地省份编码")
    private String originalSendProvinceCode;

    @ApiModelProperty(value = "原寄地市编码")
    private String originalSendCityCode;

    @ApiModelProperty(value = "原寄地址的省份名称")
    private String originalSendProvinceName;

    @ApiModelProperty(value = "原寄地址的城市的名称")
    private String originalSendCityName;

    @ApiModelProperty(value = "目的地址的描述信息")
    private String destinationAddressDesc;

    @ApiModelProperty(value = "适用供应商，对照之后的")
    private String supplierCode;

    @ApiModelProperty(value = "适用供应商客户的名字")
    private String supplierName;

    @ApiModelProperty(value = "适用自有仓调拨,生成单向 1： 是  2:不是")
    private Integer selfTransfers;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateDate;

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @ApiModelProperty(value = "更新人")
    private String updateBy;


}
