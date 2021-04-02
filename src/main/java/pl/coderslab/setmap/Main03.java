package pl.coderslab.setmap;

import java.util.ArrayList;
import java.util.List;

public class Main03 {

    public static void main(String[] args) {

    }

    public static List<Country> initialize () {
        Country c1 = new Country();
        Country c2 = new Country();
        Country c3 = new Country();
        Country c4 = new Country();
        Country c5 = new Country();

        String[] names = {"Andora", "Belgia", "Holandia", "Urugwaj", "Mali", "Rwanda"};
        String[] capitals = {"Andora", "Bruksela", "Amsterdam", "Montevideo", "Bamako", "Kigali"};
        Country[] variablesNames = {c1, c2, c3, c4, c5};
        
        List<Country> countries = new ArrayList<>();
        for (int i = 0; i < variablesNames.length; i++) {
            countries.add(variablesNames[i]);

//            createC("c2");
        }

        return countries;

    }

    public static Country createC (char c) {
//        Country c = new Country();
//        c.setName();


        return null;
    }


}
