package com.xiaobai.producer.mapper;

import com.xiaobai.producer.model.po.UserPO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

//@Component
public interface UserMapper extends Mapper<UserPO> {

}
