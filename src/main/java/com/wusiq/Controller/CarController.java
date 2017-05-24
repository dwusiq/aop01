package com.wusiq.Controller;

import org.springframework.stereotype.Component;

/**
 * 汽车的控制器，实现一个简单的AOP记录日志的功能
 */
@Component
public class CarController {
    public void move(){
        System.out.println("汽车启动了");
    }
}
