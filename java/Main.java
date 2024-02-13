import java.util.*;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello, World!");

        //  Type casting
        double myDouble = 9.78d;
        int myInt = (int)myDouble;

        //  ++x = x++

        String txt = "Hello";
        System.out.println(txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.indexOf("x"));
        System.out.println(txt.concat(txt));

        int time = 20;
        String result = (time < 18)? "Good day." : "Good evening.";
        System.out.println(result); 

        
        


    }
}
