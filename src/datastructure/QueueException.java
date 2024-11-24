package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/*
Exception handling:
------------------
Exception handling in Java is a mechanism to gracefully handle runtime errors that might occur during
the execution of a program.
Here's a breakdown of the key concepts:
---------------------------------------
Try-Catch-Finally:
try:
----
The code that might throw an exception is placed within the try block.
catch:
-----
If an exception occurs within the try block, the corresponding catch block is executed.
The catch block specifies the type of exception it handles.
finally:
--------
The code within the finally block is executed regardless of whether an exception occurred or not.
It's often used to release resources, like closing files or database connections.
 */
public class QueueException {

    public static void main(String[] args) {

        try {
            Queue<Integer> price = new LinkedList<>();
            price.add(25);
            price.add(100);
            price.add(40);
            price.add(500);
            price.add(19);
            price.add(7);

            for (Integer n : price) {
                System.out.println(n);
            }
            System.out.println("Removed all the elements from the queue");
            System.out.println(price.removeAll(price));//returns --true if removed

            System.out.println(price.element());//will throw exception
        }catch (Exception e){
            System.out.println("NoSuchElementException");
        }
        System.out.println("-----Creating a new Queue object-----");
        Queue<String> merchandise = new LinkedList<>();
        merchandise.add("Hammer");
        merchandise.add("Tape");
        merchandise.add("Pencil");
        merchandise.add("Eraser");
        merchandise.add("Ruler");
        merchandise.add("Note Book");

        System.out.println("Using for loop here to retrieve all values");
        for (int x = 0; x <merchandise.size(); x ++){
            System.out.println(merchandise.peek());
        }

        Queue<Double> numbers = new LinkedList<>();
        numbers.add(25.29);
        numbers.add(100.1);
        numbers.add(40.99);
        numbers.add(500.20);
        numbers.add(19.19);
        numbers.add(7.99);

        for (int a = 0; a < numbers.size(); a ++){
            System.out.println(numbers.peek());
        }

        /*
        What is Iterator in Java?
        -------------------------
        Iterators in Java are used in the Collection framework to retrieve elements one by one.
        It is a universal iterator as we can apply it to any Collection object. By using Iterator,
        we can perform both read and remove operations. It is an improved version of Enumeration
        with the additional functionality of removing an element.
        We also can use Iterator to retrieve all the data from the foodList object
        ---------------------------------------------------------------------------
        Iterator it = foodList.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        */
        System.out.println("-----Using Iterator -----");

        Iterator it = numbers.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
