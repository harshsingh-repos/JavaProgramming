package Polymorphism;

public class Animal {
    // Will be the parent class
    String name;

    public Animal(String name){
        this.name = name;
    } // constructor overloading (polymorphism)
    public Animal(){
        this.name = name;
    } // constructor overloading
    // overloading the methods
    public void eat(){
        System.out.println(name + " animal eats food.");
    }
//    public String eat(String food){
//        return food;
//    }
 // ref call -> dog.eat() -> "stella animal eats food"
    /// ref call -> dog.eat("beef") => beef
    public void makeSound(){
        System.out.println(name + " animal sound");
    }


    // static binding -- compile time binding -- which method to call based on the reference
    //-> private data members
    // static methods
    // final methods
    // overloading - > constructor overloading (within a class we have two or methods of same name but with diff parameters)

    // dynamic binding -> Late Binding reference to the method
    //happens at run time.
}
