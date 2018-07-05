package com.zk.web;

import com.zk.model.Test;
import com.zk.service.TestService;
import com.zk.vo.ResponseVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
@Api("服务提供者借口")
public class TestController {

    @Resource
    private TestService testService;

    @ApiOperation("获取测试信息")
    @GetMapping("/getTestInfo/{testId}")
    //@GetMapping(Urls.Test.GET_TEST_INFO)
    public ResponseVo<Test> getTestInfo(@PathVariable Long testId) {
        Test test = testService.getTestInfo(testId);
        return new ResponseVo<>(test);
    }

}

