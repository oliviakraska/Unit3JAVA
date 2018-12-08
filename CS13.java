import java.util.Scanner;

public class CS13
{
    public static void main(String[]args)
    {   Scanner A = new Scanner(System.in);
        
        System.out.println("Enter a integer less than 20:");
        int b =A.nextInt();
        System.out.println();
        System.out.println();
        
        if(b%2 == 0)
        {
            System.out.println();
            System.out.println("2 is a factor");
        }
        if(b%3 == 0)
        {
            System.out.println();
            System.out.println("3 is a factor");
        }
        if(b%5 == 0)
        {
            System.out.println();
            System.out.println("5 is a factor");
        }
        if(b%7 == 0)
        {
            System.out.println();
            System.out.println("7 is a factor");   
        }
        if(b%11 == 0)
        {
            System.out.println();
            System.out.println("11 is a factor"); 
        }
        if(b%13 == 0)
        {
            System.out.println();
            System.out.println("13 is a factor");  
        }
        if(b%17 == 0)
        {
            System.out.println();
            System.out.println("17 is a factor");  
        }
        if(b%19 == 0)
        {
            System.out.println();
            System.out.println("19 is a factor");  
        }
    
    
    
    
    
    
    
    
    }
}