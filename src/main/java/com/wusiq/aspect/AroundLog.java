package com.wusiq.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 记录汽车日志的环绕通知切面
 */
@Aspect
public class AroundLog {
    private static Logger log =null;

    //定义切点
    @Pointcut("execution(** com.wusiq.Controller.CarController.move(..))")
    public void aroundMove(){}

    //环绕通知
    @Around("aroundMove()")
    public void logMove(ProceedingJoinPoint pj){
            log =  LoggerFactory.getLogger(pj.getTarget().getClass());
        try {
            log.info("汽车启动前，请插入钥匙");
            pj.proceed();
            log.info("汽车成功启动，请注意驾驶");
        } catch (Throwable throwable) {
            log.warn("汽车启动失败，请维修汽车！");
        }


    }
}
