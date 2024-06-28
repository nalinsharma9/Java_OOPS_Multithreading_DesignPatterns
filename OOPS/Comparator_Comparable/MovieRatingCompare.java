package OOPS.Comparator_Comparable;

//Implement compare method for Comparator interface.Comparator object needs to be passed during sort.
//We don't have to modify the Movie class to change the sorting behaviour in case of comparator
import java.util.Comparator;

public class MovieRatingCompare implements Comparator<Movie> {
    //Need to implement compare method for Comparator interface

    //compare by Rating
    @Override
    public int compare(Movie m1, Movie m2)
    {
        if (m1.getRating() < m2.getRating())
            return -1;
        if (m1.getRating() > m2.getRating())
            return 1;
        else
            return 0;
    }
}
