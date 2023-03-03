import java.util.Scanner;
public class Exercise_3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rectangle Length: ");
        int Length = sc.nextInt();                             //user enters length of a rectangle into the terminal using the scanner
        System.out.print("Enter rectangle Height: ");
        int Height = sc.nextInt();                             //user enters height of a rectangle into the terminal using the scanner
        int Area = Length * Height;
        int Perimeter = ((Length*2) + (Height*2));      //area and perimeter are then calculatedc and assigned to variables
        System.out.println("Area: " + Area);
        System.out.println("Perimeter: " + Perimeter);      //area and perimeter are then outputed

        sc.close();
    }
}
