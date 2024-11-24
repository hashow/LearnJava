package numberscodingtest;

import java.util.Scanner;

/*
Write a program that will take number as user input then
check if the number is a positive or a negative number.
*/
public class PositiveNegative_Numbers {

    public static void main(String[] args) {

        try {
            Scanner number = new Scanner(System.in);
            System.out.println("Please enter a number : ");
            int num = number.nextInt();

            if (num == 0) {
                System.out.println("The number is: " + num);
            } else if (num > 0) {
                System.out.println("It is a positive number : " + num);
            } else if (num < 0) {
                System.out.println("It is a negative number : " + num);
            } else {
                System.out.println("It is not a number : " + num);
            }
        } catch (Exception e) {
            System.out.println("This is not a number! please enter a number instead");
        }
    }
}