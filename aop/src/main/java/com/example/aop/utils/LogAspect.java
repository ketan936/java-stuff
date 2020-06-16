package com.example.aop.utils;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class LogAspect {

    @Before(value = "@annotation(com.example.aop.utils.LogBeforeMethod)")
    public void logStuff(JoinPoint joinPoint) throws Throwable {
        log.error(String.format("monitor.before, class: %s, method: %s", joinPoint.getSignature().getDeclaringType().getSimpleName(), joinPoint.getSignature().getName()));
    }
}
