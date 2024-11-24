package mapinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapWith_List {

    public static void main(String[] args) {

        List<String> citiesOfUSA = new ArrayList<>();
        citiesOfUSA.add("New York");
        citiesOfUSA.add("Florida");
        citiesOfUSA.add("New Jersey");
        citiesOfUSA.add("Connecticut");
        citiesOfUSA.add("Pennsylvania");

        List<String> citiesOfIndia = new ArrayList<>();
        citiesOfIndia.add("New Delhi");
        citiesOfIndia.add("Calcutta");
        citiesOfIndia.add("Mumbai");
        citiesOfIndia.add("Bangalore");
        citiesOfIndia.add("Maharashtra");

        List<String> citiesOfCanada = new ArrayList<>();
        citiesOfCanada.add("Montreal");
        citiesOfCanada.add("Quebec");
        citiesOfCanada.add("Vancouver");
        citiesOfCanada.add("Alberta");
        citiesOfCanada.add("Toronto");

        /*
        Map<K,V> name = new HashMap<>();
        String ---> is Key and
        List<String> -- is value of List type
        Note: We used three ArrayList inside our map

        Question:
        --------
        How to use a List type of array inside a map?
         */
        Map<String,List<String>> map = new HashMap<>();
        map.put("USA", citiesOfUSA);
        map.put("India", citiesOfIndia);
        map.put("Canada", citiesOfCanada);

        //retrieve all the values from the map
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
