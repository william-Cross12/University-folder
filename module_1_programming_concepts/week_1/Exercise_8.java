import java.util.Scanner;
public class Exercise_8 {
    public static void main(String[] args)
    {
        final int FEET_MILES = 5280;                      //assigns constant
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of feet: ");         //user inputs number of feet to be converted to miles
        Double feet = sc.nextDouble();

        Double miles = feet/FEET_MILES;                 //miles is calculated

        System.out.println("there are: " + miles + " miles in " + feet + " feet");          //suitable output message is used

        sc.close();
    }
}
