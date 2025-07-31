package Polymorphism;

public class PolyDemo {
    public static void main(String[] args) {

        Animal anml = new Animal();
        anml.makeSound();
        DogTwo dog = new DogTwo();

//        dog.eat("Stella"); // static binding
        dog.eat("Ruby", 14); // dynamic binding
        dog.eat("Ruby", 14.0F); //dynamic binding
        dog.eat(14.0F, "Ruby"); //dynamic binding

    }
}
