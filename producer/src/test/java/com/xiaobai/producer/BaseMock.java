package com.xiaobai.producer;

import com.xiaobai.producer.controller.UserController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProducerApplication.class,webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
//测试的application context会被关闭，同时缓存会清除
@DirtiesContext
@AutoConfigureMessageVerifier
public class BaseMock {

    @Autowired
    private WebApplicationContext context;

//    @Autowired
//    private UserController userController;

    public MockMvc mockMvc;

    @Before
    public void setUp() {
//        StandaloneMockMvcBuilder builder = MockMvcBuilders.standaloneSetup(userController);
//        RestAssuredMockMvc.standaloneSetup(userController);
        //使用上下文构建mockMvc
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
        RestAssuredMockMvc.webAppContextSetup(context);
    }
}

