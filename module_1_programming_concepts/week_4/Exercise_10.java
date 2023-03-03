import java.util.Random;
public class Exercise_10 {
    public static void main(String[] args)
    {
        Module10 mod1 = new Module10("AUG399ga93", "computers");

        Module10 mod2 = new Module10("GKhsohko", "books");

        Module10 mod3 = new Module10("wk3j4tiTO", "art");

        Module10 mod4 = new Module10("93htuw9", "tech");

        Course10 course = new Course10("39429693", "computer science", mod1, mod2, mod3, mod4);


        Random randomNum = new Random();
        int mark1 = randomNum.nextInt(101);
        int mark2 = randomNum.nextInt(101);
        int mark3 = randomNum.nextInt(101);
        int mark4 = randomNum.nextInt(101);
        Student10 student = new Student10("Alex", 39429593);

        student.enroll(course);
        student.add_module_mark(mark1, mark2, mark3, mark4);

        Random randomNum2 = new Random();
        int mark5 = randomNum2.nextInt(101);
        int mark6 = randomNum2.nextInt(101);
        int mark7 = randomNum2.nextInt(101);
        int mark8 = randomNum2.nextInt(101);
        Student10 student2 = new Student10("May", 8724);        //creates second student to test new code features

        student2.enroll(course);
        student2.add_module_mark(mark5, mark6, mark7, mark8);


        Exercise_10.print_student_list(student, student2);

    }
    public static void print_student_list(Student10 student, Student10 student2)        //gets all students and then splits everything in them up to be printed seperately in another method
    {
        
        String name = student.getName();
        Exercise_10.get_student_info(student, name);

        String name2 = student2.getName();
        Exercise_10.get_student_info(student2, name2);
        
    }
    public static void get_student_info(Student10 student, String name)
    {
        System.out.println(name);

        Course10 course = student.getCourse();
        Module10[] modules = course.getModules();

        ModuleMark marks = student.getMark();
        int[] mark_list = marks.getMark();
        String[] grade_list = marks.getLetterGrade();

        int count = 0;
        while(count < 3){


            Module10 module_obj = modules[count];
            String module = module_obj.getName();

            int mark = mark_list[count];
            String grade = grade_list[count];

            System.out.print(module);
            System.out.print("    ");

            System.out.print(mark);
            System.out.print("    ");
            System.out.println(grade);
        
            System.out.println();
            count++;
        }
    }
}



class ModuleMark        //creates module mark class that brings together other peices of code that where else where (like the number to letter grade) all together for ease of use
{
    private int[] mark = new int[4];
    

    public ModuleMark(int mark1, int mark2, int mark3, int mark4)
    {
        this.mark[0] = mark1;
        this.mark[1] = mark2;
        this.mark[2] = mark3;
        this.mark[3] = mark4;
    }

    public int[] getMark()
    {
        return this.mark;
    }
    public String[] getLetterGrade()
    {

        String[] grade = new String[4];
        int count = 0;
        while(count < 3){
            int marks = this.mark[count];


            if(marks>=0 && marks<=39)
                grade[count]=("F");
            else if(marks<=49)
                grade[count]=("D");
            else if(marks<=59)
                grade[count]=("C");
            else if(marks<=69)
                grade[count]=("B");
            else if(marks<=100)
                grade[count]=("A");
            else
                grade[count]=("Invalid mark");
            count++;
        }

        return(grade);
    }
}

class Student10
{
    private int id;
    private String name;
    private Course10 course;
    private ModuleMark module_marks;
    

    public Student10(String Student_name, int Student_id)
    {
        this.name = Student_name;
        this.id = Student_id;
    }

    public void enroll(Course10 student_course)
    {
        this.course = student_course;
    }

    public void add_module_mark(int mark1, int mark2, int mark3, int mark4)
    {
        ModuleMark module_mark = new ModuleMark(mark1, mark2, mark3, mark4);
        this.module_marks = module_mark;
    }

    public ModuleMark getMark()
    {
        return this.module_marks;
    }

    public String getName()
    {
        return this.name;
    }
    public int getID()
    {
        return this.id;
    }
    public Course10 getCourse()
    {
        return this.course;
    }
}

class Course10
{
    private String code;
    private String name;
    private Module10[] module3s = new Module10[4];

    public Course10(String Course_code, String Course_name, Module10 mod1, Module10 mod2, Module10 mod3, Module10 mod4)
    {
        this.code = Course_code;
        this.name = Course_name;


        this.module3s[0] = (mod1);
        this.module3s[1] = (mod2);
        this.module3s[2] = (mod3);
        this.module3s[3] = (mod4);

    }
    public String getName()
    {
        return this.name;
    }
    public String getCode()
    {
        return this.code;
    }
    public Module10[] getModules()
    {
        return this.module3s;
    }
}

class Module10
{
    private String code;
    private String name;

    public Module10(String Module_code, String Module_name)
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