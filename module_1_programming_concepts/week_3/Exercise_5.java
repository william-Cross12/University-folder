public class Exercise_5 {
    public static void main(String[] args)
    {
        Student5 student = new Student5("Alex", 37429583);
        String name = student.getName();
        int id = student.getID();
        Exercise_5.print(name, id);             //gets variables from student class and then sends them to the print method
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

    
