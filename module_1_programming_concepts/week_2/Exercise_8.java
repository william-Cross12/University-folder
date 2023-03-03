import java.util.Scanner;
public class Exercise_8 {
    public static Boolean isEven (Integer i) {      //method to check if a value is even

        return (i % 2) == 0;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter start num: ");      //user chooses number to start from
        int num = sc.nextInt();

        for(int nums = 0; nums<20; num++, nums++)       //for loop used to get the next 10 even numbers from the user inputted number
        {
            if(isEven(num)){
                System.out.println(num);
            }
        }


        sc.close();
    }
}
