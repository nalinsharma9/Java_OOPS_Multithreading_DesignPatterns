package OOPS.Comparator_Comparable;

import java.util.Comparator;

public class MovieYearCompare implements Comparator<Movie> {
    //compare by Name
    @Override
    public int compare(Movie m1, Movie m2)
    {
        return m2.getYear() - m1.getYear();
    }
}
