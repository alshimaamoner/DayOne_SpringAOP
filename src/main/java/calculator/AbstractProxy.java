package calculator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AbstractProxy implements InvocationHandler {
    private final Object target;
    private final GeneralAdvice advice=new GeneralAdvice();

    public AbstractProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result=null;

                try {
                    advice.before(args);
                    result =method.invoke(target, args);
                    advice.after(result);
                } catch (Exception ex) {
                    advice.afterThrowing(ex);
                }

        return result;
    }
    public static  Object newInstance(Object object){
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),new AbstractProxy(object));
    }
}
