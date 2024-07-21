package OOPs.methods_constructors;

public class greetings_main {
    public static void main(String[] args) {
        //Methods calling using object reference variables
        Greetings greet1 = new Greetings();
        greet1.m1();
        String s = greet1.m2();
        System.out.println(s);
        //System.out.println(greet1.m2());
        greet1.m3("John");
        String s1 = greet1.m3("joe", 007);
        System.out.println(s1);
    }

}
