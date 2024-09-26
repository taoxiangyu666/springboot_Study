package com.txy;

import org.springframework.stereotype.Component;

/**
 * @Author : taoxy
 * @Date: 2024/9/13 10:51
 * @Description :
 */
@Component("onePay")
public class PayByTestOne implements Pay {
    @Override
    public void PayByType() {
        System.out.println("第一种支付方式");
    }
}
