package basic;

public class PrintStatements {
    /**
    Note: A class is a collection of related code, and it should be a unique name for a class.
    This class has .java file extension. This is source code.
    All code we see here are human read able format and human can easily read and understand.
    While we compile source code to bytecode, that create a new file that has .class file
    extension and with that byte code file we can run that and translate it using a jvm (Java Virtual Machine).
     */
    public static void main(String[] args) {
        /*
         Anything within the outer set of curly braces belongs to the class and within and within our class
         we have what is called a main method. Our program won't run without this main method because when
         we run our code we begin by calling the main method. So, if we were to compile and run this code
         all output is displayed to the console window. Any code within the main method execute starting at the top
         and then work its way down.
         */
        System.out.print("Java is fun to learn");
        System.out.println("Just need determination");
        /*
         It prints both statement in one line because our cursor doesn't move down to the next line.
         If we want our cursor to move to the next line then we have to use println
         */
        System.out.println("..................................");
        System.out.println("Java is fun to learn");
        System.out.println("Just need determination");

        /*
        We can use escape sequence (\n) for a new line
        This has the same effect as println statement
        */
        System.out.println("....Uses of escape sequences....");
        System.out.print("Java is fun to learn\n");
        System.out.print("Java is fun to learn");
        System.out.println("....Uses of escape sequences....");
        System.out.println("\tJava is fun to learn");
    }
}
