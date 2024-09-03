package com.txy.config;


/**
 * @Author : taoxy
 * @Date: 2024/9/3 9:03
 * @Description : 数据源上下文
 */
public class DataSourceContextHolder {
    private static final ThreadLocal<String> contexHolder = new ThreadLocal<>();

    public static String getDataSourceType(){
        return contexHolder.get();
    }

    public static  void setDataSourceType(String dataSourceType){
        contexHolder.set(dataSourceType);
    }

    public static void cleanDataSourceType(){
        contexHolder.remove();
    }
}
