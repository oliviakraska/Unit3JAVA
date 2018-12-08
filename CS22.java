import java.util.Scanner;
public class CS22
{
    public static void main(String[]args)
    {
        Scanner A = new Scanner(System.in);
            System.out.println("Enter a integer:");
            int p = A.nextInt();
            
        for( int r = 0; r<p; r++)
        {
            for(int c = 0; c<p; c++)
            {
                if(r%2 == c%2)
                {
                    System.out.print(0+"\t");
                }
                else
                {
                    System.out.print(1+"\t");
                }
                   
            }
            
            System.out.println();
        }
    }
}