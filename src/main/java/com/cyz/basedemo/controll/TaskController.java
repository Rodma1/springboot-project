package com.cyz.basedemo.controll;

import cn.hutool.core.bean.BeanUtil;
import com.cyz.basedemo.controll.domin.CyzTaskVo;
import com.cyz.basedemo.pojo.CyzTask;
import com.cyz.basedemo.service.TaskService;
import com.cyz.basedemo.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chenyunzhi
 * @date 2023/9/23 17:14
 */
@RestController
@RequestMapping("/task")
@Api(tags= "任务接口")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/taskList")
    @ApiOperation("获取任务列表")
    public Result<List<CyzTaskVo>> listTask() {
        List<CyzTask> cyzTasks = taskService.listTask();
        return Result.success(BeanUtil.copyToList(cyzTasks, CyzTaskVo.class));
    }
}
