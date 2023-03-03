import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Exercise_7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Date of birth YYYY-MM-DD: ");      //year of birth inputted by user
        String age = sc.nextLine();

        LocalDate dob = LocalDate.parse(age);       //changes input to a proper datetime variable and not a string
        LocalDate now = LocalDate.now();            //assigns current date to now

        long days = ChronoUnit.DAYS.between(dob, now);          //calculates the number of days between the 2 dates

        System.out.println("days since birth: " + days);            //prints the date differnce

        

        sc.close();
    }
}
