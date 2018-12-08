import java.util.Scanner;
import java.lang.Math;

public class GradeBook
{
    public static void main(String[]args)
    {
        Scanner A = new Scanner(System.in);
        
        System.out.print("                  Simple Gradebook");
        System.out.println();
        System.out.println();
        
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;
        
        int q = 0;
        int hw = 0;
        int p = 0;
        
        int aa = 0;
        int bb = 0;
        int cc = 0;
        int dd = 0;
        int ff = 0;
        
        int tp = 0;
       
        
        System.out.print("Would you like to use the gradebook? yes or no");
        System.out.println();
        String choice = A.next();
        
        System.out.print("Would you like to enter a quiz or homework? (quiz) or (hw)");
        String grade = A.next();
        System.out.println();
        System.out.println("TYPE done WHEN FINISHED ENTERING GRADES");
        System.out.println();
        
        
        while(grade.equals("quiz"))
        {
            System.out.print("Enter a percentage:");
            p = A.nextInt();
            q++;
            tp = tp + p;
            if(p>=90)
            {
                System.out.println("You got a A!");
                a++;
            }
            if(p>=80 && p<90)
            {
                System.out.println("You got a B!");
                b++;
            }
            if(p>=70 && p<80)
            {
                System.out.println("You got a C!");
                c++;
            }
            if(p>=60 && p<70)
            {
                System.out.println("You got a D.");
                d++;
            }
            if(p>=50 && p<60)
            {
                System.out.println("You got a F");
                f++;
            }
           
            System.out.println("Do you want to enter a quiz or hw?");
            grade = A.next();
        }
         
        while(grade.equals("hw"))
        {
            System.out.print("Enter a percentage:");
            p = A.nextInt();
            hw++;
            tp = tp + p;
            if(p>=90)
            {
                System.out.println("You got a A!");
                aa++;
            }
            if(p>=80 && p<90)
            {
                System.out.println("You got a B!");
                bb++;
            }
            if(p>=70 && p<80)
            {
                System.out.println("You got a C!");
                cc++;
            }
            if(p>=60 && p<70)
            {
                System.out.println("You got a D.");
                dd++;
            }
            if(p>=50 && p<60)
            {
                System.out.println("You got a F");
                ff++;
            }
            
            System.out.println("Do you want to enter a quiz or hw?");
            grade = A.next();
        }
         
        
        System.out.println("Do you want to compile grades?");
        String overall = A.next();
        System.out.println();
        
        if(overall.equals("yes"))
        {
            System.out.printf("Homeworks = %d",hw);
            System.out.println();
            System.out.printf("Quiz = %d", q);
            System.out.println();
            
            System.out.printf("%d Quizzes had A's",a);
            System.out.println();
            System.out.printf("%d Quizzes had B's",b);
            System.out.println();
            System.out.printf("%d Quizzes had C's",c);
            System.out.println();
            System.out.printf("%d Quizzes had D's",d);
            System.out.println();
            System.out.printf("%d Quizzes had F's",f);
            System.out.println();                          // end of quizzes
            System.out.printf("%d Homeworks had A's",aa);
            System.out.println();
            System.out.printf("%d Homeworks had B's",bb);
            System.out.println();
            System.out.printf("%d Homeworks had C's",cc);
            System.out.println();
            System.out.printf("%d Homeworks had D's",dd);
            System.out.println();
            System.out.printf("%d Homeworks had F's",ff);
            System.out.println();                          // end of homeworks
            System.out.println();                          // average grades
            System.out.printf("Average class score = %d", tp/(q+hw));
            System.out.println();
            
        }
       
        System.out.println();
        System.out.println("Do you want to know your final grade? yes or no");
        String finall = A.next();
        System.out.println(); 
        
        if(finall.equals("yes"))
        {
            System.out.print("Enter your preferred class grade");
            int g = A.nextInt();
            System.out.println();
            System.out.printf("The grade you would need on your final is %f", (g-(0.85*tp))/0.15);
            
        }
        
       
    }
    
}
