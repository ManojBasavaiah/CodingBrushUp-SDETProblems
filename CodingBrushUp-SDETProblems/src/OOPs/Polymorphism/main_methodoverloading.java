package OOPs.Polymorphism;

public class main_methodoverloading {
    void main(int x) {
        System.out.println(x);
    }

    void main(String s) {
        System.out.println(s);
    }

    void main(String s1, String s2) {
        System.out.println(s1 + s2);
    }

    public static void main(String[] args) {
        main_methodoverloading mmo = new main_methodoverloading();
        mmo.main(59);
        mmo.main("das");
        mmo.main("sfd", "jgf");
    }
}
