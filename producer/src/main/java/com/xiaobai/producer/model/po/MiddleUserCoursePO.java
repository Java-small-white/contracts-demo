package com.xiaobai.producer.model.po;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 中间表-学员&课程
 */
@Table(name = "zebraart_user_course")
@Data
@Builder
public class MiddleUserCoursePO {
    @Id
    private Integer id;

    /**
     * 学员ID
     */
    private Integer userId;

    /**
     * 课程ID
     */
    private Integer courseId;
    /**
     * 剩余课时
     */
    private Integer number;
    /**
     * 标识, 0表示删除。
     */
    @Builder.Default
    private Integer deleteFlag = 1;
}
