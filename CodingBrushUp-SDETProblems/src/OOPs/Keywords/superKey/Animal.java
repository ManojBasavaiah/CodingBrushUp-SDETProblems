package OOPs.Keywords.superKey;

public class Animal {
    String color = "White";
    void displayColor(){
        System.out.println(color);
    }
}

class Dog extends Animal {
    String color = "Black";
    /*void displayColor(){
        System.out.println(super.color); //prints White as super refers to parent class
    }*/

    void displayColor() {
        System.out.println(color);//prints Black as super refers to child class
        super.displayColor();// prints White as super refers to parent class
    }
}