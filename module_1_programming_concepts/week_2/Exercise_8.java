import java.util.Scanner;
public class Exercise_8 {
    public static Boolean isEven (Integer i) {

        return (i % 2) == 0;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter start num: ");
        int num = sc.nextInt();

        for(int nums = 0; nums<20; num++, nums++)
        {
            if(isEven(num)){
                System.out.println(num);
            }
        }


        sc.close();
    }
}
