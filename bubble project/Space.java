import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A bit of empty space for bubbles to float in.
 * 
 * @author Michael Kölling
 * @version 1.0
 */
public class Space extends World
{
    /**
     * Create Space. Make it black.
     */
    public Space()
    {
        super(900, 600, 1);
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        setup();
    }
    
    private void setup()
    {
        //setup1();
        //setup2();
        //setup3();
        //setup4();
        setup5();
    }
    
    private void setup1()
    //21 randomly placed bubbles
    {
        int i = 0;
        while(i < 21)
        {
            Bubble bubble = new Bubble();
            addObject(bubble,Greenfoot.getRandomNumber(900),Greenfoot.getRandomNumber(600));
            i++;
        } 
    }
    
    private void setup2()
    //21 diagonally placed bubbles starting from top left corner
    {
        int i = 0;
        int x = 0;
        while(i < 21)
        {
            Bubble bubble = new Bubble();
            addObject(bubble,x,x);
            x = x + 30;
            i++;
        } 
    }
    
    private void setup3()
    //21 diagonally placed bubbles from top left to bottom right
    {
        int i = 0;
        int x = 0;
        int y = 0;
        while(i < 21)
        {
            Bubble bubble = new Bubble();
            addObject(bubble,x,y);
            x = x + 45;
            y = y + 30;
            i++;
        } 
    }
    
    private void setup4()
    //10 bubbles placed in increasing size
    {
        int i = 0;
        int x = 300;
        int bubbleSize = 10;
        while(i < 10)
        {
            Bubble bubble = new Bubble(bubbleSize);
            addObject(bubble,x,100);
            x = x + 40;
            i++;
            bubbleSize = bubbleSize + 10;
        }
    }
    
    private void setup5()
    //18 bubbles placed on top of each other in decreasing size
    {
        int i = 0;
        int bubbleSize = 190;
        int bubbleDirection = 0;
        while(i<18)
        {
            Bubble bubble = new Bubble(bubbleSize, bubbleDirection);
            addObject(bubble, 450, 300);
            bubbleSize = bubbleSize - 10;
            bubbleDirection = bubbleDirection +20;
            i++;
        }
    }
}
