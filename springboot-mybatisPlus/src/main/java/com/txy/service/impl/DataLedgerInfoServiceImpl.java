package com.txy.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.txy.domain.DataLedgerInfo;
import com.txy.mapper.DataLedgerInfoMapper;
import com.txy.service.DataLedgerInfoService;
import org.springframework.stereotype.Service;

/**
 * 数据台账表
 *
 * @author itar
 * @email wuhandzy@gmail.com
 * @date 2024-08-30 09:48:39
 * @since jdk 1.8
 */
@Service("dataLedgerInfoService")
@DS("slave")
public class DataLedgerInfoServiceImpl extends ServiceImpl<DataLedgerInfoMapper,DataLedgerInfo> implements DataLedgerInfoService {
}
