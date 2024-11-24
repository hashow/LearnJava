package datastructure;
/*
3D Array:
---------
3D = 1D array + 2D array (combination of these two)
First size then row and column
Syntax:
DataType[size][row][column] = new DataType[size][row][column]
*/
public class ThreeDArray {
    static String[][][] pizza = new String[5][3][4]; //declaring 3D array
    /*
    [5][3][4] --> meaning
    [5] is --> size
    [3] is --> row
    [4] is --> column

    Note: in this context, we can define up to 3 rows
    */
    public static void main(String[] args) {
        //row 1
        pizza[0][0][0]="John's Pizza";
        pizza[0][0][1]="Sicilian";
        pizza[0][0][2]="Slices";
        pizza[0][0][3]="$5";

        //row 2
        pizza[1][0][0]="Pizza Hut";
        pizza[1][1][1]="Cheese";
        pizza[1][1][2]="Pie";
        pizza[1][1][3]="$12";

        //row 3
        pizza[2][2][0]="Domino's";
        pizza[2][2][1]="Veggie";
        pizza[2][2][2]="Special Deal";
        pizza[2][2][3]="$20";

        System.out.println(pizza[1][1][1]);

        //to print all values, nested for each loop can be used
        for (String pizzaNY[][] : pizza){
            for (String pizzaInfo[] : pizzaNY) {
                for (String pizzaDecision : pizzaInfo) {
                    System.out.println(pizzaDecision);
                }
            }
        }
    }
}
