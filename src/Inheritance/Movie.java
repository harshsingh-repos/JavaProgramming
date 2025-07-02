package Inheritance;

public class Movie {
    String name;
    int length;

    Movie(String name, int length){
        this.name = name;
        this.length = length;
    }

    public String toString(){
        return "Movie: " + name + ", Duration: " + length + " minutes";
    }

    public boolean equals(Object obj){
        if(this == obj) return true;

        if (obj instanceof Movie){
            Movie m = (Movie) obj;
            return this.name.equals(m.name) && this.length == m.length;
        }

        return false;
    }
}
