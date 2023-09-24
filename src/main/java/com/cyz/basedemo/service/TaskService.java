package com.cyz.basedemo.service;

import com.cyz.basedemo.pojo.CyzTask;

import java.util.List;

/**
 * @author chenyunzhi
 * @date 2023/9/23 17:04
 */
public interface TaskService {
    /**
     * 获取任务列表
     * @return
     */
    List<CyzTask> listTask();
}
