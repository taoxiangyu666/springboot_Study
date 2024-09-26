package com.txy.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.txy.constant.DBConstants;
import com.txy.domain.UsersDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author : taoxy
 * @Date: 2024/9/19 9:22
 * @Description :
 */
@Repository
@DS(DBConstants.DATASOURCE_USERS)
public interface UserMapper {

    UsersDTO selectById(@Param("id") Integer id);
}
