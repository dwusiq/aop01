package com.wusiq.test;

import com.wusiq.Controller.CarController;
import com.wusiq.config.javaConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 环绕通知的测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = javaConfig.class)
public class ArroundTest {

    @Test
    public void moveCar(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(javaConfig.class);
        CarController cc = ctx.getBean(CarController.class);
        cc.move();
    }
}
