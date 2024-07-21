
package OOPs.how_to_pass_arguments_in_main_method;

public class main {
    public static void main(String a[]) {
        //to pass arguments in main method we use String a[]
        // we have to pass it during run time in configuration file or command line arguments

        System.out.println("Hello "+a[0]);
        System.out.println("Hello "+a[1]);
        System.out.println(a.length);


    }

}
