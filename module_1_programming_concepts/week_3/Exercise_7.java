public class Exercise_7 {
    public static void main(String[] args)
    {
        Student7 student = new Student7("Alex", 37429583);
        String name = student.getName();
        int id = student.getID();
        Exercise_7.print_student(name, id);
    }
    public static void print_student(String name, int id)
    {
        System.out.println(name);
        System.out.println(id);
    }
    public static void print_course(String name, String code)       //creates a method to print values from course class
    {
        System.out.println(name);
        System.out.println(code);
    }
}


class Student7
{
    private int id;
    private String name;

    public Student7(String Student_name, int Student_id)
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


class Course7
{
    private String code;
    private String name;

    public Course7(String Course_code, String Course_name)        //constructor usses vallues passed into it to give the variables in this class information
    {
        this.code = Course_code;
        this.name = Course_name;
    }
}