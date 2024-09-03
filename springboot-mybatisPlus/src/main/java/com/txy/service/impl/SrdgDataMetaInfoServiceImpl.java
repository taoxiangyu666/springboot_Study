package com.txy.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.txy.domain.SrdgDataMetaInfo;
import com.txy.mapper.SrdgDataMetaInfoMapper;
import com.txy.service.SrdgDataMetaInfoService;
import org.springframework.stereotype.Service;

/**
 * 数据台账表
 *
 * @author itar
 * @email wuhandzy@gmail.com
 * @date 2024-08-30 09:48:39
 * @since jdk 1.8
 */
@Service("srdgDataMetaInfoService")
public class SrdgDataMetaInfoServiceImpl extends ServiceImpl<SrdgDataMetaInfoMapper,SrdgDataMetaInfo> implements SrdgDataMetaInfoService {
}
