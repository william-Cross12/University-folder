import java.util.ArrayList;
import java.util.Random;
public class Exercise_8 {
    public static void main(String[] args)
    {
        Module8 mod1 = new Module8("AUG389ga93", "computers");

        Module8 mod2 = new Module8("GKhsohko", "books");

        Module8 mod3 = new Module8("wk3j4tiTO", "art");

        Module8 mod4 = new Module8("83htuw8", "tech");

        Course8 course = new Course8("38429683", "computer science", mod1, mod2, mod3, mod4);


        Random randomNum = new Random();
        int mark1 = randomNum.nextInt(101);
        int mark2 = randomNum.nextInt(101);
        int mark3 = randomNum.nextInt(101);
        int mark4 = randomNum.nextInt(101);
        Student8 student = new Student8("Alex", 38429583, mark1, mark2, mark3, mark4);


        int[] mark_list = student.getMark();

        ArrayList<Module8> modules = course.getModules();
        for(Module8 module:modules)
        {
            
            int position = modules.indexOf(module);
        
            Exercise_8.print_module(position, mark_list, module);
        }

    }
    public static void print_module(int position, int[] mark_list, Module8 module)
    {
        String name = module.getName();
        String code = module.getCode();
        int mark = mark_list[position];
        String letter = module.getLetterGrade(mark);

        System.out.println(name);
        System.out.println(code);
        System.out.print(mark);
        System.out.print("    ");
        System.out.println(letter);
        System.out.println();
    }
}


class Module8
{
    private String code;
    private String name;

    public Module8(String Module_code, String Module_name)
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
    public String getLetterGrade(int mark)      //method that converts inputted number grade into a letter
    {
        if(mark>=0 && mark<=39)
            return ("F");
        else if(mark<=49)
            return ("D");
        else if(mark<=59)
            return ("C");
        else if(mark<=69)
            return ("B");
        else if(mark<=100)
            return ("A");
        else
            return ("Invalid mark");
    }
}


class Course8
{
    private String code;
    private String name;
    private ArrayList<Module8> module3s = new ArrayList<Module8>();

    public Course8(String Course_code, String Course_name, Module8 mod1, Module8 mod2, Module8 mod3, Module8 mod4)
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
    public ArrayList<Module8> getModules()
    {
        return this.module3s;
    }
}

class Student8
{
    private int id;
    private String name;
    private Course8 course;
    private int[] mark = new int[4];
    

    public Student8(String Student_name, int Student_id, int mark1, int mark2, int mark3, int mark4)
    {
        this.name = Student_name;
        this.id = Student_id;
        this.mark[0] = mark1;
        this.mark[1] = mark2;
        this.mark[2] = mark3;
        this.mark[3] = mark4;
    }

    public void enroll(Course8 student_course)
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
    public Course8 getCourse()
    {
        return this.course;
    }
}