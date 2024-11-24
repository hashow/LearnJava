package datastructure;

/*
A multidimensional array can be defined as an array of arrays.
Data in multidimensional arrays are stored in tabular form (row-major order).
Example, when we design data in excel sheet,

------------> row is horizontal
------------> column is vertical
------------> every cell is consists of row and column as x, y coordination
If I store data in an excel sheet as:
Sl-----firstName-----lastName-----address-----contactNumber
-----------------------------------------------------------
-----------------------------------------------------------
-----------------------------------------------------------
Array index starts from: 0

Sl(0,0) ---> 0th row and 0th column
firstName(0,1) ---> 0th row and 1st column and so on
-----------------------------------------------------------------------
2 dimensional array example:
--------------------
static String[][] stName;
(Square brackets) [][] are considered as dimensions

First [] dimension is for row and
Second [] dimension is for column
*/
public class TwoDArray {
    static String[][] stAddress = new String[3][5];//declaring 2D array with size
    // [3][5] --> meaning we can store data up to 3rd rows and 5th columns
    public static void main(String[] args) {

        //data for first row
        stAddress[0][0] = "Brooklyn, NY";
        stAddress[0][1] = "Queens, NY";
        stAddress[0][2] = "Staten Island, NY";
        stAddress[0][3] = "Bronx, NY";
        stAddress[0][4] = "Manhattan, NY";

        //data for second row
        stAddress[1][0] = "Brooklyn, NY";
        stAddress[1][1] = "Queens, NY";
        stAddress[1][2] = "Staten Island, NY";
        stAddress[1][3] = "Bronx, NY";
        stAddress[1][4] = "Manhattan, NY";

        //data for third row
        stAddress[2][0] = "Brooklyn, NY";
        stAddress[2][1] = "Queens, NY";
        stAddress[2][2] = "Long Island, NY";
        stAddress[2][3] = "Bronx, NY";
        stAddress[2][4] = "Manhattan, NY";

        //print values from 2D arrays
        System.out.println(stAddress[2][2]); //output--> Long Island, NY
        /*
        Multidimensional array is call array of array(array inside an array)
        to print all the values from the 2D arrays, first we have to convert it into 1D
        and then print it, otherwise it is not possible to print
        we can use nested for each loop as below to print all values from 2D arrays
         */
        for (String stAd[] : stAddress) {
            for (String ad : stAd) {
                System.out.println(ad);
            }
        }
    }
}
