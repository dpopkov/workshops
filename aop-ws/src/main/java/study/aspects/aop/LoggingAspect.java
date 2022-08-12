package study.aspects.aop;

import org.aspectj.lang.JoinPoint;

public interface LoggingAspect {

    void logBefore(JoinPoint joinPoint);
}
