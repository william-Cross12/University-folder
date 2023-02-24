import java.util.ArrayList;
public class Exercise_5 {
    public static void main(String[] args)
    {
        String Module_code1 = "AUG389ga93";
        String Module_name1 = "computers";
        Module5 mod1 = new Module5(Module_code1, Module_name1);

        String Module_code2 = "GKhsohko";
        String Module_name2 = "books";
        Module5 mod2 = new Module5(Module_code2, Module_name2);

        String Module_code3 = "wk3j4tiTO";
        String Module_name3 = "art";
        Module5 mod3 = new Module5(Module_code3, Module_name3);

        String Module_code4 = "83htuw8";
        String Module_name4 = "tech";
        Module5 mod4 = new Module5(Module_code4, Module_name4);

        String Course_name = "computer science";
        String Course_code = "37429583";
        Course5 course = new Course5(Course_code, Course_name, mod1, mod2, mod3, mod4);


        ArrayList<Module5> modules = course.getModules();
        for(Module5 module:modules)
        {
            String names = module.getName();
            String code = module.getCode();
        
            Exercise_5.print_module(names, code);
        }

    }
    public static void print_module(String name, String code)
    {
        System.out.println(name);
        System.out.println(code);
    }
}


class Module5
{
    private String code;
    private String name;

    public Module5(String Module_code, String Module_name)
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


class Course5
{
    private String code;
    private String name;
    private ArrayList<Module5> module3s = new ArrayList<Module5>();

    public Course5(String Course_code, String Course_name, Module5 mod1, Module5 mod2, Module5 mod3, Module5 mod4)
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
    public ArrayList<Module5> getModules()
    {
        return this.module3s;
    }
}

class Student5
{
    private int id;
    private String name;
    private Course4 course;
    private int[] mark = new int[4];
    

    public Student5(String Student_name, int Student_id, int mark1, int mark2, int mark3, int mark4)
    {
        this.name = Student_name;
        this.id = Student_id;
        this.mark[0] = mark1;
        this.mark[1] = mark2;
        this.mark[2] = mark3;
        this.mark[3] = mark4;
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