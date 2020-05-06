package calculator;

import java.lang.reflect.Proxy;

public class Application {
    private final Calculator target;
    private final Calculator targetWithadvice;

    public Application() {
        target = new CalculatorImpl();
        CalculatorAdvice advice = new CalculatorAdvice();
        CalculatorProxy calculatorProxy=new CalculatorProxy(target,advice);
        Class[] interfaces=new Class[]{Calculator.class};
        targetWithadvice=(Calculator) Proxy.newProxyInstance(new ClassLoader() {
        },interfaces,calculatorProxy);
        targetWithadvice.add(5,5);
    }

    public static void main(String[] args) {

      new Application();
      //Using Generic
        Calculator calculator=new CalculatorImpl();
        Calculator calculator1=(Calculator)AbstractProxy.newInstance(calculator);
         calculator1.divide(5,5);
    }
}
