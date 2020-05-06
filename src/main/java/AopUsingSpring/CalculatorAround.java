package AopUsingSpring;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Arrays;


public class CalculatorAround implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Around The Method :"+methodInvocation.getMethod().getName()+";\n"+"The Arguments: "+ Arrays.toString(methodInvocation.getArguments())
                );
        Object result=null;
        try {
            result =methodInvocation.proceed();
        }catch (IllegalArgumentException ex){
            ex.printStackTrace();
            throw ex;

        }
         return result;
    }
}
