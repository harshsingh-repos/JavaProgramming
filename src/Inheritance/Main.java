package Inheritance;

public class Main {

    public static void main(String[] args) {
        //Bird bird = new Bird("Kiwi", false);
        //bird.fly(); // the child class obj access the methods of its own class
//        bird.eat(); // the child class obj can call/access the methods of the parent class
       // bird.displayInfo();

//        Bird bird1 = new Bird(true);
//        bird1.fly();
//        bird1.displayInfo();

//        FlightlessBirds fliBirds = new FlightlessBirds("Ostrich", false);
//        fliBirds.show(); // calling its own method
//        fliBirds.fly(); // calling Bird (parent) method
//        fliBirds.eat(); // calling Animal(gradparents) method

        Dog dog = new Dog("Stella");
        dog.makeSound();
    }

}
