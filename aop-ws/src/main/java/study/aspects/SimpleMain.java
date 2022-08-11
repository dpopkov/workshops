package study.aspects;

import study.aspects.dao.PersonDao;
import study.aspects.dao.PersonDaoImpl;
import study.aspects.domain.Person;
import study.aspects.service.PersonService;
import study.aspects.service.PersonServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class SimpleMain {
    @SuppressWarnings("Convert2Lambda")
    public static void main(String[] args) {
        SimpleLoggingAspect aspect = new SimpleLoggingAspect();
        PersonDao targetPersonDao = new PersonDaoImpl();

        System.out.println("Using JDK Proxy");
        PersonDao proxiedDao = (PersonDao) Proxy.newProxyInstance(
                SimpleMain.class.getClassLoader(),
                targetPersonDao.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        aspect.logBefore(proxy.getClass(), targetPersonDao.getClass(), method, args);
                        return method.invoke(targetPersonDao, args);
                    }
                }
        );

        PersonService service = new PersonServiceImpl(proxiedDao);
        Person person = service.getByName("Alice");
        System.out.println("person = " + person);
    }

    private static class SimpleLoggingAspect {
        public void logBefore(Class<?> proxyClass, Class<?> targetClass, Method method, Object[] methodArgs) {
            System.out.println("Proxy: " + proxyClass.getName());
            System.out.println("Target: " + targetClass.getName());
            System.out.println("Calling method: " + method.getName());
            System.out.println("Method arguments: " + Arrays.toString(methodArgs));
        }
    }

}
