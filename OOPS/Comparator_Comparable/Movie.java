package OOPS.Comparator_Comparable;

//To implement the Comparable interface with the Movie class, and we override the method compareTo() of Comparable interface.

import java.util.Comparator;

public class Movie implements Comparable<Movie>{

    private double rating;
    private String name;
    private int year;

    public Movie(String name, double rating, int year){
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    //We have to make changes to Movie class to change the sorting behavious in case of Comparable
    @Override
    public int compareTo(Movie m){
        return this.year - m.year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "rating=" + rating +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
