package com.xiaobai.producer.model.po;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "zebraart_coures_time")
@Data
@Builder
public class CourseTimePO {
    @Id
    private int id;

    /**
     * 课程ID
     */
    private int courseID;

    /**
     * 每周/单周/双周
     */
    private String  weekly;
    /**
     * 星期几 1-7
     */
    private int week;

    /**
     * 上课时间
     */
    @JSONField(format = "HH:mm")
    private Date openTime;

    /**
     * 下课时间
     */
    @JSONField(format = "HH:mm")
    private Date closeTime;
}
