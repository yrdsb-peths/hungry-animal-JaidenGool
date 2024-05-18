import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The World the hero lives in
 * 
 * @author Jaiden Gool
 * @version April 2024
 */
public class MyWorld extends World
{
    public int score = 0;
    public static double diffScore = 1;
    Label scoreLabel;
    Label diffLabel;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 250);
        
        //Create a label
        scoreLabel = new Label(0, 50);
        addObject(scoreLabel, 25, 30);
        
        //Difficulty label
        diffLabel = new Label((int)diffScore, 50);
        addObject(diffLabel, 560, 30);
        
        createApple();
        
        diffScore = 1;
    }
    
    //Game over - called when game ends and draw game over
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    //Increase score
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    public void increaseDifficulty()
    {
        diffScore += 0.1;
        diffLabel.setValue((int)diffScore);
    }
    
    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 25;
        addObject(apple, x, 25);
    }
    
}
