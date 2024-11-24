package numberscodingtest;

import java.util.Scanner;
/*
Solution:
---------
I will simply create a method, and implement the logic in the method
then simply call that method
Note:
-----
This is more dynamic approach, and cleaner code that keeps
the main() method clean
 */
public class CheckPositiveNegativeNumber {

    public static void checkPositiveNegativeNumber(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input a number : ");
            String x = sc.nextLine();
            int y = Integer.parseInt(x);

            if (y < 0){
                System.out.println("It's negative number");
            }else if (y > 0){
                System.out.println("It's positive number");
            }
            sc.close();
        }catch (Exception e){
            System.out.println("Not a number! please enter any number.");
        }
    }

    public static void main(String[] args) {
        checkPositiveNegativeNumber();
    }
}
