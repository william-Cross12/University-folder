import java.util.Scanner;
public class interest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter deposit number: ");
        Float deposit = sc.nextFloat();
        Float step = (deposit/100);

        System.out.println("deposit after a year: " + Float.sum(deposit, step));

        sc.close();
    }
}
