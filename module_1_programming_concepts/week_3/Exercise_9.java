public class Exercise_9 {
    public static void main(String[] args)
    {
        String Student_name = "Alex";
        int Student_id = 37429583;
        Student9 student = new Student9(Student_name, Student_id);
        String name = student.getName();
        int id = student.getID();
        Exercise_9.print_student(name, id);
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


class Student9
{
    private int id;
    private String name;
    private Course9 course;

    public Student9(String Student_name, int Student_id)
    {
        this.name = Student_name;
        this.id = Student_id;
    }

    public void enroll(Course9 student_course)
    {
        this.course = student_course;
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


class Course9
{
    private String code;
    private String name;

    public Course9(String Course_code, String Course_name)
    {
        this.code = Course_code;
        this.name = Course_name;
    }
}