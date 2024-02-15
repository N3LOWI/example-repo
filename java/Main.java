

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello, World!");

        //Notes notes = new Notes();
        //notes.MyNotes();

        //Only possible because MyNotes is STATIC
        //Notes.MyNotes();

        InheritanceExo1.Animal.makeSound();
        InheritanceExo1.Cat.makeSound();

        //CALLING an "inner non-static class" :
        InheritanceExo3 obj = new InheritanceExo3();
        InheritanceExo3.Shape shape = obj.new Shape();
        
        InheritanceExo3.Rectangle rectangle = obj.new Rectangle(3, 3);

        System.out.println(shape.getArea(9));
        System.out.println(shape.getArea());
        System.out.println(rectangle.getArea());

        


    }
}
