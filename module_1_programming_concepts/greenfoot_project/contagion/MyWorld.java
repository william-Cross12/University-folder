import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * ZA WARUDO
 * 
 * Will
 * 1
 */
public class MyWorld extends World
{
    private static final int NUMBER_OF_PEOPLE = 150;
    private static final int XSIZE = 1200;
    private static final int YSIZE = 800;
    private int maxInfected = 0;
    /**
     * creates za warudo
     * 
     */
    public MyWorld()
    {    
        super(XSIZE, YSIZE, 1); 
        populate();
    }
    
    //do action for ecery act step
    public void act()
    {
        displayInfo();
    }
    
    //displays status
    private void displayInfo()
    {
        int numInfected = Person.getNumberInfected();
        if (numInfected > maxInfected)
        {
            maxInfected = numInfected;
        }
        
        showText("Infected: " + numInfected, 100, 20);
        showText("Max Infected: " + maxInfected, 300, 20);
    }
    
    private void populate()
    {
        //populates za warudo
        Person person = new Person();
        person.infect();
        addObject(person, XSIZE/2, YSIZE/2);
        for (int i=0; i<NUMBER_OF_PEOPLE; i++)
        {
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(new Person(), x, y);
        }
    }
}
