package datastructure;

import java.util.ArrayList;

public class UsesOfArrayList {
/*
Java ArrayList is a part of collections framework, and it is a class of java.util package.
It provides us with dynamic arrays in Java. Though, it may be slower than standard arrays
but can be helpful in programs where lots of manipulation in array is required.
The main advantage of ArrayList is, unlike normal arrays, we don’t need to mention the size
when creating ArrayList. It automatically adjusts its capacity as elements are added or removed.

ArrayList class implements --> List interface -- extends Collection interface

Syntax of ArrayList:
--------------------
ArrayList<Integer> arr = new ArrayList<Integer>();

Note: We can also create a generic ArrayList

Important Features of ArrayList in Java:
---------------------------------------
1. ArrayList inherits AbstractList class and implements the List interface.
2. ArrayList is initialized by size. However, the size is increased automatically if the
collection grows or shrinks if the objects are removed from the collection.
3. Java ArrayList allows us to randomly access the list.
4. ArrayList can not be used for primitive types, like int, char, etc. We need a wrapper class for such cases.
5. ArrayList in Java can be seen as a vector in C++.
6. ArrayList is not Synchronized. Its equivalent synchronized class in Java is Vector.
*/
    public static void main(String[] args) {
        //add() method: is used to append a specific element to the end of a list.
        ArrayList<String> studentList = new ArrayList<String>();
        studentList.add("John");
        studentList.add("Zakir");
        studentList.add("Azom");
        studentList.add("Daniel");
        studentList.add("Sara");
        studentList.add("Richard");
        studentList.add("Protiva");

        //get() method: is used to retrieve an element from the specified indexed position of the list object
        System.out.println(studentList.get(3));

        //remove() method is used  to remove an element by passing the value of the object
        System.out.println(studentList.remove("Protiva"));
        //remove() method is used  to remove an element by passing the index of the element
        System.out.println(studentList.remove(5));

        System.out.println(studentList.size());//5


        //System.out.println(studentList.get(5));//IndexOutOfBoundsException- because element is removed

        //to retrieve all data in the list, for each loop can be used
        for (String list : studentList) {
            System.out.println(list);
        }


        /*
        1. ArrayList preserved or maintain insertion order of the elements
        2. ArrayList allows to insert duplicate element values
        3. ArrayList allows to insert null values

         */
        ArrayList<Integer> prices = new ArrayList<Integer>();
        prices.add(10); //duplicate
        prices.add(100);
        prices.add(50);
        prices.add(80);
        prices.add(37);
        prices.add(200);
        prices.add(10); //duplicate
        prices.add(10); //duplicate
        prices.add(null);

        System.out.println(" ArrayList preserved insertion order ");
        for (Integer price : prices) {
            System.out.println(price);
        }
        /*
        1. How to push code from git (local repository) to GitHub(cloud repository) ?
        git command to push code in git and GitHub
        git status
        git add .
        git commit -m"ArrayList code"
        git push origin master
        Note: The code is pushed now from the local machine to the GitHub (cloud repository)
        login to GitHub to view the code after push
        ----------------------------------------------------------------------------------------
        2. How to clone a project in your machine?
        --Create a folder in a particular location where you want to have your project to be cloned
        --Go inside the folder and right click to open GitBash(CLI) there
        --write the clone command as: git clone and paste the project URL from your GitHub repository
        git clone https://github.com/....
        --Hit enter key from your keyboard
        ----------------------------------------------------------------------------------------
        3. How to open the project from IntelliJ Idea?
        --Go to your IntelliJ IDE
        --File--then browse the location where the project is to open in IntelliJ Idea
        */

/*
Question 1:
-----------
What is the difference between ArrayList and LinkedList?
--------------------------------------------------------
1. Manipulation with ArrayList is slow because it internally uses an array. If any element is removed
from the array, all the bits (elements) are shifted in memory.
Example: If I do: prices.remove(7); ? the element below this one shifts and take its position.
So, manipulation of ArrayList elements are slower than the LinkedList.

1. LinkedList is faster than the ArrayList because it uses DoublyLinkedList. So, no bit shifting
is required in memory for linkedList.

2. An ArrayList can act as a list only because it implements List only.
2. LinkedList class can act as a list and queue both because it implements both List and Dequeue interface.

3. ArrayList is better for storing and accessing data.
3. LinkedList better for manipulating data.

Question: 2:
------------
Why ArrayList is slower than the LinkedList?
--------------------------------------------
Answer: ArrayList is slower than the LinkedList, because it internally uses an array. If any element is removed
from the array, all the bits (elements) are shifted in memory. Elements shifting time makes it slower than LinkedList.
----------------------------------------------------------------------------------------------------------------------
Question: 3:
------------
When do you decide to use ArrayList?
------------------------------------
Answer:
Whenever we have a situation or scenario where we need to store and access data frequently, then
we prefer to use ArrayList.
-------------------------------------------------------------------------------------------------
Question: 4:
------------
When do you decide to use LinkedList?
------------------------------------
Answer:
Whenever we have a situation or scenario where we need to manipulate data frequently, then
we prefer to use LinkedList.
---------------------------------------------------------------------------------------------
*/
        System.out.println(prices.remove(7));
    }
}
