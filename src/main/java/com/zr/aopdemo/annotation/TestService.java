package com.zr.aopdemo.annotation;

import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @author zhangr
 * 2020/4/21 15:23
 */
@Service
public class TestService {
    @A(name = "JACK")
    @B(name = "api")
    public void test() {
        System.out.println("test");
    }
}
