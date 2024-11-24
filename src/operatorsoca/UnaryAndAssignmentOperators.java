package operatorsoca;

public class UnaryAndAssignmentOperators {

    public static void main(String[] args) {

        boolean x = true;
        //! (! sign used as not)
        x = !x;
        System.out.println(x);//x inverts false

        //negation operator
        double y = 6.73;
        y = -y;
        System.out.println(y);

        //Tricky questions in OCA exam:
        //! not operator, we only can use with boolean data type, not with others like int
        int z = 5;
        //z = !z;//does not compile

    }
}
