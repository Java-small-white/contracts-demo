package com.xiaobai.producer.controller;

import com.alibaba.fastjson.JSONObject;
import com.xiaobai.producer.BaseMock;
import com.xiaobai.producer.ProducerApplication;
import com.xiaobai.producer.model.po.UserPO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.verifier.messaging.boot.AutoConfigureMessageVerifier;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;

//测试的application context会被关闭，同时缓存会清除
@Slf4j
//@ActiveProfiles("contracts")
public class UserControllerTest extends BaseMock {

    @Test
    public void getAll() {
    }

    @Test
    public void getOneUser() throws Exception {
        Thread.sleep(1000000);
    }

    @Test
    public void addOneUser() throws Exception {
        Thread.sleep(20000);
        UserPO po = UserPO.builder().id(99).childName("Kafka").parentName("scala").phone("1316068911").build();
        log.info("用户数据: "+JSONObject.toJSONString(po));
        mockMvc.perform(MockMvcRequestBuilders.post("/user")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(JSONObject.toJSONString(po)))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
        .andReturn();
//        mockMvc.perform(MockMvcRequestBuilders.get("/user/99")
//                .contentType(MediaType.APPLICATION_JSON_UTF8))
//                .andDo(MockMvcResultHandlers.print()).andReturn();
        Thread.sleep(1000000);
    }

    @Test
    public void getOneWithAllCourse() {
    }

    @Test
    public void delete() throws Exception {
        Thread.sleep(10000);
        mockMvc.perform(MockMvcRequestBuilders.delete("/user/1").accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
        Thread.sleep(1000000);
    }
}