package com.cyz.basedemo.pojo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author chenyunzhi
 * @date 2023/9/23 14:12
 */
@Data
public class CyzTask {

    private Integer id;

    private Date createTime;

    private Date updateTime;

    private String content;

    private String title;
}
