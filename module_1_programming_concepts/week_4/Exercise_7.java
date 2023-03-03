import java.util.ArrayList;
import java.util.Random;
public class Exercise_7 {
    public static void main(String[] args)
    {
        Module7 mod1 = new Module7("AUG389ga93", "computers");

        Module7 mod2 = new Module7("GKhsohko", "books");

        Module7 mod3 = new Module7("wk3j4tiTO", "art");

        Module7 mod4 = new Module7("83htuw8", "tech");

        Course7 course = new Course7("37429683", "computer science", mod1, mod2, mod3, mod4);


        Random randomNum = new Random();
        int mark1 = randomNum.nextInt(101);
        int mark2 = randomNum.nextInt(101);     //random number generator that goes 0 to 100 (fufilling requirements of being between these 2 numbers)
        int mark3 = randomNum.nextInt(101);
        int mark4 = randomNum.nextInt(101);
        Student7 student = new Student7("Alex", 37429583, mark1, mark2, mark3, mark4);      //creates student using the class


        int[] mark_list = student.getMark();

        ArrayList<Module7> modules = course.getModules();
        for(Module7 module:modules)
        {
            String names = module.getName();
            String code = module.getCode();
            int position = modules.indexOf(module);
        
            Exercise_7.print_module(names, code, position, mark_list);
        }

    }
    public static void print_module(String name, String code, int position, int[] mark_list)
    {
        System.out.println(name);
        System.out.println(code);
        System.out.println(mark_list[position]);    //adds print statements for the student in this method
        System.out.println();
    }
}


class Module7
{
    private String code;
    private String name;

    public Module7(String Module_code, String Module_name)
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


class Course7
{
    private String code;
    private String name;
    private ArrayList<Module7> module3s = new ArrayList<Module7>();

    public Course7(String Course_code, String Course_name, Module7 mod1, Module7 mod2, Module7 mod3, Module7 mod4)
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
    public ArrayList<Module7> getModules()
    {
        return this.module3s;
    }
}

class Student7
{
    private int id;
    private String name;
    private Course7 course;
    private int[] mark = new int[4];
    

    public Student7(String Student_name, int Student_id, int mark1, int mark2, int mark3, int mark4)
    {
        this.name = Student_name;
        this.id = Student_id;
        this.mark[0] = mark1;
        this.mark[1] = mark2;
        this.mark[2] = mark3;
        this.mark[3] = mark4;
    }

    public void enroll(Course7 student_course)
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
    public Course7 getCourse()
    {
        return this.course;
    }
}