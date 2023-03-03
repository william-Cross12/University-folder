import java.util.ArrayList;
public class Exercise_2 {
    
}


class Module2
{
    private String code;
    private String name;

    public Module2(String Module_code, String Module_name)
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


class Course2
{
    private String code;
    private String name;
    private ArrayList<Module2> module2s = new ArrayList<Module2>();     //creates array list

    public Course2(String Course_code, String Course_name, Module2 mod1, Module2 mod2, Module2 mod3, Module2 mod4)
    {
        this.code = Course_code;
        this.name = Course_name;


        this.module2s.add(mod1);
        this.module2s.add(mod2);
        this.module2s.add(mod3);        //adds values to array list
        this.module2s.add(mod4);

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