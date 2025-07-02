package Inheritance;

public class Bird extends Animal{
    //Child Class that inherits the methods/behaviour of Animal Class
    boolean fly;
    public Bird(String name, boolean fly){
        super(name); // super keyword is used to access the parents constructor/fields/methods
        // using super we are calling parents constructor
        this.fly = fly;
    }
    public Bird(boolean fly){
        this.fly = fly;
    }
    public void fly(){
        System.out.println(name + " bird can fly: " + fly);
    }

    public void displayInfo(){
        super.eat(); // super is used to call the method eat inside parent Animal
    }
}
