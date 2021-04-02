package pl.coderslab.collections;

import java.util.*;

public class Main03 {

    public static void main(String[] args) {

    }

    public static List<City> initialize(){

        List<City> city = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            city.add(new City ("city", 15));
        }

        ListIterator<City> it = city.listIterator();


        return city;
    }

}
