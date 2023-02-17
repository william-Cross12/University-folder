import java.util.Scanner;
public class Exercise_3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rectangle Length: ");
        int Length = sc.nextInt();
        System.out.print("Enter rectangle Height: ");
        int Height = sc.nextInt();
        int Area = Length * Height;
        int Perimeter = ((Length*2) + (Height*2));
        System.out.println("Area: " + Area);
        System.out.println("Perimeter: " + Perimeter);

        sc.close();
    }
}
