package numberscodingtest;

import java.util.HashMap;
import java.util.Map;
/*
Problem: Write a program that will print a given numbers of array sequentially.
*/
public class PrintFrequencyOfNumbers {

    public static void main(String[] args) {
        int [] numbers = {123, 34, 34, 34, 800, 1, 1, 1, 1, 89, 165};

        printFrequenciesOfNumbers(numbers);
    }
    /*
    <arr.length --> based on the length, loop will check the condition
    */
    public static void printFrequenciesOfNumbers(int[] arr){
        HashMap<Integer, Integer> hashMap = new HashMap<>();//empty hashmap
        for (int i = 0; i <arr.length; i ++){
            Integer x = hashMap.get(arr[i]);
            //if this is the first occurrence
            if (hashMap.get(arr[i]) == null){
                hashMap.put(arr[i],1);
            }else {
                hashMap.put(arr[i], ++x);
            }
        }
        //retrieve values
        for (Map.Entry y : hashMap.entrySet()) {
            System.out.println("Frequencies of " + y.getKey() + ": " + y.getValue() + " "+ "time.");
        }
    }
}
