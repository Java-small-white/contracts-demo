package com.xiaobai.producer.model.po;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 学员表
 */
@Table(name = "zebraart_user")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserPO {
    @Id
    private Integer id;

    /**
     * 学员姓名
     */
    private String childName;

    /**
     * 家长姓名
     */
    private String parentName;
    /**
     * 家长电话
     */
    private String phone;

}
