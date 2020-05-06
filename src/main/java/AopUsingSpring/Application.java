package AopUsingSpring;

import calculator.AbstractProxy;
import calculator.CalculatorAdvice;
import calculator.CalculatorProxy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
//        Calculator calculator=context.getBean("calculatorProxy",Calculator.class);
//        calculator.add(5,5);
//        calculator.subtract(10,4);
        //Using Automatic Proxy
//        Calculator calculator2=context.getBean("calculatorId",Calculator.class);
//        calculator2.add(5,5);
//        calculator2.subtract(10,4);
//        //Second Way using DefaultAdvisorAutoProxyCreator
//        Calculator calculator3=context.getBean("calculatorId",Calculator.class);
//        calculator3.add(5,5);
//        calculator3.subtract(10,4);
        //Throw Exception
        Calculator calculator4=context.getBean("calculatorId",Calculator.class);
        calculator4.add(5,5);
        calculator4.divide(10,5);
    }

}
