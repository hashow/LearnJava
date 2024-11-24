package listinterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UsesOfListInterface_Enhancement {

    public static void listInterfaceWithArrayList(){
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
    }

    public static void listInterfaceWithLinkedList(){
        List<String> studentList = new LinkedList<>();
        studentList.add("Jackson");
        studentList.add("Robert");
        studentList.add("Sara");
        studentList.add("Prat");
        studentList.add("Daria");

        for (int x = 0; x<studentList.size(); x ++){
            System.out.println(studentList.get(x));
        }
    }

    public static void main(String[] args) {
        listInterfaceWithArrayList();
        listInterfaceWithLinkedList();
    }
}
