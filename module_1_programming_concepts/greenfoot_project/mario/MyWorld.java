import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(600, 400, 1); 
        buildPyramid();
    }
    public String getPyramidSize()
    {
        String input = Greenfoot.ask("Please input a number 1-8: ");
        return input;
    }
    public void buildPyramid()
    {
        boolean run = true;
        
        while(run == true){
            String value = getPyramidSize();
            
            int size = 0;
            try {
                size = Integer.parseInt(value);
            }
            catch (NumberFormatException e) {
                continue;
            }
            
            
            if(size<1)
            {
                continue;
            }
            else if(size>8)
            {
                continue;
            }
            else{
                run = false;
            }
                
            
            
            int yStart = 17; 
            int yEnd = yStart - size;
            int xStart = 4; 
            int xEnd = xStart + size;
            
            // each row
            for(int y = yStart; y > yEnd; y--)
            {
                //left half
                for (int x = xStart; x < xEnd; x++)
                {
                    Block Block = new Block();
                    addObject(Block, x, y);
                }
                
                //right half
                for (int x = xEnd+2; x < xEnd + 2 + (xEnd - xStart); x++)
                {
                    Block Block = new Block();
                    addObject(Block, x, y);
                }
                xStart++;

            }
        }
    }
}
