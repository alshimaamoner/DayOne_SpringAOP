package calculator;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CalculatorProxy implements InvocationHandler {
    Calculator calculator;
    CalculatorAdvice calculatorAdvice;

    public CalculatorProxy(Calculator calculator, CalculatorAdvice calculatorAdvice) {
        this.calculator = calculator;
        this.calculatorAdvice = calculatorAdvice;
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        double result=0.0;
        double firstOpernad=(Double) args[0];
        double secondOpernad=(Double) args[1];
        switch (method.getName()){
            case "add":
                try{
                 calculatorAdvice.before(firstOpernad,"+",secondOpernad);
                 result=(double)method.invoke(calculator,args);
                 calculatorAdvice.after(result);
            }catch(Exception ex){
                    calculatorAdvice.afterThrowing(ex);
            }
                break;
            case "divide":
                try{
                    calculatorAdvice.before(firstOpernad,"/",secondOpernad);
                    result=(double)method.invoke(calculator,args);
                    calculatorAdvice.after(result);
                }catch(Exception ex){
                    calculatorAdvice.afterThrowing(ex);
                }
                break;

        }

        return result;
    }
}
