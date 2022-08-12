package study.aspects.aop;

import java.lang.reflect.Proxy;

/**
 * Generates proxy wrappers using JDK {@link java.lang.reflect.Proxy}
 * and supplied {@link LoggingAspect}.
 */
public class SimpleWeaver {

    private final ClassLoader classLoader;

    public SimpleWeaver(ClassLoader classLoader) {
        this.classLoader = classLoader;
    }

    @SuppressWarnings("unchecked")
    public <T> T weave(T classInstance, LoggingAspect aspect) {
        return (T) Proxy.newProxyInstance(
                classLoader,
                classInstance.getClass().getInterfaces(),
                new SimpleAopInvocationHandler(classInstance, aspect)
        );
    }
}
