package study.aspects.aop;

import org.aspectj.lang.JoinPoint;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SimpleAopInvocationHandler implements InvocationHandler {
    private final Object target;
    private final LoggingAspect aspect;

    public SimpleAopInvocationHandler(Object target, LoggingAspect aspect) {
        this.target = target;
        this.aspect = aspect;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        JoinPoint joinPoint = new SimpleJoinPoint(target, proxy, args, method);
        aspect.logBefore(joinPoint);
        return method.invoke(target, args);
    }
}
