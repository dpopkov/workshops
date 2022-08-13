package study.aspects.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Order(1)
@Aspect
@Component
public class PrimaryAspect {

    @Before("execution(* study.aspects.service.PersonServiceImpl.*(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("\nPrimary Aspect:");
        System.out.println("Proxy: " + joinPoint.getThis().getClass().getName());
        System.out.println("Target: " + joinPoint.getTarget().getClass().getName());
        System.out.println("Calling method: " + joinPoint.getSignature().getName());
        System.out.println("Method arguments: " + Arrays.toString(joinPoint.getArgs()));
    }
}
