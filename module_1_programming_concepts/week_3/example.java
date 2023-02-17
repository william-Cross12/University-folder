import java.util.Scanner;
public class example {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String Student_name = sc.nextLine();
        System.out.print("Enter student id: ");
        int Student_id = sc.nextInt();
        sc.close();

        Student student = new Student(Student_name, Student_id);
        String name = student.getName();
        int id = student.getID();
        System.out.println(name);
        System.out.println(id);
    }
        
}

class Student
{
    private int id;
    private String name;

    public Student(String Student_name, int Student_id)
    {
        this.name = Student_name;
        this.id = Student_id;
    }
    public String getName()
    {
        return this.name;
    }
    public int getID()
    {
        return this.id;
    }
}

    
