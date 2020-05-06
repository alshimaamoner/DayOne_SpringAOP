package AopUsingSpring;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

public class CalculatorBefore implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("Before The Method :"+method.getName()+";\n"+"The Arguments: "+ Arrays.toString(objects));

    }
}
