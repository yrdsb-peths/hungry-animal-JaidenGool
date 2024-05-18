import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Title Screen
 * 
 * @author Jaiden Gool
 * @version May 2024
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 55);
    Label instructionLabel = new Label("Press space to start", 33);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(titleLabel, getWidth()/2, 180);
        addObject(instructionLabel, getWidth()/2, getHeight()/2 + 30);
        
        Elephant titleElephant = new Elephant();
        addObject(titleElephant, getWidth()/2, 100);
    }
    
    /**
     * Main world act loop
     */
    public void act()
    {
        //Start the game is the spacebar is pressed
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}
