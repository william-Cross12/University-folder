import java.util.Scanner;
public class Exercise_9 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter deposit number: ");         //user enters initial deposit
        Float deposit = sc.nextFloat();
        Float step = (deposit/100);                     //1% increase is then calculated

        System.out.println("deposit after a year: " + Float.sum(deposit, step));        //1% increase outputted

        sc.close();
    }
}
