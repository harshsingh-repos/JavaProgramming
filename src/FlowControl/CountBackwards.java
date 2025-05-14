package FlowControl;

public class CountBackwards {
    public static void main(String[] args) {
//        backwardLoop(); // calling the method
//        forwardLoop();

        backwardLoopWithWhile();
//        forwardLoopWithWhile();
    }

    public static void backwardLoop(){ //defined the method (method body)
        // use static if not creating an object of the class to call the method
        for(int i = 10; i >= 0; i--){
            if(i !=0){
                System.out.println(i + ", ");
            }else{
                System.out.println(i);
            }
        }
    }
    public static void forwardLoop(){
        for(int i=0; i<=10 ; i++){
            if(i < 10 ){
                System.out.println(i + ", ");
            }else{
                System.out.println(i);
            }
        }
    }

    public static void backwardLoopWithWhile() {
        int i = 10;
        while (i >= 0) {
            if (i != 0) {
                System.out.println(i + ", ");
            } else {
                System.out.println(i);
            }
            i--;
        }
    }

    // write a method for forwardloop with while
}
