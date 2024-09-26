package com.txy.springdataredis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;

/**
 * @Author : taoxy
 * @Date: 2024/9/26 14:46
 * @Description :
 */
@Configuration
public class RedisConfiguration {
    @Bean
    public RedisTemplate<String,Object> redisTemplate(RedisConnectionFactory connectionFactory){
        //创建redisTemplate对象
        RedisTemplate<String,Object> redisTemplate = new RedisTemplate<>();
        //设置RedisConnect 工厂
        redisTemplate.setConnectionFactory(connectionFactory);
        //设置String 序列化方式 序列化KEY
        redisTemplate.setKeySerializer(RedisSerializer.string());
        //使用JSON序列化方式 序列value
        redisTemplate.setValueSerializer(RedisSerializer.json());

        return redisTemplate;
    }
}
