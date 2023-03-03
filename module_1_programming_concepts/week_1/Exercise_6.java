import java.time.Year;
 import java.util.Scanner;
 public class Exercise_6 {
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter your age: ");          //user enters their age
         int age = sc.nextInt();

         int year = Year.now().getValue();      //current year is set to year variable

         int year_born = (year - age);              //year born is then calculated

         System.out.println("you where born in: " + year_born);         //year born is outputted

         sc.close();
     }
 }