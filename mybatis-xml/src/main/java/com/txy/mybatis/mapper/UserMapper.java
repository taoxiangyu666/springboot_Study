package com.txy.mybatis.mapper;


import com.txy.mybatis.domain.UserDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

/**
 * @Author : taoxy
 * @Date: 2024/9/20 16:26
 * @Description :
 */
@Repository
public interface UserMapper {
    List<UserDTO> findAll();

    int insert(UserDTO userDTO);

    UserDTO findById(@Param("id") String id);

    int deleteById(@Param("id") String id);

    List<UserDTO> selectByIds(@Param("ids") Collection<Integer> ids);

}
