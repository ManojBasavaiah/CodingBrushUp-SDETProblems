package OOPs.Keywords;

public class Thiskeyword {
    int x, y; //class variables

    Thiskeyword(int x, int y) {//local variables
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        Thiskeyword th = new Thiskeyword(50, 20);
        th.display();
    }
}
