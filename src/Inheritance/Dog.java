package Inheritance;

public class Dog extends Animal {

    public Dog(String name){
        super(name);
    }

    public void makeSound(){
        // Method overriding (Polymorphism)
        System.out.println( name + " Dog barks");
    }

}
