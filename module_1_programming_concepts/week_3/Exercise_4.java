public class Exercise_4 {
    public static void main(String[] args)
    {
        String Student_name = "Alex";
        int Student_id = 37429583;
        Student4 student = new Student4(Student_name, Student_id);
    }
    public static void print(String name, int id)
    {
        System.out.println(name);
        System.out.println(id);
    }
}

class Student4
{
    public static Object student2;
    private int id;
    private String name;

    public Student4(String Student_name, int Student_id)
    {
        this.name = Student_name;
        this.id = Student_id;
    }
}