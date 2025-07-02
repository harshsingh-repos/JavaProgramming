package Inheritance;

public class ObjectDemo {
    public static void main(String[] args) {

        Book book = new Book("Java Programming", 1000);
        System.out.println("Book Object :" + book);

        Movie movie1 = new Movie("Inception", 160);
        Movie movie2 = new Movie("Inception", 160);
        Movie movie3 = new Movie("Ink", 148);

        System.out.println(" Movie Object: " + movie1);

        System.out.println(" movie1 eq movie 2: " + movie1.equals(movie2));
        System.out.println(" movie1 eq movie 3: " + movie1.equals(movie3));

    }
}
