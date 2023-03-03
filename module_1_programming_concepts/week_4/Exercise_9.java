import java.util.ArrayList;
import java.util.Random;
public class Exercise_9 {

    public static void main(String[] args)
    {
        Module9 mod1 = new Module9("AUG399ga93", "computers");

        Module9 mod2 = new Module9("GKhsohko", "books");

        Module9 mod3 = new Module9("wk3j4tiTO", "art");

        Module9 mod4 = new Module9("93htuw9", "tech");

        Course9 course = new Course9("39429693", "computer science", mod1, mod2, mod3, mod4);


        Random randomNum = new Random();
        int mark1 = randomNum.nextInt(101);
        int mark2 = randomNum.nextInt(101);
        int mark3 = randomNum.nextInt(101);
        int mark4 = randomNum.nextInt(101);
        Student9 student = new Student9("Alex", 39429593, mark1, mark2, mark3, mark4);


        int[] mark_list = student.getMark();

        ArrayList<Module9> modules = course.getModules();
        for(Module9 module:modules)
        {
            
            int position = modules.indexOf(module);
        
            Exercise_9.print_module(position, mark_list, module);
        }

    }
    public static void print_module(int position, int[] mark_list, Module9 module)
    {
        String name = module.getName();
        String code = module.getCode();
        int mark = mark_list[position];
        Module9.grade letter = module.getLetterGrade(mark);

        System.out.println(name);
        System.out.println(code);
        System.out.print(mark);
        System.out.print("    ");
        System.out.println(letter);
        System.out.println();
    }
}


class Module9
{
    private String code;
    private String name;

    public Module9(String Module_code, String Module_name)
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

    enum grade {    //enumerate type method
        A,
        B,
        C,
        D,
        F
    }

    public grade getLetterGrade(int mark)     //rewritten method to use enumerate type
    {
        if(mark>=0 && mark<=39)
            return (grade.F);
        else if(mark<=49)
            return (grade.D);
        else if(mark<=59)
            return (grade.C);
        else if(mark<=69)
            return (grade.B);
        else if(mark<=100)
            return (grade.A);
        return null;
    }
}


class Course9
{
    private String code;
    private String name;
    private ArrayList<Module9> module3s = new ArrayList<Module9>();

    public Course9(String Course_code, String Course_name, Module9 mod1, Module9 mod2, Module9 mod3, Module9 mod4)
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
    public ArrayList<Module9> getModules()
    {
        return this.module3s;
    }
}

class Student9
{
    private int id;
    private String name;
    private Course9 course;
    private int[] mark = new int[4];
    

    public Student9(String Student_name, int Student_id, int mark1, int mark2, int mark3, int mark4)
    {
        this.name = Student_name;
        this.id = Student_id;
        this.mark[0] = mark1;
        this.mark[1] = mark2;
        this.mark[2] = mark3;
        this.mark[3] = mark4;
    }

    public void enroll(Course9 student_course)
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
    public Course9 getCourse()
    {
        return this.course;
    }
}