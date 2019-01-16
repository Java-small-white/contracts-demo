package com.xiaobai.producer.service;


import com.xiaobai.producer.model.po.MiddleUserCoursePO;

import java.util.List;

public interface MiddleUserCourseService {
    /**
     *   返回该学员的所有课程
     * @param userId
     * @return
     */
    List<MiddleUserCoursePO> getOneUserWithAllCourse(Integer userId);
}
