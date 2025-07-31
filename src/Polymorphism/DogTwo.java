package Polymorphism;


public class DogTwo extends Animal{

    DogTwo(){
        super();
    }
    public void eat(String name){
        System.out.println(name + "Dog Eats Beef Treats");
    }

    public void eat(String name, int qty){
        System.out.println(name + "Eats int " + qty);
    }

    public void eat(String name, float qty){
        System.out.println(name + "Eats float " + qty);
    }

    public void eat(float qty, String name){
        System.out.println(name + "Eats float " + qty);
    }
}
