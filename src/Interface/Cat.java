package Interface;

public class Cat extends AnimalAgain implements Animal, AnimalBase{
    @Override
    public void eat() {
        System.out.println("Eats");
    }
    @Override
    public void makeSound() {
        System.out.println("Make Sounds");
    }
    @Override
    public void run() {
        System.out.println("Run");
    }
}
