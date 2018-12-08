import java.util.Scanner;

public class CS17
{
    public static void main(String[]args)
    {
        Scanner A = new Scanner(System.in);
        
        System.out.println("Enter a integer:");
        int total = 0;
        double av = 0;
        
        for(int a = 0; a<7; a++)
        {
            System.out.println("Enter a integer:");
            int num =A.nextInt();
            System.out.println();
            total=num+total;
            av=total/7;
            System.out.println();
            System.out.printf("Sum=%d",total);
            System.out.println();
            System.out.printf("Average=%f",av);
          
        }
        
    }
}
