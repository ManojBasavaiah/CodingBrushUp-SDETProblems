package OOPs.AbstractionANDInterface;

public class MultipleInheritance extends C1 implements I1,I2{
    public void m1(){
        System.out.println(x);
    }
    public void m2(){
        System.out.println(y);
    }
    public static void main(String[] args) {
        MultipleInheritance I = new MultipleInheritance();
        I.m1();
        I.m2();
        I.m3();
        C1 c=new C1();
        c.m3();
        System.out.println();

    }
}
