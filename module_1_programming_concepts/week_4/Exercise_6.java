import java.util.ArrayList;
public class Exercise_6 {
    public static void main(String[] args)
    {
        String Module_code1 = "AUG389ga93";
        String Module_name1 = "computers";
        Module6 mod1 = new Module6(Module_code1, Module_name1);

        String Module_code2 = "GKhsohko";
        String Module_name2 = "books";
        Module6 mod2 = new Module6(Module_code2, Module_name2);

        String Module_code3 = "wk3j4tiTO";
        String Module_name3 = "art";
        Module6 mod3 = new Module6(Module_code3, Module_name3);

        String Module_code4 = "83htuw8";
        String Module_name4 = "tech";
        Module6 mod4 = new Module6(Module_code4, Module_name4);

        String Course_name = "computer science";
        String Course_code = "37429683";
        Course6 course = new Course6(Course_code, Course_name, mod1, mod2, mod3, mod4);


        int[] mark_list = student.getMark();

        ArrayList<Module6> modules = course.getModules();
        for(Module6 module:modules)
        {
            String names = module.getName();
            String code = module.getCode();
            int position = modules.indexOf(module);
        
            Exercise_6.print_module(names, code, position, mark_list);
        }

    }
    public static void print_module(String name, String code, int position, int[] mark_list)
    {
        System.out.println(name);
        System.out.println(code);
    }
}


class Module6
{
    private String code;
    private String name;

    public Module6(String Module_code, String Module_name)
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


class Course6
{
    private String code;
    private String name;
    private ArrayList<Module6> module3s = new ArrayList<Module6>();

    public Course6(String Course_code, String Course_name, Module6 mod1, Module6 mod2, Module6 mod3, Module6 mod4)
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
    public ArrayList<Module6> getModules()
    {
        return this.module3s;
    }
}

class Student6
{
    private int id;
    private String name;
    private Course6 course;
    private int[] mark = new int[4];
    

    public Student6(String Student_name, int Student_id, int mark1, int mark2, int mark3, int mark4)
    {
        this.name = Student_name;
        this.id = Student_id;
        this.mark[0] = mark1;
        this.mark[1] = mark2;
        this.mark[2] = mark3;
        this.mark[3] = mark4;
    }

    public void enroll(Course6 student_course)
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
    public int[] getMark()
    {
        return this.mark;
    }
    public Course6 getCourse()
    {
        return this.course;
    }
}