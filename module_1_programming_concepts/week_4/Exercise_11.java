import java.util.Random;
import java.util.Arrays;
public class Exercise_11 {
    public static void main(String[] args)
    {
        Module11 mod1 = new Module11("AUG399ga93", "computers");

        Module11 mod2 = new Module11("GKhsohko", "books");

        Module11 mod3 = new Module11("wk3j4tiTO", "art");

        Module11 mod4 = new Module11("93htuw9", "tech");

        Course11 course = new Course11("39429693", "computer science", mod1, mod2, mod3, mod4);


        Random randomNum = new Random();
        int mark1 = randomNum.nextInt(101);
        int mark2 = randomNum.nextInt(101);
        int mark3 = randomNum.nextInt(101);
        int mark4 = randomNum.nextInt(101);
        Student11 student = new Student11("Alex", 39429593);

        student.enroll(course);
        student.add_module_mark(mark1, mark2, mark3, mark4);

        Random randomNum2 = new Random();
        int mark5 = randomNum2.nextInt(101);
        int mark6 = randomNum2.nextInt(101);
        int mark7 = randomNum2.nextInt(101);
        int mark8 = randomNum2.nextInt(101);
        Student11 student2 = new Student11("May", 8724);

        student2.enroll(course);
        student2.add_module_mark(mark5, mark6, mark7, mark8);


        Exercise_11.print_student_list(student, student2);

    }
    public static void print_student_list(Student11 student, Student11 student2)
    {
        
        String name = student.getName();
        Exercise_11.get_student_info(student, name);

        String name2 = student2.getName();
        Exercise_11.get_student_info(student2, name2);
        
    }
    public static void get_student_info(Student11 student, String name)
    {
        System.out.println(name);
        System.out.println();
        ModuleMark2 marks = student.getMark();

        int min = marks.getMin();
        int max = marks.getMax();
        double mean = marks.getMean();

        System.out.print(min);
        System.out.println("     min");
        System.out.print(max);
        System.out.println("     max");
        System.out.print(mean);
        System.out.println("     mean");
        System.out.println();
        System.out.println();
       
    }
}



class ModuleMark2
{
    private int[] mark = new int[4];
    

    public ModuleMark2(int mark1, int mark2, int mark3, int mark4)
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
    public int getMin()     //method to calculate minimum module grade
    {
        int min = Arrays.stream(this.mark).min().getAsInt();
        return(min);
    }
    public int getMax()     //method to calculate maximum module grade
    {
        int max = Arrays.stream(this.mark).max().getAsInt();
        return(max);
    }
    public double getMean()     //method to calculate average module grade
    {
 
        int sum = 0;
 
        for (int i = 0; i < 4; i++) {
            sum += this.mark[i];
        }
 
        double mean = sum / 4;
        return(mean);
    }
}

class Student11
{
    private int id;
    private String name;
    private Course11 course;
    private ModuleMark2 module_marks;
    

    public Student11(String Student_name, int Student_id)
    {
        this.name = Student_name;
        this.id = Student_id;
    }

    public void enroll(Course11 student_course)
    {
        this.course = student_course;
    }

    public void add_module_mark(int mark1, int mark2, int mark3, int mark4)
    {
        ModuleMark2 module_mark = new ModuleMark2(mark1, mark2, mark3, mark4);
        this.module_marks = module_mark;
    }

    public ModuleMark2 getMark()
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
    public Course11 getCourse()
    {
        return this.course;
    }
}

class Course11
{
    private String code;
    private String name;
    private Module11[] module3s = new Module11[4];

    public Course11(String Course_code, String Course_name, Module11 mod1, Module11 mod2, Module11 mod3, Module11 mod4)
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
    public Module11[] getModules()
    {
        return this.module3s;
    }
}

class Module11
{
    private String code;
    private String name;

    public Module11(String Module_code, String Module_name)
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