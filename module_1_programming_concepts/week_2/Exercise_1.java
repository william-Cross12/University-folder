import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Exercise_1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Date of birth YYYY-MM-DD: "); //enters date of birth
        String age = sc.nextLine();

        LocalDate dob = LocalDate.parse(age);       //converts to date data type
        LocalDate now = LocalDate.now();            //gets current date

        long days = ChronoUnit.DAYS.between(dob, now);      //calculates difference in days

        if (days>=6574.5){
            System.out.println("days since birth: " + days);        //only prints days since birth if over 18 years old
        }
        

        

        sc.close();
    }
}
