public class Exercise_11 {
    public static void main(String[] args)
    {
        Student11 student = new Student11("Alex", 37429583);

        Course11 course = new Course11("AUG389ga93", "computers");           //creates a course to add into the student class

        student.enroll(course);

        String name = student.getName();
        int id = student.getID();
        Exercise_11.print_student(name, id, course);
    }
    public static void print_student(String name, int id, Course11 course)      //now that a course exists print course code is added
    {
        System.out.println(name);
        System.out.println(id);
        System.out.println(course);
    }
    public static void print_course(String name, String code)
    {
        System.out.println(name);
        System.out.println(code);
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