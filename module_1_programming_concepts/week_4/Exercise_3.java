import java.util.ArrayList;
public class Exercise_3 {
    public static void main(String[] args)
    {
        Module3 mod1 = new Module3("AUG389ga93", "computers");

        Module3 mod2 = new Module3("GKhsohko", "books");         

        Module3 mod3 = new Module3("wk3j4tiTO", "art");

        Module3 mod4 = new Module3("83htuw8", "tech");

        Course3 course = new Course3("computer science", "37429583", mod1, mod2, mod3, mod4);

        //creates modules and a course

        ArrayList<Module3> modules = course.getModules();           //assigns the arraylist to a variable
        for(Module3 module:modules)                         //loops through all variables in the arraylist and then prints them
        {
            String names = module.getName();
            String code = module.getCode();
        
            Exercise_3.print_module(names, code);
        }

    }
    public static void print_module(String name, String code)
    {
        System.out.println(name);
        System.out.println(code);
    }
}


class Module3
{
    private String code;
    private String name;

    public Module3(String Module_code, String Module_name)
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


class Course3
{
    private String code;
    private String name;
    private ArrayList<Module3> module3s = new ArrayList<Module3>();

    public Course3(String Course_code, String Course_name, Module3 mod1, Module3 mod2, Module3 mod3, Module3 mod4)
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
    public ArrayList<Module3> getModules()
    {
        return this.module3s;
    }
}