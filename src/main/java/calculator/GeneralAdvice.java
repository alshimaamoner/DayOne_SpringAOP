package calculator;

public class GeneralAdvice {

    public void before(Object[]args){
       for (Object arguments:args){
           System.out.println(arguments);
       }
    }
    public void after(Object result){
        System.out.println("return is "+result);
    }
    public void afterThrowing(Exception exception){
        System.err.println(exception.getMessage());
    }
}
