package com.txy;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Author : taoxy
 * @Date: 2024/9/13 10:54
 * @Description :
 */
@Component
public class PaySelector {

    @Resource
    private Map<String,Pay> payMap;

    public Pay select(String type){
        Pay pay = payMap.get(type);
        return pay;
    }
}
