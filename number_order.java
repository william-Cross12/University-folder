import java.util.Scanner;
public class number_order {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number one: ");
        int one = sc.nextInt();
        System.out.print("Enter number two: ");
        int two= sc.nextInt();

        System.out.println("original input order: " + one + " " + two);
        System.out.println("reversed input order: " + two + " " + one);

        sc.close();
    }
}
