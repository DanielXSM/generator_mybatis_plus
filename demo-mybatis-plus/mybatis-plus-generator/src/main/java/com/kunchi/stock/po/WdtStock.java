package com.kunchi.stock.po;

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
 * 旺店通库存表
 * </p>
 *
 * @author dongping
 * @since 2020-12-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="WdtStock对象", description="旺店通库存表")
public class WdtStock implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增主键")
    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

    @ApiModelProperty(value = "单品主键id")
    private Integer specId;

    @ApiModelProperty(value = "nc库存组织编码")
    private String ncOrgNo;

    @ApiModelProperty(value = "nc逻辑仓编码")
    private String logicWarehouseNo;

    @ApiModelProperty(value = "代表SPU所有属性的唯一编号，用于系统货品的区分")
    private String goodsNo;

    @ApiModelProperty(value = "品牌编号")
    private String brandNo;

    @ApiModelProperty(value = "品牌名称，ERP版本V2.3.8.4及以上才可返回")
    private String brandName;

    @ApiModelProperty(value = "货品名称")
    private String goodsName;

    @ApiModelProperty(value = "代表单品（SKU）所有属性的唯一编号，用于系统单品的区分")
    private String specNo;

    @ApiModelProperty(value = "规格名称")
    private String specName;

    @ApiModelProperty(value = "规格码")
    private String specCode;

    @ApiModelProperty(value = "条形码")
    private String barcode;

    @ApiModelProperty(value = "仓库主键id")
    private Integer warehouseId;

    @ApiModelProperty(value = "代表仓库所有属性的唯一编码，用于仓库区分，ERP内支持自定义（ERP仓库界面设置）")
    private String warehouseNo;

    @ApiModelProperty(value = "仓库名称")
    private String warehouseName;

    @ApiModelProperty(value = "仓库类型0为普通,非0为外部WMS")
    private Integer warehouseType;

    @ApiModelProperty(value = "库存量")
    private BigDecimal stockNum;

    @ApiModelProperty(value = "锁定量")
    private BigDecimal lockNum;

    @ApiModelProperty(value = "未付款量")
    private BigDecimal unpayNum;

    @ApiModelProperty(value = "预订单量")
    private BigDecimal subscribeNum;

    @ApiModelProperty(value = "待审核量")
    private BigDecimal orderNum;

    @ApiModelProperty(value = "待发货量")
    private BigDecimal sendingNum;

    @ApiModelProperty(value = "采在途量")
    private BigDecimal purchaseNum;

    @ApiModelProperty(value = "调拨在途量")
    private BigDecimal transferNum;

    @ApiModelProperty(value = "待调拨量")
    private BigDecimal toTransferNum;

    @ApiModelProperty(value = "待采购量")
    private BigDecimal toPurchaseNum;

    @ApiModelProperty(value = "采购到货量")
    private BigDecimal purchaseArriveNum;

    @ApiModelProperty(value = "采购退货量")
    private BigDecimal returnNum;

    @ApiModelProperty(value = "采购换货量")
    private BigDecimal returnExchNum;

    @ApiModelProperty(value = "采购换货在途量")
    private BigDecimal returnOnwayNum;

    @ApiModelProperty(value = "销售退货量")
    private BigDecimal refundNum;

    @ApiModelProperty(value = "生产在途量")
    private BigDecimal processOnwayNum;

    @ApiModelProperty(value = "销售退货在途量")
    private BigDecimal refundOnwayNum;

    @ApiModelProperty(value = "部分付款库存")
    private BigDecimal partPaidNum;

    @ApiModelProperty(value = "负库存出库量")
    private BigDecimal negStockoutNum;

    @ApiModelProperty(value = "今日销量")
    private BigDecimal todayNum;

    @ApiModelProperty(value = "警戒库存")
    private BigDecimal safeStock;

    @ApiModelProperty(value = "单品在外部WMS中的编码，如在物流宝仓库中主键")
    private String specWhNo;

    @ApiModelProperty(value = "外部WMS同步时库存")
    private BigDecimal wmsSyncStock;

    @ApiModelProperty(value = "外部WMS同步时占用库存")
    private BigDecimal wmsPreemptyStock;

    @ApiModelProperty(value = "外部WMS同步时,与系统库存的差")
    private BigDecimal wmsStockDiff;

    @ApiModelProperty(value = "与外部WMS同步时间wms_sync_stock-stock_num  格式：yyyy-MM-dd HH:mm:ss")
    private LocalDateTime wmsSyncTime;

    @ApiModelProperty(value = "成本价")
    private BigDecimal costPrice;

    @ApiModelProperty(value = "重量")
    private BigDecimal weight;

    @ApiModelProperty(value = "商品图片url")
    private String imgUrl;

    @ApiModelProperty(value = "最后修改时间，格式：yyyy-MM-dd HH:mm:ss")
    private LocalDateTime modified;

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "更新人")
    private String updateBy;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateDate;


}
