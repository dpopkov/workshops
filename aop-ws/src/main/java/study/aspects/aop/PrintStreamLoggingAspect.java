package study.aspects.aop;

import org.aspectj.lang.JoinPoint;

import java.io.PrintStream;
import java.util.Arrays;

public class PrintStreamLoggingAspect implements LoggingAspect {

    private final PrintStream out;

    public PrintStreamLoggingAspect(PrintStream out) {
        this.out = out;
    }

    @Override
    public void logBefore(JoinPoint joinPoint) {
        out.println("Proxy: " + joinPoint.getThis().getClass().getName());
        out.println("Target: " + joinPoint.getTarget().getClass().getName());
        out.println("Calling method: " + joinPoint.getSignature().getName());
        out.println("Method arguments: " + Arrays.toString(joinPoint.getArgs()));
    }
}
