public class Exercise_6 {
    public static void main(String[] args)
    {
        Student6 student = new Student6("Alex", 37429583);
        String name = student.getName();
        int id = student.getID();
        Exercise_6.print(name, id);
    }
    public static void print(String name, int id)
    {
        System.out.println(name);
        System.out.println(id);
    }
}


class Student6
{
    private int id;
    private String name;

    public Student6(String Student_name, int Student_id)
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


class Course6
{
    private String code;        //creates course class with id and name as variables in it
    private String name;
}

    