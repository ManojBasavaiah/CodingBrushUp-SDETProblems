package OOPs.Inheritance;
class Parent{
    void display(int a){
        System.out.println(a);
    }
}
// below is the example of hierarchical inheritance
// child1 inherits from parent and has its own show method
class child1 extends Parent{
    void show(int b){
        System.out.println(b);
    }
}
// child2 inherits from parent and has its own dis method
class child2 extends Parent{
    void dis(int c){
        System.out.println(c);
    }
}


public class hierarchyInheritance {
    public static void main(String[] args) {
        child1 cd1=new child1();
        cd1.display(1000);
        cd1.show(20000);
        System.out.println("\n+-----------------------------------------------+\n");
        child2 cd2= new child2();
        cd2.display(28432);
        cd2.dis(45000);

    }
}
