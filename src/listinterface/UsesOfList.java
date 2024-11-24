package listinterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UsesOfList {

    public static void main(String[] args) {

        //list type of array uses ArrayList
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Jack Fruit");
        fruitsList.add("Pineapple");
        fruitsList.add("Star Fruit");
        fruitsList.add("Pears");
        fruitsList.add("Pomegranate");

        //print all values
        for (String fList : fruitsList) {
            System.out.println(fList);
        }

        System.out.println("------------ LinkedList values ------------");

        List<String> studentList = new LinkedList<>();
        studentList.add("Jackson");
        studentList.add("Robert");
        studentList.add("Sara");
        studentList.add("Prat");
        studentList.add("Daria");

        for (int x = 0; x<studentList.size(); x ++){
            System.out.println(studentList.get(x));
        }

        /*
        Exception Handling: If any unwanted event occur, by using try/catch block,
        we handle exception as below. We keep our code in try block, if any exception
        is  found it caught in catch block.
         */
        try {
            List<String> memberList = new LinkedList<>();
            memberList.add("Kabir");
            memberList.add("Lily");
            memberList.add("Daniel");
            memberList.add("James");
            memberList.add("Prasad");

            memberList.size();
            System.out.println("Size of the member list is: " + memberList.size());

            memberList.removeAll(memberList);
            System.out.println(memberList); //it prints an empty array dimension[], all values are removed

            System.out.println(memberList.get(1));
        }catch (Exception e){
            System.out.println("IndexOutOfBoundsException" + "---" + "All element values are removed.");
        }

        List<String> foodList = new LinkedList<>();
        foodList.add("Pizza");
        foodList.add("Sand Witch");
        foodList.add("Soup");
        foodList.add("Bakery");
        foodList.add("Coffee");
        /*
        What is Iterator in Java?
        Iterators in Java are used in the Collection framework to retrieve elements one by one.
        It is a universal iterator as we can apply it to any Collection object. By using Iterator,
        we can perform both read and remove operations. It is an improved version of Enumeration
        with the additional functionality of removing an element.
        We also can use Iterator to retrieve all the data from the foodList object
        */
        Iterator it = foodList.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
