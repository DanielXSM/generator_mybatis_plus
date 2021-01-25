package com.kunchi.tmsprocore.po;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 邮件发送地址列表
 * </p>
 *
 * @author dongping
 * @since 2020-10-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="EmailList对象", description="邮件发送地址列表")
public class EmailList implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "邮箱地址，尽量写邮件列表地址，避免邮箱失效导致发送失败")
    private String email;

    @ApiModelProperty(value = "是否可用（A可用，P不可用）")
    private String sts;

    @ApiModelProperty(value = "通知类型")
    private Integer notifyType;

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "更新人")
    private String updateBy;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateDate;


}
