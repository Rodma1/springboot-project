package com.cyz.basedemo.service.impl;

import com.cyz.basedemo.mapper.CyzTaskMapper;
import com.cyz.basedemo.pojo.CyzTask;
import com.cyz.basedemo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chenyunzhi
 * @date 2023/9/23 17:10
 */
@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private CyzTaskMapper cyzTaskMapper;

    @Override
    public List<CyzTask> listTask() {
        return cyzTaskMapper.selectList(null);
    }
}
