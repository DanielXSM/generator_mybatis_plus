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
 * 运单（结算运单）表
 * </p>
 *
 * @author dongping
 * @since 2020-09-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SettlementOrder对象", description="运单（结算运单）表")
public class SettlementOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "物理主键ID")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "结算运单号")
    private String settlementOrderNo;

    @ApiModelProperty(value = "合单条件Key，根据合单条件计算的MD5大写'")
    private String mergeKey;

    @ApiModelProperty(value = "对方运单号")
    private String oppositeOrderNo;

    @ApiModelProperty(value = "物流组织编码")
    private String logisticsOrganizationCode;

    @ApiModelProperty(value = "物流组织名称")
    private String logisticsOrganizationName;

    @ApiModelProperty(value = "结算承运商编码")
    private String settlementCarrierCode;

    @ApiModelProperty(value = "结算承运商名称")
    private String settlementCarrierName;

    @ApiModelProperty(value = "运输方式 1：EXPRESS快递，2;ROAD_retail公路零担：3：ROAD_carload公路整车 4:road_mix公路零担、整车组合")
    private String shippingWayCode;

    @ApiModelProperty(value = "运输方式 1：EXPRESS快递，2;ROAD_retail公路零担：3：ROAD_carload公路整车 4:road_mix公路零担、整车组合")
    private String shippingWayName;

    @ApiModelProperty(value = "运输车型code")
    private String shippingModelCode;

    @ApiModelProperty(value = "运输车型的名字运输车型；general普通车、refrigeration 冷冻车、hazardous 危险品车")
    private String shippingModelName;

    @ApiModelProperty(value = "发货地址省编码")
    private String shipperProvinceCode;

    @ApiModelProperty(value = "发货地址省名称")
    private String shipperProvinceName;

    @ApiModelProperty(value = "发货地址市编码")
    private String shipperCityCode;

    @ApiModelProperty(value = "发货地址市名称")
    private String shipperCityName;

    @ApiModelProperty(value = "发货地址区编码")
    private String shipperDistrictCode;

    @ApiModelProperty(value = "发货地址区名称")
    private String shipperDistrictName;

    @ApiModelProperty(value = "发货地址")
    private String shipperAddress;

    @ApiModelProperty(value = "收货地址省编码")
    private String receiveProvinceCode;

    @ApiModelProperty(value = "收货地址省名称")
    private String receiveProvinceName;

    @ApiModelProperty(value = "收货地址市编码")
    private String receiveCityCode;

    @ApiModelProperty(value = "收货地址市名称")
    private String receiveCityName;

    @ApiModelProperty(value = "收货地址区编码")
    private String receiveDistrictCode;

    @ApiModelProperty(value = "收货地址区名称")
    private String receiveDistrictName;

    @ApiModelProperty(value = "收货地址")
    private String receiveAddress;

    @ApiModelProperty(value = "是否自有仓调拨")
    private Boolean isOwned;

    @ApiModelProperty(value = "业务日期")
    private LocalDateTime businessTime;

    @ApiModelProperty(value = "计费规则UID，可能有多个，用逗号分隔")
    private String freightRuleUid;

    @ApiModelProperty(value = "计费规则ID+版本号，可能有多个，用逗号分隔")
    private String freightRuleCodeVersion;

    @ApiModelProperty(value = "重量")
    private BigDecimal weight;

    @ApiModelProperty(value = "体积")
    private BigDecimal volume;

    @ApiModelProperty(value = "计费重量")
    private BigDecimal billingWeight;

    @ApiModelProperty(value = "运费是否已计算")
    private Boolean calculated;

    @ApiModelProperty(value = "运费")
    private BigDecimal logisticsFee;

    @ApiModelProperty(value = "总运杂费")
    private BigDecimal totalMiscellaneousFee;

    @ApiModelProperty(value = "多次配送费")
    private BigDecimal multipleDeliveryFee;

    @ApiModelProperty(value = "贴码费")
    private BigDecimal labelingFee;

    @ApiModelProperty(value = "等待费")
    private BigDecimal waitingFee;

    @ApiModelProperty(value = "卸货费")
    private BigDecimal unloadingFee;

    @ApiModelProperty(value = "保价费")
    private BigDecimal premiumFee;

    @ApiModelProperty(value = "上楼费")
    private BigDecimal upstairsFee;

    @ApiModelProperty(value = "其他费用")
    private BigDecimal otherFee;

    @ApiModelProperty(value = "其他费用说明")
    private String otherFeeExplain;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "运单异常编码")
    private String exceptionCode;

    @ApiModelProperty(value = "运单异常名称")
    private String exceptionName;

    @ApiModelProperty(value = "币种码值")
    private String currencyTypeCode;

    @ApiModelProperty(value = "运单状态编码")
    private String statusCode;

    @ApiModelProperty(value = "运单状态名称")
    private String statusName;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateDate;

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @ApiModelProperty(value = "更新人")
    private String updateBy;


}
