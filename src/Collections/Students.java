package Collections;

public class Students {
    String name;
    int age;

    public Students(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age;
    }
}
