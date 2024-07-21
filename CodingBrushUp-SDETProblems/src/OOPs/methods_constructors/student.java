package OOPs.methods_constructors;

public class student {
    int id;
    String name;
    char grade;

    void printStudentData() {
        System.out.println(id + "  " + name + "  " + grade);
    }

    void setStudentData(int ID, String NAME, char GRADE) {
        id = ID;
        name = NAME;
        grade = GRADE;
    }

    //constructor-->
    // It only used for initialization, methods will have logic
    // consturctor name should be same as class, methods name can be anything
    // has no return type, methods may have return type
    // both methods and constructors can have params
    student(int ID, String NAME, char GRADE) {
        id = ID;
        name = NAME;
        grade = GRADE;
    }
    //For any operations prefer methods else constructors
}
