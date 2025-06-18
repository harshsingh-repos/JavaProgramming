package ClassesAndObjects;

public class CupofCoffeeEnum {
    // enum -> enumeration is special data type - define a fixed set of constants

    public enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE}

    private Size size;

    public CupofCoffeeEnum(Size size){
        this.size =size;
    }
    public void setSize(Size size){
        this.size = size;
    }

    public Size getSize(){
        return size;
    }

    public static void main(String[] args) {
        CupofCoffeeEnum coffee = new CupofCoffeeEnum(Size.LARGE);
        System.out.println("Coffee Size: " + coffee.getSize());
    }
}
