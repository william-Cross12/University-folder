import java.util.Scanner;
public class Exercise_5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number one: ");
        int one = sc.nextInt();
        System.out.print("Enter number two: ");         //user enters 2 numbers
        int two= sc.nextInt();

        System.out.println("original input order: " + one + " " + two);
        System.out.println("reversed input order: " + two + " " + one);         //numbers are outputted in different orders

        sc.close();
    }
}
