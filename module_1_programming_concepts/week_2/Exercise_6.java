import java.util.Scanner;
public class Exercise_6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int thing = 0;
        
        do
        {
            System.out.print("what x tabels do you want: ");        //asks user what x tables they want (they enter a number)
            int num = sc.nextInt();
            int count = 1;
            while(count < 13){
                System.out.println(count + " x " + num + " = " + (count*num));      //prints x tables in required format using inputted number
                count++;
            }
            System.out.println("continue (y/n): ");         //if user wants to continue it will not break the loop and they will go back to the top, if they say n then it exits the loop and says "goodbye"
            String con;
            con = (sc.next().toLowerCase());
            if ("n".equals(con))
            {
                thing = 1;
            }

        }
        while(thing==0);
        System.out.println("goodbye");
        
        sc.close();
    }
}
