import java.util.ArrayList;
public class Exercise_4 {
    public static void main(String[] args)
    {
        Module4 mod1 = new Module4("AUG389ga93", "computers");

        Module4 mod2 = new Module4("GKhsohko", "books");  

        Module4 mod3 = new Module4("wk3j4tiTO", "art");

        Module4 mod4 = new Module4("83htuw8", "tech");

        Course4 course = new Course4("37429683", "computer science", mod1, mod2, mod3, mod4);


        ArrayList<Module4> modules = course.getModules();
        for(Module4 module:modules)
        {
            String names = module.getName();
            String code = module.getCode();
        
            Exercise_4.print_module(names, code);
        }

    }
    public static void print_module(String name, String code)
    {
        System.out.println(name);
        System.out.println(code);
    }
}


class Module4
{
    private String code;
    private String name;

    public Module4(String Module_code, String Module_name)
    {
        this.code = Module_code;
        this.name = Module_name;
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


class Course4
{
    private String code;
    private String name;
    private ArrayList<Module4> module3s = new ArrayList<Module4>();

    public Course4(String Course_code, String Course_name, Module4 mod1, Module4 mod2, Module4 mod3, Module4 mod4)
    {
        this.code = Course_code;
        this.name = Course_name;


        this.module3s.add(mod1);
        this.module3s.add(mod2);
        this.module3s.add(mod3);
        this.module3s.add(mod4);

    }
    public String getName()
    {
        return this.name;
    }
    public String getCode()
    {
        return this.code;
    }
    public ArrayList<Module4> getModules()
    {
        return this.module3s;
    }
}

class Student4
{
    private int id;
    private String name;
    private Course4 course;
    private int[] mark = new int[4];        //ads a list of length 4 to student
    

    public Student4(String Student_name, int Student_id)
    {
        this.name = Student_name;
        this.id = Student_id;
    }

    public void enroll(Course4 student_course)
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
    public Course4 getCourse()
    {
        return this.course;
    }
}