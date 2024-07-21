package OOPs.Keywords;

public class Staticdemo {
    static int a = 10; //static variable
    int b = 20; //Non static variable

    static void m1() { // Static method
        System.out.println("This  is static method.....");
    }

    void m2() {
        System.out.println("This is non static method.........");
    }

    //we can use any method in non static method
    void m() { //non static method
        System.out.println(a);
        m1();
        m2();
        System.out.println(b);
    }

    public static void main(String[] args) {
        // 1) Static methods/variables can be directly called in main method in same class
        System.out.println(a);
        m1();
        //2) for Non static objects need to created
        Staticdemo sd = new Staticdemo();
        sd.m2();
        System.out.println(sd.b);
        sd.m();
    }
}
