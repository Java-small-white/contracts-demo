package com.xiaobai.producer.service.impl;

import com.xiaobai.producer.mapper.MiddleUserCourseMapper;
import com.xiaobai.producer.model.po.MiddleUserCoursePO;
import com.xiaobai.producer.service.MiddleUserCourseService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MiddleUserCourseServiceImpl implements MiddleUserCourseService {

    @Resource
    private MiddleUserCourseMapper userCourseMapper;

    @Override
    public List<MiddleUserCoursePO> getOneUserWithAllCourse(Integer userId) {
        Example example = new Example(MiddleUserCoursePO.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("userId",userId);
        return userCourseMapper.selectByExample(criteria);
    }
}
