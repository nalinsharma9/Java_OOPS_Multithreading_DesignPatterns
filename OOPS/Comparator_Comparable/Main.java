package OOPS.Comparator_Comparable;

//Java provides two interfaces to sort objects using data members of the class:
//Comparable and Comparator.

//Comparable requires writing the sorting logic inside the class whose objects we want to sort.
//We can use Comparator to make changes in sorting behaviour without having to modify the class whose objects we are sorting.


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {


    public static void main(String[] args) {

        ArrayList<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1980));

        //Sorting by year using Comparable
        //Collections.sort(list);

        //We can change the sorting behaviour by passing the Comparator object without changing Movie class

        //MovieYearCompare movieYearCompare = new MovieYearCompare();
        //Sorting by year using Comparator
       // Collections.sort(list, movieYearCompare);

        //MovieRatingCompare movieRatingCompare = new MovieRatingCompare();
        //Collections.sort(list, movieRatingCompare);


        // We can also pass anonymous class object to sort method
        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie m1, Movie m2) {
                return m1.getName().compareTo(m2.getName());
            }
        });



        System.out.println("Movies after sorting : ");
        for (Movie movie : list)
            System.out.println(movie);
    }

}
