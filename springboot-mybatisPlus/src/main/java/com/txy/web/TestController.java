package com.txy.web;


import com.txy.domain.DataLedgerInfo;
import com.txy.mapper.DataLedgerInfoMapper;
import com.txy.service.DataLedgerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author : taoxy
 * @Date: 2024/8/30 16:22
 * @Description :
 */
@RestController
public class TestController {

    @Autowired
    DataLedgerInfoService dataLedgerInfoService;
    @Autowired
    DataLedgerInfoMapper mapper;
    @RequestMapping("/test")
    public void test(){


       // List<DataLedgerInfo> list = dataLedgerInfoService.list();
        DataLedgerInfo byId = dataLedgerInfoService.getById(1002L);
        DataLedgerInfo dataLedgerInfo = mapper.selectById(1002L);

        //System.out.println(list);
        System.out.println("test");
    }
}
