package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieObjects {

    public static void main(String[] args) {

        ArrayList<String> casts = new ArrayList<>();
        Movie movie = new Movie("USA","Journey to SDET: Cydeo Batch 25",
                "Adventure, Comedy, Thriller","10/25/2021","Kuzzat Altay",casts);

        String[] names = {"Asiya", "Adam", "Muhtar","Semih", "Azra", "Cemile", "Ethem", "Busra"};
        movie.addCast("Ali");

        movie.addCasts(names);

        System.out.println(movie);



    }

}
