public class InheritanceExo1 {

    public class Animal {

        public static void makeSound(){
            System.out.println("A sound");
        }
    }

    public class Cat extends Animal {

        public static void makeSound(){
            System.out.println("A cat sound");
        }
    }
}