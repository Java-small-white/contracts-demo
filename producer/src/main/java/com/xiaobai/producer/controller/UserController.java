package com.xiaobai.producer.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;

import com.xiaobai.producer.mapper.UserMapper;
import com.xiaobai.producer.model.po.MiddleUserCoursePO;
import com.xiaobai.producer.model.po.UserPO;
import com.xiaobai.producer.service.MiddleUserCourseService;
import com.xiaobai.producer.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    @Resource
    private MiddleUserCourseService userCourseService;

    @GetMapping("")
    public List<UserPO> getAll(@RequestParam(defaultValue = "1") Integer pageNum, @RequestParam(defaultValue = "10") Integer size, Model model) {
        //设置分页信息，分别是当前页数和每页大小
        PageHelper.startPage(pageNum, size);
        List<UserPO> userList = userService.getAll();
        log.info("查询到的数据： " + userService.getAll().toString());
        return userList;
    }

    @GetMapping("/{id}")
    public UserPO getOneUser(@PathVariable("id") Integer id){
        return userMapper.selectByPrimaryKey(id);
//        JSONObject po = new JSONObject();
//        po.put("name","xiaobai");
//        po.put("test","kafka");
//        return po;
    }

    @PostMapping("")
    public void addOneUser(@RequestBody UserPO po){
        userMapper.insert(po);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        userMapper.deleteByPrimaryKey(id);
    }

    /**
     * @param userId
     * @param model
     * @return 该学员的所有课程
     */
    @GetMapping("/course/{userId}")
    public List<MiddleUserCoursePO> getOneWithAllCourse(@PathVariable("userId") Integer userId, Model model) {
        List<MiddleUserCoursePO> list = userCourseService.getOneUserWithAllCourse(userId);
        return list;
    }

}
