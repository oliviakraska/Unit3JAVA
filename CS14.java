import java.util.Scanner;

public class CS14
{
    public static void main(String[]args)
    {
        Scanner A = new Scanner(System.in);
        
        System.out.println("What day of the week is it?:");
        String day=A.next();
        System.out.println();
         
        if(day.equals("sunday"))
        {
            System.out.println();
            System.out.println("The school schedule is, NONE!!!");
            System.out.println("TIME FOR SLEEP AND RELAXATION");
            System.out.println("Wake up when you feel like, and do HW!!");
        }
        if(day.equals("monday"))
        {
            System.out.println();
            System.out.println("The school schedule is 1,2,3,4,5,6");
            System.out.println("Workouts are after school at 3, ALL STATE");
            System.out.println("Wake up at 5:50am, don't get out of bed until 6:30");
        }
        if(day.equals("tuesday"))
        {
            System.out.println();
            System.out.println("Wake up at 5:50am, don't get out of bed until 6:30");
            System.out.println("FREE PERIOD DAY, 1 2 3 4 is the schedule");
            System.out.println("Cardio workout at 2:45, WORK ON ABS");
           
        }
        if(day.equals("wednesday"))
        {
            System.out.println();
            System.out.println("Wake up at 5:50am, dress up a little");
            System.out.println("FREE PERIOD DAY, 2 3 5 6, go get some lunch");
            System.out.println("PUMP THAT IRON at 3, take a nap");
            
        }
        if(day.equals("thursday"))
        {
            System.out.println();
            System.out.println("Wake up at 5:50am, go get some coffee");
            System.out.println("no free period, 1 3 4 6, just stay awake..");
            System.out.println("CARDIO TIME!!! Lathrop weight room, then HW");
        }
        if(day.equals("friday"))
        {
            System.out.println();
            System.out.println("Wake up at 6:00am, it's FRIDAY YAYYY!!");
            System.out.println("short periods, 1 2 3 4 5 6");
            System.out.println("Workout at 3, go to dad's practice after");
        }
        if(day.equals("saturday"))
        {
          System.out.println();
          System.out.println("SLEEP IN, eat some good breakfast");
          System.out.println("go to the gym, go through all your drills");
          System.out.println("hit up your friends, go see outside and get off the couch!!");
          
        }
        
        
        
        
    }
}
