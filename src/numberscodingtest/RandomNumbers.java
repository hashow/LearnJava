package numberscodingtest;

import java.util.Random;

/*
Problem: Write a program that will generate random numbers.
-----------------------------------------------------------

Generating random numbers in Java:
----------------------------------
Java provides three ways to generate random numbers using some built-in methods and classes as listed below:

1. java.util.Random class
2. Math.random method : Can Generate Random Numbers of double type.
3. ThreadLocalRandom class
--------------------------------------------------------------------
1) java.util.Random
-------------------
For using this class to generate random numbers, we have to first create an instance of this class
and then invoke methods such as nextInt(), nextDouble(), nextLong() etc using that instance.
We can generate random numbers of types integers, float, double, long, booleans using this class.
We can pass arguments to the methods for placing an upper bound on the range of the numbers to be generated.
For example, nextInt(6) will generate numbers in the range 0 to 5 both inclusive.
*/
public class RandomNumbers {

    public static void main(String[] args) {

        int [] studentId = new int[20];
        Random random = new Random();

        for (int x = 0; x<studentId.length; x ++){
            studentId[x] = random.nextInt(50);
            System.out.println(studentId[x]);
        }
    }
}
