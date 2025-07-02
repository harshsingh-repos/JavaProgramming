package Inheritance;

public class Animal {
    // Will be the parent class
    String name;

    public Animal(String name){
        this.name = name;
    }
    public Animal(){
        this.name = name;
    }
    // overloading the methods
    public void eat(){
        System.out.println(name + " animal eats food.");
    }

    public void makeSound(){
        System.out.println(name + " animal sound");
    }
}
