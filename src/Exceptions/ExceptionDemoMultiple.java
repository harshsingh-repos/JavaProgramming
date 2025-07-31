package Exceptions;

public class ExceptionDemoMultiple {

    public static void main(String[] args) {
        try{
            int[]numbers = new int[5];
            numbers[4] = 10/2;
        } catch(ArrayIndexOutOfBoundsException ai){
            System.out.println("Array Index Error: " +  ai.getMessage());
        }catch (ArithmeticException a){
            System.out.println("Arithmatic Error: " + a.getMessage());
        }catch(Exception e){
            System.out.println("general Error: " + e.getMessage());
        }finally {
            System.out.println("This block is always executed");
        }

        System.out.println("Program continues..");
    }
}
