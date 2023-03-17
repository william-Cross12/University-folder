import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mario extends Actor
{
    /**
     * Act - do whatever the Mario wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            move(5);
        }
    }
    public void move(final int distance) {
        super.move(distance);
        if (isTouching(Block.class)) {
            super.move(-distance);
        }
    }
}
