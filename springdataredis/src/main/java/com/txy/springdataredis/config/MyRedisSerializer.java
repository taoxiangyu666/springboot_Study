package com.txy.springdataredis.config;

import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

/**
 * @Author : taoxy
 * @Date: 2024/9/26 15:21
 * @Description :
 */
public class MyRedisSerializer implements RedisSerializer<Object>{

  /*  private final static ParserConfig defaultRedisConfig = new ParserConfig();
    static { defaultRedisConfig.setAutoTypeSupport(true);}*/
    //序列化
    @Override
    public byte[] serialize(Object o) throws SerializationException {
        return new byte[0];
    }


    //反序列化
    @Override
    public Object deserialize(byte[] bytes) throws SerializationException {
        return null;
    }
}
