package AopUsingSpring;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

public class CalculatorAfterReturn implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("After The Method :"+method.getName()+";\n"+"The Arguments: "+ Arrays.toString(objects)+";\n"+"The"+
                "return :"+o);

    }
}
