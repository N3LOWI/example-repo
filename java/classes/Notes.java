package classes;
import java.util.ArrayList;

public class Notes {

    public static void MyNotes(){

        String txt = "Hello";
        System.out.println(txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.indexOf("x"));
        System.out.println(txt.concat(txt));

        int time = 20;
        String result = (time < 18)? "Good day." : "Good evening.";
        System.out.println(result);

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
    }
        
    
}
