package Patterns;

public class StarPattern {

    //Star Triangle Pattern
     public static void main(String[] args){
     StarPattern starPattern=new StarPattern();
//     starPattern.starPattern();
//     starPattern.invertedStarPattern();
//     starPattern.diamond();
         starPattern.charac();

     }

     public void starPattern(){
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void invertedStarPattern(){
         for (int i=1;i<=4;i++){
             for (int j=4;j>=i;j--){
                 System.out.print("*");
             }
             System.out.println();

         }
    }
    void diamond(){
         for(int i=0;i<5;i++){
             for(int j=1;j<5-i;j++){
                 System.out.print("  ");
             }
             for(int j=1; j<=(2*i)+1;j++){
                 System.out.print("* ");
             }
             for(int j=0; j<i;j++) {
                 System.out.print(" ");
             }
             System.out.println();
         }
         for(int i=0; i<5;i++){
             for(int j=0;j<i;j++){
                 System.out.print("  ");
             }
             for(int j=1; j<=((2*5))-((2*i)+1);j++){
                 System.out.print("* ");
             }
             for(int j=0; j<i;j++){
                 System.out.print(" ");
             }
             System.out.println();
         }
    }
    void charac(){
         for(int i=0;i<5;i++){
             char ch= (char) ('E'-i);
             for(int j=1; j<=5-i;j++){
                 System.out.print(ch+" ");
             }
             System.out.println();
         }
    }

}
