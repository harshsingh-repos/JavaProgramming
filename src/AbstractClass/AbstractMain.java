package AbstractClass;

public class AbstractMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        cat.eat("Shy");
        cat.makeSound("Shy");

//        Animal anml = new Animal(); // no binding with a method that has a body

    }
}
