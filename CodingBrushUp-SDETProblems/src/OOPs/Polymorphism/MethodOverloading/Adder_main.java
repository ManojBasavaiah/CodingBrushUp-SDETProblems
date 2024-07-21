package OOPs.Polymorphism.MethodOverloading;

public class Adder_main {
    public static void main(String[] args) {
        Adder addObj = new Adder();
        addObj.sum();
        addObj.sum(55, 76);
        addObj.sum(12, 56.9785);
        addObj.sum(45.86875, 90);
        addObj.sum(34, 12, 0.6f);
    }
}
