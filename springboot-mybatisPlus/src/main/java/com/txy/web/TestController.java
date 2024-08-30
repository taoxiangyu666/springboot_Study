package com.txy.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : taoxy
 * @Date: 2024/8/30 16:22
 * @Description :
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public void test(){
        System.out.println("test");
    }
}
