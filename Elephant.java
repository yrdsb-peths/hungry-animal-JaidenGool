import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant, hero of the game
 * 
 * @author Jaiden
 * @version April 2024
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage idle = new GreenfootImage("images/elephant_idle/idle0.png");
    
    /**
     * Constructor - code that gets run the first time the instance is created
     */
    
    public Elephant()
    {
        setImage(idle);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a"))
        {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d"))
        {
            move(1);
        }
        
        // Remove apples if touching Elephant eats it
        eat();
    }
    
    //Eats the apple and spawns a new apple
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            elephantSound.play();
        }
       
    }
}
