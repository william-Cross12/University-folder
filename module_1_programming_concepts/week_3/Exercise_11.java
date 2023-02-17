public class Exercise_11 {
    public static void main(String[] args)
    {
        String Student_name = "Alex";
        int Student_id = 37429583;
        Student11 student = new Student11(Student_name, Student_id);

        String Course_code = "AUG389ga93";
        String Course_name = "computers";
        Course11 course = new Course11(Course_code, Course_name);

        student.enroll(course);

        String name = student.getName();
        int id = student.getID();
        Exercise_11.print_student(name, id);
    }
    public static void print_student(String name, int id)
    {
        System.out.println(name);
        System.out.println(id);
    }
    public static void print_course(String name, String code, Course11 course)
    {
        System.out.println(name);
        System.out.println(code);
        System.out.println(course);
    }
}


class Student11
{
    private int id;
    private String name;
    private Course11 course;

    public Student11(String Student_name, int Student_id)
    {
        this.name = Student_name;
        this.id = Student_id;
    }

    public void enroll(Course11 student_course)
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
    public Course11 getCourse()
    {
        return this.course;
    }
}


class Course11
{
    private String code;
    private String name;

    public Course11(String Course_code, String Course_name)
    {
        this.code = Course_code;
        this.name = Course_name;
    }
    public String getAttr()
    {
        return this.name;
    }
    public String getCode()
    {
        return this.code;
    }
}