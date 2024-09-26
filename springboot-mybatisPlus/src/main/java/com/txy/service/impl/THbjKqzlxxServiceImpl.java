package com.txy.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.txy.domain.THbjKqzlxx;
import com.txy.mapper.THbjKqzlxxMapper;
import com.txy.service.THbjKqzlxxService;
import org.springframework.stereotype.Service;

/**
 * @Author : taoxy
 * @Date: 2024/9/18 14:48
 * @Description :
 */
@Service
@DS("slave")
public class THbjKqzlxxServiceImpl extends ServiceImpl<THbjKqzlxxMapper,THbjKqzlxx> implements THbjKqzlxxService {
}
