package strings;

public class JavaStrings {

    public static void main(String[] args) {
    /*
    Two ways to create String:
    1. String str = "Java";
    2. String str1 = new String("Java");
     */
        String str = "Java";
        String str1 = new String("Java");
        /*
        concatenation:
        We add numbers as:
        int x = 2 + 4;//values of these two numbers are getting added
        What about "1" + "2" ?
        "1" + "2" - this statement is different from this 2 + 4
        "1" + "2" - values of these two Strings would be 13
        We are basically joining two Strings by using plus (+) operators
         */
        String x = 1 + "2";
        System.out.println(x);//12
        System.out.println(1 + 2);//3
        System.out.println("a" + "b");//ab
        System.out.println("a" + "b" + 3);//ab3
        System.out.println(1 + 2 + "c");//3c

        /*
        What is the output of the following program?
        */
        String s = "1";//s holds 1
        s+="2";//since it is String so, it will concatenate and the result is: 12 (one two)
        s+=3;//since one of the operand (s) is String so, it will also concatenate and the result will be: 123

        System.out.println(s);



    }
}
