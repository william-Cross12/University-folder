public class Exercise_1 {

}

class Module1               //create module class
{
    private String code;
    private String name;            //class variables

    public Module1(String Module_code, String Module_name)      //constructor
    {
        this.code = Module_code;
        this.name = Module_name;
    }
    public String getName()     //returns name
    {
        return this.name;
    }
    public String getCode()         //returns code
    {
        return this.code;
    }
}