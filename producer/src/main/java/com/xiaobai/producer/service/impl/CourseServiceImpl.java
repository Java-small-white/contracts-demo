package com.xiaobai.producer.service.impl;


import com.xiaobai.producer.mapper.CourseMapper;
import com.xiaobai.producer.model.po.CoursePO;
import com.xiaobai.producer.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class CourseServiceImpl implements CourseService {

    @Resource
    private CourseMapper courseMapper;

    @Override
    public List<CoursePO> getAll() {
        return courseMapper.selectAll();
    }
}
