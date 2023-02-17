import java.time.Year;
 import java.util.Scanner;
 public class Exercise_6 {
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter your age: ");
         int age = sc.nextInt();

         int year = Year.now().getValue();

         int year_born = (year - age);

         System.out.println("you where born in: " + year_born);

         sc.close();
     }
 }