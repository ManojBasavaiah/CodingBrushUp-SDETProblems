package OOPs.Keywords;
class A{
    void m1(){
        System.out.println("This is m1 method");
    }
    final void m2(){
        System.out.println("This is m2 method");
    }
}

class B extends A{
    void m1(int a){
        System.out.println("This is m1 method"+a);
    }
    /* we cannot override final method in child class
    void m2(){
        System.out.println("This is m2 child method");
    }*/
}

public class finalMethod {
    public static void main(String[] args) {
        B b = new B();
        b.m1(10);
        b.m1();
        System.out.println("--------------------------------------------------");
       // b.m2()="Apple"; //we can not change value of final method here as it is final
        A aa=new A();
        aa.m1();
        aa.m2();


    }
}
