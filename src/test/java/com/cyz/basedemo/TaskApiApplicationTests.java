package com.cyz.basedemo;

import com.cyz.basedemo.mapper.CyzTaskMapper;
import com.cyz.basedemo.pojo.CyzTask;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author chenyunzhi
 * @date 2023/9/23 14:14
 */
@SpringBootTest
public class TaskApiApplicationTests {
    @Autowired(required=false)
    private CyzTaskMapper cyzTaskMapper;
    @Test
    public void test() {
        System.out.println(("----- selectAll method test ------"));
        List<CyzTask> userList = cyzTaskMapper.selectList(null);
        System.out.println(userList);
    }
}
