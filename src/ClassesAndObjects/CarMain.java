package ClassesAndObjects;

class Car {
    //Attributes/Fields
    String color;
    //Access specifiers (Encapsulation) -> public , private( methods of class can use), protected, default
    private String brand;
    private int speed;
    //Constructor:  is a special method which begins with class name
    // default values for objects -> initialize objects with default value
    public Car(){ //default constructor
        color = "Blue";
        brand = "BMW";
        speed = 100;
    }
    //parameterized constructor
    public Car(String color, String brand, int speed){
        // this keyword is reference variable -> to current object
        // the object whose method or constructor is in use
        this.color = color;
        this.brand = brand;
        this.speed = speed;
    }
    public Car(String brnd, int spd){
        brand = brnd;
        speed = spd;
    }

    //setters and getters-> special methods which are used to access the private fields/attributes

    public void setBrand(String brand){
        this.brand =brand;
    }
    public String getBrand(){
        return brand;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getSpeed(){
        System.out.println(speed);
//        return speed;
        return speed;
    }

    //Methods (Behaviour)
    public void accelerate(){
        speed +=10;
        System.out.println("Car of : " + brand + " and Color " + color + " is accelerating at speed: " + speed);
    }

    public void brake(){
        speed -=10;
        System.out.println("Car of : " + brand + " and Color " + color +" is braking at speed: " + speed);
    }
    public void displayCarInfo(){
        System.out.println("Brand: " + brand + ", speed: "+ speed );
    }
    public String toString() {
        return "Brand: " + brand + ", speed: "+ speed + ", color: " + color ;
    }
}

public class CarMain {
    public static void main(String[] args) {

        Car car1 = new Car(); //Created an object car1 of Class Car
        car1.setBrand("Honda");
        car1.color = "Black";
        car1.setSpeed(60); //accessing the attributes/methods use dot (.) operator

        System.out.println(car1); //implicitly call the toString() to print the values associated with object
//        System.out.println("Speed: " + car1.getSpeed());
    }
}
