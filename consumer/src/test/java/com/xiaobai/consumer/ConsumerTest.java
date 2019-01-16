package com.xiaobai.consumer;

import com.alibaba.fastjson.JSONObject;
import com.xiaobai.consumer.feigin.TestFigin;
import lombok.extern.slf4j.Slf4j;
import org.hamcrest.core.Is;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConsumerApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//初始化测试配置,测试controller需要
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
@AutoConfigureStubRunner(ids = {"com.xiaobai:producer:+:stubs:10001"},stubsMode = StubRunnerProperties.StubsMode.LOCAL)
@Slf4j
public class ConsumerTest {
    @Autowired
    private RestTemplate restTemplate;

//    @Autowired
//    private MockMvc mockMvc;

//    @Test
//    public void testMethod() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/user/1"))
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andExpect(MockMvcResultMatchers.jsonPath("id", Is.is(0)));
//    }

    @Test
    public void testMethod() throws Exception {

        ResponseEntity<JSONObject> response = restTemplate.exchange(
                "http://localhost:10001/user/1",
                HttpMethod.GET,
                null,
                JSONObject.class
        );
        log.info("测试数据:"+ response.getBody().toJSONString());
    }
}
