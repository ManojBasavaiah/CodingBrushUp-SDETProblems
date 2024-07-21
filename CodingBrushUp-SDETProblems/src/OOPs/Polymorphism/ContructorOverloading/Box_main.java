package OOPs.Polymorphism.ContructorOverloading;

public class Box_main {
    public static void main(String[] args) {
        //Box b=new Box();
        Box bx=new Box();
        double vol=bx.volume();
        System.out.println(vol);
        //Box b=new Box(10,20,12);
        Box b=new Box(10,20,12);
        System.out.println(b.volume());
        //Box b=new Box(10);
        Box b1=new Box(10.0);
        System.out.println(b1.volume());
    }
}
