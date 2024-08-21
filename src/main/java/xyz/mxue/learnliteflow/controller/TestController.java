package xyz.mxue.learnliteflow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.mxue.learnliteflow.lietflow.executor.TestLiteFlowExecutor;

import javax.annotation.Resource;

@RestController
@RequestMapping("/learnliteflow")
public class TestController {

    @Resource
    private TestLiteFlowExecutor testLiteFlowExecutor;

    @GetMapping
    public String test() {
        System.out.println("进来了");
        testLiteFlowExecutor.testConfig();
        return "test success";
    }
}
