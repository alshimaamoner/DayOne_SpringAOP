package AopUsingSpring;

import org.springframework.aop.ThrowsAdvice;

public class CalculatorThrowAdvice implements ThrowsAdvice  {

    public void afterThrowing(IllegalArgumentException exception) throws Throwable{
        System.err.println("Illegal Argument ...........");

    }
}
