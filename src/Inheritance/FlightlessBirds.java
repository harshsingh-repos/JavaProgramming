package Inheritance;

public class FlightlessBirds extends Bird{

    public FlightlessBirds(String name, boolean fly){
        super(name, fly); // calling the constructor of parent
    }

    public void show(){
        super.displayInfo();
        super.eat();
    }

}
