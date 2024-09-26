package com.txy;


import com.txy.mybatis.domain.UserDTO;
import com.txy.mybatis.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(classes = MybatisXmlApplication.class)
class MybatisXmlApplicationTests {

	@Autowired
	private UserMapper mapper;

	@Test
	void contextLoads() {
		UserDTO byId = mapper.findById("0180c2e6-235f-11ed-9824-be2bf2431ac9");

		/*for (int i = 1; i < 11; i++) {
			UserDTO userDTO = new UserDTO();
			userDTO.setUid(String.valueOf(i));
			userDTO.setAccount("124"+i);
			userDTO.setName("测试"+i);
			userDTO.setPhone("12345679");
			userDTO.setEmail("12345679@qq.com");
			mapper.insert(userDTO);
		}*/

		List<UserDTO> all = mapper.findAll();

		int i = mapper.deleteById("1");
	}

}
