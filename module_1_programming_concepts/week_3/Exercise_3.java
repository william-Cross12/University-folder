public class Exercise_3 {
    public static void main(String[] args)
    {
    }
    public static void print(String name, int id)       //creates a method to print values from student class
    {
        System.out.println(name);
        System.out.println(id);
    }
}

class Student3
{
    private int id;
    private String name;

    public Student3(String Student_name, int Student_id)
    {
        this.name = Student_name;
        this.id = Student_id;
    }
}