package com.txy.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.txy.constant.DBConstants;
import com.txy.domain.OrdersDTO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author : taoxy
 * @Date: 2024/9/19 9:22
 * @Description :
 */
@Repository
@DS(DBConstants.DATASOURCE_ORDERS)
public interface OrderMapper {

    OrdersDTO selectById(@Param("id") Integer id);
}
