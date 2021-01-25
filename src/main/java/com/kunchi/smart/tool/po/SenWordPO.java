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
 * 敏感词过滤-敏感词及说明
 * </p>
 *
 * @author carrey
 * @since 2020-08-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="SenWord对象", description="敏感词过滤-敏感词及说明")
public class SenWordPO implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "说明/敏感词值")
    private String wordVal;

    @ApiModelProperty(value = "父级id(敏感词所属说明id)")
    private Integer parentId;

    @ApiModelProperty(value = "风险级别编码")
    private String levelCode;

    @ApiModelProperty(value = "类别(1-敏感词;2-说明)")
    private Integer wordType;

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
