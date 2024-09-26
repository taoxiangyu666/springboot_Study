package com.txy.mapper;


import com.txy.DynamicDatasourceApplication;
import com.txy.domain.OrdersDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DynamicDatasourceApplication.class)
public class OrderMapperTest {

    @Autowired
    private OrderMapper orderMapper;


    @Test
    public void testSelectById(){
        OrdersDTO order = orderMapper.selectById(1);
        System.out.println(order);
    }

}
