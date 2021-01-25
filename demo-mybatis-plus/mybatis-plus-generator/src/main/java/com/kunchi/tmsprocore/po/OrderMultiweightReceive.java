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
 * @since 2020-11-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="OrderMultiweightReceive对象", description="")
public class OrderMultiweightReceive implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String uid;

    @ApiModelProperty(value = "原始单号")
    private String originalOrderNo;

    @ApiModelProperty(value = "称重重量")
    private BigDecimal weight;

    @ApiModelProperty(value = "请求报文")
    private String requestInfo;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;


}
