package com.xiaobai.consumer.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public JSONObject test(){
        ResponseEntity<JSONObject> response = restTemplate.exchange(
                "http://localhost:10001/user/1",
                HttpMethod.GET,
                null,
                JSONObject.class
        );
        log.info("测试数据:"+ response.getBody().toJSONString());
        return response.getBody();
    }
}
