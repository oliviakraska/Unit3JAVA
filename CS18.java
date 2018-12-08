import java.util.Scanner;

public class CS18
{
    public static void main(String[]args)
    {
        Scanner A = new Scanner(System.in);
        
        System.out.println("Enter a intger:");
        int a =A.nextInt();
        
        int ev = 0;
        int od = 0;
       
        while(a>=0)
        {
            if(a%2 == 0)
            {
                System.out.println("Integer is even");
                System.out.println();
                ev++;
            }else
            {
                System.out.println("Integer is odd");
                od++;
            }
            System.out.println("Enter a integer:");
            a = A.nextInt();
            
            System.out.println();
            System.out.printf("There are %d evens", ev);
            System.out.println();
            System.out.printf("There are %d odds", od);
            
        }
    }
}
