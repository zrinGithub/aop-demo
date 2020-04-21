package com.zr.aopdemo.annotation;

import java.lang.annotation.*;

/**
 * Description:
 *
 * @author zhangr
 * 2020/4/21 13:58
 */
@Inherited
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface A {
    String name() default "A";
}
