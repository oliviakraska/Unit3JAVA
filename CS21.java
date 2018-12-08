import java.util.Scanner;
 
public class CS21

{
    public static void main(String[]args)
    {
        Scanner A = new Scanner(System.in);
        
        for(int r = 0; r<13; r++)
        {
            for(int c = 0;c<13; c++)
            {
               System.out.print(r*c+"\t");
           
            }
            System.out.println();
             
        }
        
    }
}
