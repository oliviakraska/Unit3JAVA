import java.util.Scanner;
public class CS23
{
    public static void main(String[]args)
    {
        Scanner A = new Scanner(System.in);
        System.out.println("Enter a integer less than 15:");
        int a = A.nextInt();
        System.out.println("Enter one more integer less than 15:");
        int b = A.nextInt();
        System.out.println();
        
        for(int r = 0; r<a; r++)
        {
            
           for(int c = 0; c<b; c++)
           {
               System.out.print("*");
           }
           
           System.out.println();
        }
        
        
        
        
    }
}