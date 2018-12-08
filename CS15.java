import java.util.Scanner;
import java.lang.Math;

public class CS15
{
 public static void main(String[]args)

    
    { Scanner A = new Scanner(System.in);
    
       System.out.println("Solve For CELSIUS");
       System.out.println("Solve For SLOPE");
       System.out.println("Solve for AREA");
       System.out.println("Solve for PC"); //percent change
       System.out.println();
       System.out.println("Enter the keyword to solve the formula:");
       System.out.println();
       System.out.println("Solve For:");
       String one=A.nextLine();
       
        if(one.equals("CELSIUS"))
       {
           System.out.println("Enter F:");
           double F = A.nextDouble();
           System.out.printf("Celsius equals %.2f",(F-32)*(5/9));
           
           
        }
       if(one.equals("AREA"))
       {
           
           System.out.println("Enter a:");
           System.out.println("Enter b:");
           
           int a = A.nextInt ();
           int b = A.nextInt ();
           
           System.out.println();
           System.out.printf("Formula: %d*%d=A",a,b);
           System.out.println();
           System.out.print(a*b);
           
           
                                                                              
           
        }
        if(one.equals("SLOPE"))
        {
            
            System.out.print("Enter x1:");
            int x = A.nextInt();
            System.out.print("Enter x2:");
            int a = A.nextInt();
            System.out.print("Enter y1:");
            int y = A.nextInt();
            System.out.print("Enter y2:");
            int b = A.nextInt();
            
            System.out.printf("SLOPE = (%d-%d)/(%d-%d)",a,x,b,y);
            System.out.println();
            System.out.println((a-x)/(b-y));
            
            
         
        }
        if(one.equals("PC"))
        {
          System.out.print("Enter change:");
          double c =A.nextDouble();
          System.out.println("Enter original:");
          double o = A.nextDouble();
          System.out.println();
          
          System.out.printf("Percent Change = (%f/%f)*100",c,o);
          System.out.println();
          System.out.println((c/o)*100);
        }
    }
 
}
