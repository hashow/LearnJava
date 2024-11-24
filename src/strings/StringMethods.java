package strings;

public class StringMethods {
    public static void main(String[] args) {

        String s = "Selenium";
        System.out.println(s.length());//returns string size, which is: 8

        s = "animals";
        System.out.println(s.charAt(0));//A
        System.out.println(s.charAt(4));//a

        //indexOf() method variations
        System.out.println(s.indexOf('a'));//first index where character 'a' is found
        System.out.println(s.indexOf("al"));//in al, starting index for a is 4, print 4
        System.out.println(s.indexOf('a',4));//in this case, 4 is starting index
        /*
        System.out.println(s.indexOf('a',4));//in this case, 4 is starting index
        It means that search for this character 'a' and start searching 'a' from 4th index
        */
        System.out.println(s.indexOf("al",5)); //-1
        /*
        System.out.println(s.indexOf("al",5)); //-1
        Whenever we pass a character or Strings, and it is not present in the String or from where the
        index is given to search for it is not present, it will return -1 as output
        */
    }
}
