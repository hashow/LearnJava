package operatorsoca;

public class IncrementAndDecrementOperators {

    public static void main(String[] args) {
        /*
        The value of the operand(x is operand) will be incremented first
        so, x = 6 +1 = 7
        The operation is happened first and then the result is stored in the variable z
        the value of z is now 7
        */
        int x = 6;
        int z = ++x;
        System.out.println(z);//7

        //Find the value of x and y
        int a = 3;
        int b = ++a * 5 / a-- + --a;
        //int b = (3+1) * 5 / a-- + --a;//a will get decremented to 3
        //int b = 4 * 5 / 4 + --a;// x is assigned the value of 2
        //int b = 20 / 4 + 2;
        //int b = 5 + 2;
        //int b = 7; and x = 2 is the answer
        System.out.println(a);
        System.out.println(b);

        byte i =(byte) 130;
        System.out.println(i);
        /*
        Why the last line of statement will not compile?
        ------------------------------------------------
        short j = 10;
        short k = 3;
        short l = j * k;//doesn't compile
        Answer:
        -------
        Because, short values are automatically promoted to int when applying on arithmetic operator.
        So, the resulting value is type of int.
        Trying to set short variable into int, results a compiler error.
        Java thinks, we are trying to implicitly convert from a larger data type to a smaller data type
        So, the solution is as below
        */
        short j = 10;
        short k = 3;
        short l = (short) (j * k);//compiler error why?
        System.out.println(l);

        //Compound assignment operator:
        int m = 2, n = 3;
        m = m * n;
        m *= n;//shorthand operator/complex operator/ compound assignment operator
        /*
        second and third expression is basically the same.
        saving some space (m =) from second statement and writing in short in the third expression
         */
        System.out.println(m);
        System.out.println(n);
    }
}
