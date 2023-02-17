import java.util.Scanner;
public class Exercise_4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number one: ");
        Double one = sc.nextDouble();
        System.out.print("Enter number two: ");
        Double two= sc.nextDouble();
        Double Average = (one + two)/2;
        System.out.println("the Average is: " + Average);

        sc.close();
    }
}
