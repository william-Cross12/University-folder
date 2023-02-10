package module_1_programming_concepts.week_2;
import java.util.Scanner;

public class Exercise_2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your grade (A, B, C, D, E or F): ");
        char grade = sc.next().charAt(0);

        switch(grade)
        {
            case'A': System.out.println("1st");break;
            case'B': System.out.println("2:1");break;
            case'C': System.out.println("2:2");break;
            case'D': System.out.println("3rd");break;
            case'E': System.out.println("ordinary");break;
            case'F': System.out.println("fail");break;
            default: System.out.println("invalid entry");
        }



        sc.close();
    }
}
