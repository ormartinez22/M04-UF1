import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        final int FINAL=-1;//Constant
        int grade=0;
        //i-
        Scanner entrance=new Scanner(System.in);
        //ii-
      int [] grades= new int[11];
      int totalGrades=0;
      while (grade!=FINAL){
               //iii-
               grades[grade]++;
               totalGrades++;
               
               //iv
               grade=entrance.nextInt();
             
      }
      //v-
        if(totalGrades==0){
           System.out.println("there is no grade") ;
        } else {
            for(int i=10; i>=0 ; i--){
               System.out.format("%2d  ==> %.2f%n" , i ,grades[i]*100.0/totalGrades);
            }
        }    
    }
}






























