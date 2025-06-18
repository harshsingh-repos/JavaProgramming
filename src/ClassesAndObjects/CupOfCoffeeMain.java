package ClassesAndObjects;

public class CupOfCoffeeMain {

    public static void main(String[] args) {
        CupOfCoffee coffee =
                new CupOfCoffee("extra-small", "dark-roast", -2, -2);
        coffee.getDescription();
        System.out.println(coffee.getPrice());

        // size.charAt(0).toUpperCase() => Arrays
        CupOfCoffee coffee1 =
                new CupOfCoffee(null, null, 1, 2);
        coffee1.getDescription();
        System.out.println(coffee1.getPrice());
    }


}
