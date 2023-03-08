import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person extends Actor
{
    private static final int INFECTION_TIME = 200;
    private int infection = 0;
    private boolean isImmune = false;
    
    private static int numInfected = 0;
    
    //return no infected
    public static int getNumberInfected()
    {
        return numInfected;
    }
    //random movement
    public Person()
    {
        turn(Greenfoot.getRandomNumber(360));
    }
    /**
     * Act - do whatever the Person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        if (isInfected())
        {
            infectOthers();
            heal();
        }
        
    }
    private void move()
    {
        //moves person
        move(3);
        if (isAtEdge())
        {
            turn(87);
        }
        if (Greenfoot.getRandomNumber(100) < 20)
        {
            turn(Greenfoot.getRandomNumber(60) - 30);
        }
        
    }
    //checks if touching other person then infects them
    private void infectOthers()
    {
        Person other = (Person) getOneIntersectingObject(Person.class);
        
        if (other != null)
        {
            other.infect();
        }
    }
    public void infect()
    {
        if (!isImmune)
        {
            infection = INFECTION_TIME;
            numInfected++;
            setImage("ppl2.png");
            isImmune = true;
        }
    }
    public boolean isInfected()
    {
        return infection > 0;
    }
    
    //if infected then imunity increases
    private void heal()
    {
        if (isInfected())
        {
            infection--;
            if (infection == 0)
            {
                setImage("ppl3.png");
                numInfected--;
            }
        }
    }
}
