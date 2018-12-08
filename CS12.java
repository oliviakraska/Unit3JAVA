import java.util.Scanner;

public class CS12
{
    public static void main(String[]args)
    {
        
        Scanner A = new Scanner(System.in);
        
        System.out.println("PB&J TIME:");
        System.out.println();
        System.out.println("What do you have?:");    //question to start
        String one=A.nextLine();
        System.out.println();
        System.out.println("Jelly?:");   //jelly
        String j=A.nextLine();
        System.out.println();
        System.out.println("Peanut Butter?:");    //peanut butter
        String pb=A.nextLine();
        System.out.println();
        System.out.println("Milk?");    //milk
        String m=A.nextLine();
        System.out.println();
        System.out.println("Bread?:");   //bread
        String b=A.nextLine();
        System.out.println();
        System.out.println();
        System.out.println("Knife?:"); //knife
        String k=A.nextLine();
        
        
        if(one.equals("Not sure"))
        {
            
            System.out.println("Alright Let's do a checkoff");
            
        }
        if(j.equals("yes"))
        {
            System.out.println("Good");
           
        }
        else
        {
            System.out.println();
            System.out.println("Ok but then your sandwich will be dry");
        }
        if(pb.equals("yes"))
        {
            System.out.println("Good");
        }
        else
        {
            System.out.println();
            System.out.println("Ok but your sandwich is going taste funny");
        }
        if(m.equals("yes"))
        {
            System.out.println("Good");
        }
        else
        {
            System.out.println();
            System.out.println("Good, cause milk is gross");
        }
        if(b.equals("yes"))
        {
            System.out.println("Good");
        }
        else
        {
            System.out.println();
            System.out.println("How else do you plan on eating it?");
        }
        if(k.equals("yes"))
        {
            System.out.println("Good");
        }
        else
        {
            System.out.println();
            System.out.println("Ok, just eat it whole then");
        }
     }
    }