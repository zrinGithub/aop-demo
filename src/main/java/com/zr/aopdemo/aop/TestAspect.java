package com.zr.aopdemo.aop;


import com.zr.aopdemo.annotation.A;
import com.zr.aopdemo.annotation.B;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Description:
 *
 * @author zhangr
 * 2020/4/21 14:30
 */
@Aspect
@Component
public class TestAspect {
    @Before("@annotation(com.zr.aopdemo.annotation.B)")
    public void before(){
        System.out.println("before.....");
    }

//    @Around("@annotation(com.zr.aopdemo.annotation.B)")
//    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
//        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
//        Method method = signature.getMethod();
//        B annotation = method.getAnnotation(B.class);
//        System.out.println("Aspect A :" + annotation.name());
//        return joinPoint.proceed();
//    }
}
