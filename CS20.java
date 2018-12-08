import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class CS20
{
    public static void main(String[]args)
    {
        Scanner A = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("Enter a integer:");
        int a = A.nextInt();
        
        
        for(int n = 1; n<9; n++)
        {
            int m = rand.nextInt(50);
            int y = rand.nextInt(50);
            int g = rand.nextInt(50);
            int l = rand.nextInt(50);
            
            System.out.printf("%d %d %d %d\n",m,y,g,l);
            
        }
        
    }
    
}
