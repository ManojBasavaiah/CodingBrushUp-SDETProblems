package OOPs.Inheritance;
class Bank{
    double roi(){
        return 0;
    }
}
//below class will be overriden by child class SBI and ICICI class with same method name
// and same return type and same parameters but with different implementation
class ICICI extends Bank{
    double roi(){
        return 8.5;
    }
}
class SBI extends Bank{
    double roi(){
        return 9.5;
    }
}

public class Overridding {
    public static void main(String[] args) {

        Bank b = new Bank();
        ICICI i = new ICICI();
        SBI s = new SBI();
        System.out.println(b.roi());
        System.out.println(i.roi());
        System.out.println(s.roi());

    }
}
