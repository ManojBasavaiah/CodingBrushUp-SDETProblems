package OOPs.methods_constructors;

public class Greetings {
    //Methods
    //1) No parameters No return value
    void m1(){
        System.out.println("Hello");
    }
    //2) No params Return value
    String m2(){
        return("Hello World, How are you");
    }
    //3) takes params no return value
    void m3(String name){
        System.out.println("Hello"+" "+name);
    }
    //4) takes params and returns value
    String m3(String name1,int value){
        return("Hello"+" "+name1+" "+value);
    }
}
