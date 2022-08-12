package study.aspects.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.SourceLocation;

public class BaseJoinPoint implements JoinPoint {
    @Override
    public String toShortString() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toLongString() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object getThis() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object getTarget() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] getArgs() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Signature getSignature() {
        throw new UnsupportedOperationException();
    }

    @Override
    public SourceLocation getSourceLocation() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getKind() {
        throw new UnsupportedOperationException();
    }

    @Override
    public StaticPart getStaticPart() {
        throw new UnsupportedOperationException();
    }
}
