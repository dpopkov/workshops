package study.aspects.aop;

import org.aspectj.lang.Signature;

public class BaseSignature implements Signature {
    @Override
    public String toShortString() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toLongString() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getModifiers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Class<?> getDeclaringType() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getDeclaringTypeName() {
        throw new UnsupportedOperationException();
    }
}
