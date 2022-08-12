package study.aspects.aop;

import java.lang.reflect.Method;

public class SimpleSignature extends BaseSignature {

    private final Method targetMethod;

    public SimpleSignature(Method targetMethod) {
        this.targetMethod = targetMethod;
    }

    @Override
    public String getName() {
        return targetMethod.getName();
    }
}
