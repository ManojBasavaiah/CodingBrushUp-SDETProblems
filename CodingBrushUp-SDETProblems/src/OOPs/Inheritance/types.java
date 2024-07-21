package OOPs.Inheritance;
class A{
    int a;
    void display(){
        System.out.println(a);
    }
}
// single level inheritance
class B extends A{
    int b;
    void show(){
        System.out.println(b);
    }
}
// multi level inheritance in java is possible
class C extends B{
    int c;
    void dis(){
        System.out.println(c);
    }
}

public class types {

    public static void main(String[] args) {
        C cd=new C();
        cd.a=100;
        cd.b=200;
        cd.c=300;
        cd.display();
        cd.show();
        cd.dis();

    }
}
