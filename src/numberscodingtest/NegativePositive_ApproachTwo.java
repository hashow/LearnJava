package numberscodingtest;

import java.util.Scanner;

public class NegativePositive_ApproachTwo {

    public static void main(String[] args) {
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
            System.out.println("Not a number");
        }
    }
}
