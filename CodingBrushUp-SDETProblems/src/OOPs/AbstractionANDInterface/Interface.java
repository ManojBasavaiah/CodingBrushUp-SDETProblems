package OOPs.AbstractionANDInterface;
interface shape{ // Interface with abstract method area
    int length=10; // final variable
    static int width=20; // static variable
    void circleArea(); // abstract method
    default void squareArea(){
        System.out.println("Area of square is "+(length*width));
    }
    static void rectangleArea(){
        System.out.println("Area of rectangle is "+(length*width));
    }
}

public class Interface implements shape {
    public void circleArea(){
        System.out.println("Area of circle is "+(3.14*length*length));
    }
    void triangleArea(){
        System.out.println("Area of triangle is "+(0.5*length*width));
    }

    public static void main(String[] args) {

        //Scenario 1
        Interface i=new Interface();
        i.circleArea(); // method call from class using class name and . operator
        i.squareArea();// default method call from interface class using interface name and . operator only
        shape.rectangleArea(); // static method call from interface class using interface name and . operator only
        i.triangleArea();
        System.out.println("-----------------------------------------------");
        //Scenario 2
        shape s=new Interface(); // we can create object of interface class which helps to use abstract methods of interface
        s.circleArea();
        s.squareArea();
        shape.rectangleArea();
        //s.triangleArea(); // this will not work as it is not an abstract method in interface class
        System.out.println(shape.length+shape.width);
    }
}
