package com.txy;

import org.springframework.stereotype.Component;

/**
 * @Author : taoxy
 * @Date: 2024/9/13 10:51
 * @Description :
 */
@Component("sanPay")
public class PayByTestSan implements Pay {
    @Override
    public void PayByType() {
        System.out.println("第三种支付方式");
    }
}
