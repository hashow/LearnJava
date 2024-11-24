package datastructure;

public class ArrayAdvanced {
/*
Defining multi dimensional arrays
---------------------------------
data type ---- [](square bracket is considered as dimension) --- array variable name
String[] arr = new String[5]; //standard approach

We also can define dimension after the variable as well:
String arr1 [] = new String[5];
*/
    static String[] sName = {"John", "Zakir", "Daniel", "Michael"}; //array declaration and initialization
    static String address [] = new String[5];

    /*
    to keep our main method clean, we are creating a method that will print sName
    and just calling that method in the main method
    to call a method in the main method, we can use class name dot the method name as well
     */
    public static void main(String[] args) {
        //printStudentName();
        ArrayAdvanced.printStudentName();
        ArrayAdvanced adds = new ArrayAdvanced();
        adds.printAddress();

        //ArrayAdvanced.reverse()
    }

    //static method, we can call static method directly in the main method
    public static void printStudentName(){
        for (String sn : sName){
            System.out.println("Student name :" + sn);
        }
    }

    //passing array to regular method
    public void printAddress(){
        address[0] = "Brooklyn";
        address[1] = "Bronx";
        address[2] = "Staten Island";
        address[3] = "Manhattan";
        address[4] = "Queens";
        for (String add : address){
            System.out.println(add);
        }
    }

    public static int[] reverse(int [] list){
        int [] result = new int[list.length];
        for (int i = 1; i<result.length-1; i--){
            System.out.println(result[i]);
        }
        return result;
    }
}
