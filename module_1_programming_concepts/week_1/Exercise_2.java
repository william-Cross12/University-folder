import java.util.Scanner;
public class Exercise_2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();                //user enters their name into the terminal using the scanner
        System.out.println("Hello " + name + "!");  //their inputted name is then printed out
        sc.close();
    }
}
