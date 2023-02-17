public class Exercise_5 {
    public static void main(String[] args)
    {
        String Student_name = "Alex";
        int Student_id = 37429583;
        Student5 student = new Student5(Student_name, Student_id);
        String name = student.getName();
        int id = student.getID();
        Exercise_5.print(name, id);
    }
    public static void print(String name, int id)
    {
        System.out.println(name);
        System.out.println(id);
    }
        
}

class Student5
{
    private int id;
    private String name;

    public Student5(String Student_name, int Student_id)
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

    
