package OOPs.class_objects;

public class employee_Main {
    public static void main(String[] args) {


        Employee emp1 = new Employee(); //object
        emp1.id = 101;
        emp1.name = "john";
        emp1.job = "Postman";
        emp1.salary = 15699;
        emp1.display();

        System.out.println("\n");

        Employee emp2 = new Employee(); //object
        emp2.id = 420;
        emp2.name = "Fabio";
        emp2.job = "Plumber";
        emp2.salary = 11000;
        emp2.display();
    }
}
