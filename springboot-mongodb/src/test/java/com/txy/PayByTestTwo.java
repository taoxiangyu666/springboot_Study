package com.txy;

import org.springframework.stereotype.Component;

/**
 * @Author : taoxy
 * @Date: 2024/9/13 10:52
 * @Description :
 */
@Component("twoPay")
public class PayByTestTwo implements Pay{
    @Override
    public void PayByType() {
        System.out.println("第二种支付方式");
    }
}
