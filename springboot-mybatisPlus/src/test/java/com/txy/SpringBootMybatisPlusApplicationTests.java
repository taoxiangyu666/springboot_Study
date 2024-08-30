package com.txy;

import com.txy.domain.DataLedgerInfo;
import com.txy.service.DataLedgerInfoService;
import com.txy.service.impl.DataLedgerInfoServiceImpl;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan(value = "com.txy")
class SpringBootMybatisPlusApplicationTests {

	@Autowired
	DataLedgerInfoService dataLedgerInfoService;
	@Test
	void contextLoads() {
		DataLedgerInfo byId = dataLedgerInfoService.getById(1002);
		System.out.println(byId);
	}

}
