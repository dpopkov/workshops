package study.aspects.aop;

import org.aspectj.lang.Signature;

import java.lang.reflect.Method;

public class SimpleJoinPoint extends BaseJoinPoint {
    private final Object target;
    private final Object proxy;
    private final Object[] args;
    private final Signature targetMethodSignature;

    public SimpleJoinPoint(Object target, Object proxy, Object[] args, Method targetMethod) {
        this.target = target;
        this.proxy = proxy;
        this.args = args;
        this.targetMethodSignature = new SimpleSignature(targetMethod);
    }

    @Override
    public Object getThis() {
        return proxy;
    }

    @Override
    public Object getTarget() {
        return target;
    }

    @Override
    public Object[] getArgs() {
        return args;
    }

    @Override
    public Signature getSignature() {
        return targetMethodSignature;
    }
}
