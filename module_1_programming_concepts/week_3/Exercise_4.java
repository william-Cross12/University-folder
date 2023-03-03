public class Exercise_4 {
    public static void main(String[] args)
    {
        Student4 student = new Student4("Alex", 37429583);      //creates student class object
    }
    public static void print(String name, int id)
    {
        System.out.println(name);
        System.out.println(id);
    }
}

class Student4
{
    private int id;
    private String name;

    public Student4(String Student_name, int Student_id)
    {
        this.name = Student_name;
        this.id = Student_id;
    }
}