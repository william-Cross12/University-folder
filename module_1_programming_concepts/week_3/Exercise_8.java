public class Exercise_8 {
    public static void main(String[] args)
    {
        String Student_name = "Alex";
        int Student_id = 37429583;
        Student8 student = new Student8(Student_name, Student_id);
        String name = student.getName();
        int id = student.getID();
        Exercise_8.print_student(name, id);
    }
    public static void print_student(String name, int id)
    {
        System.out.println(name);
        System.out.println(id);
    }
    public static void print_course(String name, String code)
    {
        System.out.println(name);
        System.out.println(code);
    }
}


class Student8
{
    private int id;
    private String name;
    private Course8 course;             //adds a variable of type course to this class

    public Student8(String Student_name, int Student_id)
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


class Course8
{
    private String code;
    private String name;

    public Course8(String Course_code, String Course_name)
    {
        this.code = Course_code;
        this.name = Course_name;
    }
}