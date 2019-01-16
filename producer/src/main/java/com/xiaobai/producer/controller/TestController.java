package com.xiaobai.producer.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

    @GetMapping("/test1")
    public JSONObject test1(@RequestParam(defaultValue = "0") Integer id){
        JSONObject json = new JSONObject();
        json.put("code",0);
        json.put("id",id+1);
        json.put("msg","success");
        return json;
    }
}
