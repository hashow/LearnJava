package arrays;

/**
 Array:
 ------
 An array is a collection of variables of the same type, referred to by a common name.
 In Java, arrays can have one or more dimensions, although the one-dimensional array is the most common.

 Uses of Array:
 --------------
 Arrays are used for a variety of purposes because they offer a convenient means of grouping
 together related variables.
 For example, we might use an array
 - to hold a record of the daily high temperature for a month,
 - a list of stock price averages etc.
 The principal advantage of an array is that it organizes data in such a way that it can be easily
 manipulated and data can be easily sorted.

 Declare one-dimensional array:
 ------------------------------
 type array-name [] = new type [size];
 int sample [] = new int [10];

 The sample variable holds a reference to the memory allocated by new.
 Declare one-dimensional array is possible to break in two parts as below:
 -------------------------------------------------------------------------
 int sample [];
 sample = new int [10];
 */

public class ArraysInJava {

    public static void main(String[] args) {

        //Declare one-dimensional array:
        //type array-name [] = new type [size];

        int sample [] = new int [10];
        int i;

        for (i = 0; i < 10; i = i + 1 ){
            sample[i] = i;
            System.out.println("This is sample[" + i + "] : " + sample[i]);

        }

    }
}
