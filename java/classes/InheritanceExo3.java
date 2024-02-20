package classes;
public class InheritanceExo3 {

    public class Shape {

        //Original get Area method
        public double getArea(){
            return 0;
        }
        //Overload ("expantion") of Area method
        public double getArea(int area){
            return area;
        }
        //Overload ("expantion") of Area method
        public double getArea(double area){
            return area;
        }

    }

    public class Rectangle extends Shape {
        private double length;
        private double width;

        public Rectangle(double length, double width){
            this.length = length;
            this.width = width;
        }
        
        //Override of Area method
        @Override
        public double getArea(){
            return length * width;
        }
    }
}