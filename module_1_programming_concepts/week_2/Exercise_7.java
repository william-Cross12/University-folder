import java.util.Scanner;
public class Exercise_7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter exam mark: ");          //user enters their mark
        int mark = sc.nextInt();

        if(mark>=0 && mark<=39)
            System.out.println("failed attempt");           //conditional statements then used to determin which bound they fall in which will then be outputted
        else if(mark<=49)
            System.out.println("pass");
        else if(mark<=59)
            System.out.println("2:2");
        else if(mark<=69)
            System.out.println("2:1");
        else if(mark<=100)
            System.out.println("1st");
        else
            System.out.println("Invalid mark");         //if they put an invalid mark in (less than 0 or over 100) this line is ran


        sc.close();
    }
}
