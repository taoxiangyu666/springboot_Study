package com.txy.config;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Author : taoxy
 * @Date: 2024/9/3 9:01
 * @Description : 创建一个动态数据源类来决定使用哪个数据源
 */

public class DynamicDataSource extends AbstractRoutingDataSource{
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDataSourceType();
    }
}
