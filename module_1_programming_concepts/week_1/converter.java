package module_1_programming_concepts.week_1;
import java.util.Scanner;
public class converter {
    public static void main(String[] args)
    {
        int FEET_MILES = 5280;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of feet: ");
        Double feet = sc.nextDouble();

        Double miles = feet/FEET_MILES;

        System.out.println("there are: " + miles + " miles in " + feet + " feet");

        sc.close();
    }
}
