package com.cyz.basedemo.controll.domin;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author chenyunzhi
 * @date 2023/9/23 17:15
 */

@Data
@ApiModel("任务实体类")
public class CyzTaskVo {

    private Integer id;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    @ApiModelProperty("任务内容")
    private String content;

    @ApiModelProperty("任务标题")
    private String title;
}
