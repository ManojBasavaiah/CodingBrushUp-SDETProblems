package OOPs.methods_constructors;

public class student_main {
    public static void main(String[] args) {
        //student s1=new student();
        //1) using object reference variables
        /*s1.id= 342;
        s1.name="Varun";
        s1.grade="A";
        s1.printStudentData();*/
        //2) using method just stores the data
//        s1.setStudentData(101, "Ullas",'A');
//        s1.printStudentData();
        //3) using constructors
        student stu = new student(234, "Kevin", 'A');
        stu.printStudentData();

    }
}
