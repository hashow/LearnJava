package datastructure;

public class UsesOfArray {

    static String name = "Jackson"; //variable declaration and initialization

    //array declaration with the size of 5 values to insert
    static String stAddress [] = new String[5];

    static double price [] = new double[5];

    static char ctr[] = new char[5];
    static String[] sName = {"John", "Zakir", "Daniel", "Michael"}; //array declaration and initialization

    public static void main(String[] args) {

        System.out.println("String variable value is : " + name); //printing variable value
        System.out.println(sName[0]); //printing 0th index value of the array
        System.out.println(sName[2]); //printing 2nd index value of the array

        //calling stAddress array in the main method and initialize values for each indexed position
        stAddress[0] = "Brooklyn";
        stAddress[1] = "Bronx";
        stAddress[2] = "Staten Island";
        stAddress[3] = "Manhattan";
        stAddress[4] = "Queens";

        //access a single array element
        System.out.println(stAddress[1]);

        System.out.println("*******************************");
        //access/retrieve all element values of the array using for loop
        for (int x = 0; x <stAddress.length; x ++){
            System.out.println(stAddress[x]);
        }

        System.out.println("******* Using Enhanced for loop *******");
        //access/retrieve all element values of the array using for each loop or enhanced for loop
        for (String arr : stAddress) {
            System.out.println(arr);
        }

        System.out.println("*****ArrayIndexOutOfBoundException****");
        //System.out.println(stAddress[6]); //uncomment to view the exception on the console

        /*
        By using try/catch block, we handle exceptions thrown by the compiler
        In this way we can avoid exception error shown in the compiler for cleaner code
        */
        System.out.println("*****HandleArrayIndexOutOfBoundException****");
        try {
            System.out.println(stAddress[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        }

        //how does concatenation work in an array elements?
        System.out.println(stAddress[1]+" and "+stAddress[4]+" are far from each other");

        //array with int data type
        System.out.println("--------array with int data type---------");
        int rollNum[]  = {1, 2, 3, 4, 5};
        System.out.println(rollNum[4]);

        for (int z = 0; z <rollNum.length; z ++){
            System.out.println(rollNum[z]);
        }

        System.out.println("***** Exception handling ****");
        try {
            System.out.println(rollNum[6]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception");
        }

        price [0] = 10.25;
        price [1] = 100.50;
        price [2] = 10.75;
        price [3] = 10.15;
        price [4] = 1000.25;

        System.out.println("** retrieve values using enhanced for loop **");
        for (double pr : price) {
            System.out.println(pr);
        }

        ctr[0] = 'a';
        ctr[1] = 'b';
        ctr[2] = 'c';
        ctr[3] = 'd';
        ctr[4] = 'e';

        System.out.println("** retrieve values using for loop **");
        for (char c = 0; c<ctr.length; c ++){
            System.out.println(ctr[c]);
        }
        System.out.println("Characters length is : " + ctr.length);

        System.out.println("** retrieve values using for each loop **");
        for (char c1 : ctr) {
            System.out.print(c1 +" "+" "+" "+" ");
        }
    }
}
