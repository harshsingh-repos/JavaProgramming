package Arrays;

public class Student {

    String name;
    int id;

    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }

    public void displayInformation(){
        System.out.println("Name: " + name + " Id: " + id);
    }
}
