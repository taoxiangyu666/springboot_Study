package com.txy.springdataredis;

import com.txy.springdataredis.domain.UserCacheObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
class SpringdataredisApplicationTests {

	/**
	 * redisSerializer 主要分为4类
	 * 	1.JDK序列化方式
	 * 	2.String序列化方式
	 * 	3.JSON序列化方式
	 * 	4.XML序列化方式
	 *
	 * 	一般key的序列化和反序列化 是String方式
	 * 	value的序列化和反序列化是自定义实现  业务层手动封装解析反序列化 返回
	 */

	@Autowired
	StringRedisTemplate stringRedisTemplate;

	@Autowired
	RedisTemplate redisTemplate;

	@Test
	void contextLoads() {
		stringRedisTemplate.opsForValue().set("txy_test","test123");
	}

	@Test
	void JdkRedisSerializer() {
		/**
		 * JDK序列化方式 以16进制 （实际就是标志位 + 字符串长度 + 字符串内容）查看不方便 不建议
		 * 默认情况下使用该方式进行序列化  但是不建议
		 */
		redisTemplate.opsForValue().set("txy_test","test123");
		redisTemplate.afterPropertiesSet();
		// key:\xac\xed\x00\x05t\x00\x08txy_test value:\xac\xed\x00\x05t\x00\x07test123

	}


	/**
	 *   GenericJackson2JsonRedisSerializer
	 *
	 * Jackson 序列化过程中怎么保证字符串反序列化成对象的类型呢？
	 * 			会传入一个对象类型（Default Typing） 如果没有传入就会有一个默认类型 该类型就是对象的全类限定名
	 * 			那么在序列化的过程中 会冗余一个类型，这样反序列化的时候就根据类名确定具体的类型
	 *			{
				 "@class": "com.txy.springdataredis.domain.UserCacheObject",
				 "id": 1,
				 "name": "五千万",
				 "gender": 1
	 			}
	 *
	 *
	 */
	@Test
	void JSONRedisSerializer() {
		UserCacheObject userCacheObject = new UserCacheObject();
		userCacheObject.setId(1);
		userCacheObject.setName("五千万");
		userCacheObject.setGender(1);
		String key = String.format("user:%d", userCacheObject.getId());
		//redisTemplate.opsForValue().set(key,userCacheObject);

		Object o = redisTemplate.opsForValue().get(key);
		System.out.println(o);

	}


}
