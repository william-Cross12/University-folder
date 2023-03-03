public class Exercise_10 {
    public static void main(String[] args)
    {
        Student10 student = new Student10("Alex", 37429583);
        String name = student.getName();
        int id = student.getID();
        Exercise_10.print_student(name, id);//, course);
    }
    public static void print_student(String name, int id)//, Course10 course)
    {
        System.out.println(name);
        System.out.println(id);
        //System.out.println(course);         //gets ready to add a print course option in the print student method
    }
    public static void print_course(String name, String code)
    {
        System.out.println(name);
        System.out.println(code);
    }
}


class Student10
{
    private int id;
    private String name;
    private Course10 course;

    public Student10(String Student_name, int Student_id)
    {
        this.name = Student_name;
        this.id = Student_id;
    }

    public void enroll(Course10 student_course)
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
    public Course10 getCourse()
    {
        return this.course;
    }
}


class Course10
{
    private String code;
    private String name;

    public Course10(String Course_code, String Course_name)
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