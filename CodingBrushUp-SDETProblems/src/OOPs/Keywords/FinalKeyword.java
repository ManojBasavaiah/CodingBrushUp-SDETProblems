package OOPs.Keywords;
class test{
    final int x=10;
}

public class FinalKeyword {
    public static void main(String[] args) {
        test t=new test();
        //t.x=20;// we can not change value of final variable here as it is final
        System.out.println(t.x);
    }
}
