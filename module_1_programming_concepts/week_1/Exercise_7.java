import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Exercise_7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Date of birth YYYY-MM-DD: ");
        String age = sc.nextLine();

        LocalDate dob = LocalDate.parse(age); 
        LocalDate now = LocalDate.now();

        long days = ChronoUnit.DAYS.between(dob, now);

        System.out.println("days since birth: " + days);

        

        sc.close();
    }
}
