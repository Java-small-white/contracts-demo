package com.xiaobai.producer.model.po;

import lombok.Data;

import java.util.Date;

@Data
public class MessagePO {
    private Integer id;

    private String msg;

    private Date sendTime;
}
