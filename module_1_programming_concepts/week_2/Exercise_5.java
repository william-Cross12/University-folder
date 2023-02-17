import java.util.Scanner;
public class Exercise_5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("what x tabels do you want: ");
        int num = sc.nextInt();
        int count = 1;
        while(count < 13){
            System.out.println(count + " x " + num + " = " + (count*num));
            count++;
        }
        sc.close();
    }
}
