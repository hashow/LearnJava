package mapinterface;

import java.util.HashMap;
import java.util.Map;

/*
In Java, Map Interface is present in java.util package represents a mapping between a key and a value.
Java Map interface is not a subtype of the Collection interface. Therefore, it behaves a bit differently
from the rest of the collection types. A map contains unique keys.

The Map interface allows for efficient data storage in key-value pairs, making it essential for many applications.

Question:
========
Why and when to use Maps?

Maps are perfect to use for key-value association mapping such as dictionaries.
The maps are used to perform lookups by keys or when someone wants to retrieve and update elements by keys.

Some common scenarios are as follows:
-------------------------------------
--- A map of error codes and their descriptions.
--- A map of zip codes and cities.
--- A map of managers and employees. Each manager (key) is associated with a list of employees (value) he manages.
--- A map of classes and students. Each class (key) is associated with a list of students (value).

Creating Map Objects:
---------------------
Since Map is an interface, objects cannot be created of the type map.
We always need a class that extends this map in order to create an object.
And also, after the introduction of Generics in Java 1.5, it is possible to restrict the
type of object that can be stored in the Map.

Characteristics of a Map Interface:
-----------------------------------
A Map cannot contain duplicate keys and each key can map to at most one value.
Some implementations allow null key and null values like the HashMap and LinkedHashMap, but some do not like the TreeMap.
The order of a map depends on the specific implementations. For example, TreeMap and LinkedHashMap have
predictable orders, while HashMap does not.

There are two interfaces extends Map Interface:
-----------------------------------------------
1. SortedMap interface
2. NavigableMap interface, and three classes: HashMap, TreeMap, and LinkedHashMap.

Methods in Java Map Interface:
------------------------------
1. entrySet() method:
---------------------
This method is used in Map Interface in Java to create a set out of the same elements contained in the map.
It basically returns a set view of the map, or we can create a new set and store the map elements into them.
*/
public class UsesOfMapInterface {

    public static void main(String[] args) {

        Map<String, String> cityMap = new HashMap<>();

        //put() method: is used to insert/associate/enter data into the Map
        cityMap.put("USA","New York");
        cityMap.put("Mexico","Mexico City");
        cityMap.put("Canada","Autoa");
        cityMap.put("Japan","Tokyo");
        cityMap.put("India","New Delhi");
        cityMap.put("China","Peaking");

        //retrieve value
        System.out.println(cityMap.get("India"));

        //retrieve all values using for each loop
        for (Map.Entry<String,String> city : cityMap.entrySet()) {
            System.out.println(city.getKey() + ": " + city.getValue());
        }

        System.out.println("-----Creating another Map-----");

        Map<String,Integer> studentScores = new HashMap<>();
        studentScores.put("Math",90);
        studentScores.put("Chemistry",95);
        studentScores.put("Physics",91);
        studentScores.put("English",89);
        studentScores.put("Global History",90);

        for (Map.Entry<String,Integer> scores : studentScores.entrySet()) {
            System.out.println(scores.getKey() + ": " + scores.getValue());
        }

        System.out.println("-----Another way of retrieving Map values-----");

        //here is another way of retrieving data from the map
        for (String sScores : studentScores.keySet()) {
            System.out.println(sScores + ": " + studentScores.get(sScores));
        }
    }
}
