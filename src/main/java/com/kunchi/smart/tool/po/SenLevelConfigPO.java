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
 * 敏感词过滤-风险级别配置
 * </p>
 *
 * @author carrey
 * @since 2020-08-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SenLevelConfig对象", description="敏感词过滤-风险级别配置")
public class SenLevelConfigPO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "级别编码")
    private String levelCode;

    @ApiModelProperty(value = "级别名称")
    private String levelName;

    @ApiModelProperty(value = "标签显示颜色")
    private String tagColor;

    @ApiModelProperty(value = "标签显示描述")
    private String tagDesc;

    @ApiModelProperty(value = "备注")
    private String remark;

    @ApiModelProperty(value = "启用状态:(0-禁用;1-启用;2-删除;3-待启用)")
    private Integer enableState;

    @ApiModelProperty(value = "创建人")
    private String createBy;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createDate;

    @ApiModelProperty(value = "更新人")
    private String updateBy;

    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateDate;


}
