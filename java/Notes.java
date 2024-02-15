import java.util.ArrayList;

public class Notes {

    public static void MyNotes(){
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

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
    }

    /*
     * Java OOP
     * Encapsulation - Inheritance - Polymorphism
     * 
     * Encapsulation :
     * The fact of using classes
     * 
     * Inheritance :
     * Parent-Child classes, extending classes, superclasses
     * 
     * Polymorphysm :
     * Overloading + Overriding
     * 
     * 
     */
        
    
}
