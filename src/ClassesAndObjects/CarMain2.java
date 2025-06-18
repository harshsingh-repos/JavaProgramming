package ClassesAndObjects;

public class CarMain2 {
    public static void main(String[] args) {

        Car car1 = new Car(); //Created an object car1 of Class Car
        car1.setBrand("Honda");
        car1.color = "Black";
        car1.setSpeed(60); //accessing the attributes/methods use dot (.) operator

//        System.out.println("Brand: " + car1.getBrand());
//        System.out.println("Speed: " + car1.getSpeed());

    car1.accelerate(); //Honda is accelerating // using object to call the methods defined in Car class
//        car1.brake();
//        car1.displayCarInfo();

        Car car2 = new Car();
//        car2.brand = "Toyota";
//        car2.speed = 80;
//        car2.color = "White";

//        car2.brake();

        Car car3 =new Car();
//        car3.brake();

        Car car4 =new Car("Red", "Audi", 90);
//        car4.accelerate();

        Car car5 =new Car("Acura", 50);
//        car5.accelerate();

    }
}
