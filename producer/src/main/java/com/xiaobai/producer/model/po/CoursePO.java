package com.xiaobai.producer.model.po;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * 课程表
 */
@Table(name = "zebraart_course")
@Data
@Builder
public class CoursePO {
    @Id
    private Integer id;

    /**
     * 课程名
     */
    private String courseName;

    /**
     * 课时数,即多少节
     */
    private Integer number;

    //另一种想法： 手动点击。
    /**
     * 课时规则, 多条规则/单或双或每周/星期几/时间(如08:-11)
     */
//    private List<CourseTimePO> timeRoles;

    /**
     * 最大人数
      */
//    private Integer maxNumber;

}
