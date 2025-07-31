package Exceptions;

public class ManualExceptions {
    public void checkAge(int age){
        if(age < 13){
            throw new ArithmeticException("Access Denied, you should be above 13");
        }else{
            System.out.println("Access Granted");
        }
    }
    public static void main(String[] args) {
        ManualExceptions me = new ManualExceptions();
        me.checkAge(12);
    }
}
