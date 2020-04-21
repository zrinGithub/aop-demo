package com.zr.aopdemo.annotation;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.lang.reflect.Method;

/**
 * Description:
 *
 * @author zhangr
 * 2020/4/21 13:57
 */

@RestController
public class TestAspectController {
    @Resource
    private TestService testService;

    @GetMapping("testAspect")
    public void testAspect() throws Exception {
        //调用切面方法
        testService.test();

        //直接通过cglib代理类拿不到注解
//        Method testMethod = testService.getClass().getMethod("test");
//        A annotation = testMethod.getAnnotation(A.class);
//        B annotation1 = testMethod.getAnnotation(B.class);
//        System.out.println(annotation.name());
//        System.out.println(annotation1.name());
        //方法一：使用类来获取
//        String name = TestService.class.getMethod("test").getAnnotation(A.class).name();
//        System.out.println(name);
        //方法二：使用spring工具类AnnotationUtils.findAnnotation
        //方法三：使用jdk动态代理
        //方法四：加@Inherited，因为cglibs使用的是子类，不过这个只对类有帮助，方法还是会报错
        //https://stackoverflow.com/questions/1706751/retain-annotations-on-cglib-proxies
    }

}
