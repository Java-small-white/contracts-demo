package com.xiaobai.consumer.feigin;

import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient
@AutoConfigureStubRunner(ids = {"com.xiaobai:producer:+:stubs:10001"},stubsMode = StubRunnerProperties.StubsMode.LOCAL)
public interface TestFigin {

    @GetMapping("/user/{id}")
    JSONObject getOneUser(@PathVariable("id") Integer id);
}
