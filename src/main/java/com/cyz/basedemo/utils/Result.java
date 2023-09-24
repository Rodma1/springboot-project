package com.cyz.basedemo.utils;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author chenyunzhi
 * @date 2023/9/23 17:04
 */

@Data
@AllArgsConstructor
public class Result<T> {

    private boolean success;

    private Integer code;

    private String msg;

    private T data;

    public static Result success(Object data) {
        return new Result(true,200,"success", data);
    }

    // 请求失败
    public  static Result fail(Integer code, String msg) {
        return  new Result(false,code,msg,null);
    }


}
