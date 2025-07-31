package AbstractClass;

public abstract class Animal {
    // a general idea
    // can have regular method with body
    // have abstract methods without body
    // cannot initialization -> can not make an object ?
    String name;
    public void eat(String name){
        System.out.println(name + " eats");
    }
    public abstract void makeSound(); // abstract method without body
    public void makeSound(String name){
        System.out.println("Animal makes sound");
    }
}
