public class Exercise_12 {
    public static void main(String[] args)
    {
        String Student_name = "Alex";
        int Student_id = 37429583;
        Student12 student = new Student12(Student_name, Student_id);

        String Course_code = "AUG389ga93";
        String Course_name = "computers";
        Course12 course = new Course12(Course_code, Course_name);

        student.enroll(course);

        String name = student.getName();
        int id = student.getID();
        Exercise_12.print_student(name, id, course);
    }
    public static void print_student(String name, int id, Course12 course)
    {
        System.out.println(name);
        System.out.println(id);

        String names = course.getName();
        String code = course.getCode();
        
        Exercise_12.print_course(names, code);
    }
    public static void print_course(String name, String code)
    {
        System.out.println(name);
        System.out.println(code);
    }
}


class Student12
{
    private int id;
    private String name;
    private Course12 course;

    public Student12(String Student_name, int Student_id)
    {
        this.name = Student_name;
        this.id = Student_id;
    }

    public void enroll(Course12 student_course)
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
    public Course12 getCourse()
    {
        return this.course;
    }
}


class Course12
{
    private String code;
    private String name;

    public Course12(String Course_code, String Course_name)
    {
        this.code = Course_code;
        this.name = Course_name;
    }
    public String getName()
    {
        return this.name;
    }
    public String getCode()
    {
        return this.code;
    }
}