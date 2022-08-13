package study.aspects.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Order(100)
@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* study.aspects.dao.*.*(..))")   // Logging all public methods in package 'study.aspects.dao'
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("\nLogging Aspect");
        System.out.println("Proxy: " + joinPoint.getThis().getClass().getName());
        System.out.println("Target DAO: " + joinPoint.getTarget().getClass().getName());
        System.out.println("Calling method: " + joinPoint.getSignature().getName());
        System.out.println("Method arguments: " + Arrays.toString(joinPoint.getArgs()));
    }

    @Before("execution(* study.aspects.service.*.*(..))")   // Logging all public methods in package 'study.aspects.service'
    public void logBeforeService(JoinPoint joinPoint) {
        System.out.println("\nLogging Aspect");
        System.out.println("Proxy: " + joinPoint.getThis().getClass().getName());
        System.out.println("Target Service: " + joinPoint.getTarget().getClass().getName());
        System.out.println("Calling method: " + joinPoint.getSignature().getName());
        System.out.println("Method arguments: " + Arrays.toString(joinPoint.getArgs()));
    }
}
