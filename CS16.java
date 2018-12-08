import java.util.Scanner;

 public class CS16
 {
     public static void main(String[]args)
    {
        Scanner A = new Scanner(System.in);
        
        System.out.println("Enter a integer:");
        int a =A.nextInt();
        
        
        while(a>0) 
         {
             
             if(a%2 == 0)
             {
                
               System.out.println("Number is Even");
                
             }
             else
             {
               System.out.println("Number is Odd");
             }
             System.out.println("Enter a integer:");
             a = A.nextInt();
             
         }
      }
 }

