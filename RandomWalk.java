//Akshay Shivkumar
//6.3.19
import java.awt.*;
public class RandomWalk
{
    private Picture tile; //creates a private Picture object named tile
    private Graphics g; //created a Graphics object so that the variable g can access Graphics class methods
    
    //constructor that passes the variables and instantiates the each of the objects to be used
    public RandomWalk(Picture p)
    {
       tile = p;
       g = tile.getGraphics();
    }
    
    //method to set the title of the graph that will be drawn in the random walk
    public void setTitle(int x1, int y1, Color color)
    {
        g.setFont(new Font("TimesRoman", Font.PLAIN, 20)); 
        g.setColor(color);
        g.drawString("Random One Dimensional Walk", x1, y1);
        
    }
    public void RandomWalk()
    {    
        g.setColor(Color.RED);
        double rand;
        //starting position of the line
        int one = 35; 
        int two = 445;
        int three = 46; 
        int four = 432;
        //difference between start and end points for each coordinate
        int xdiff = 11;
        int ydiff = 12;
        g.drawLine(one, two, three, four);
        
        for(int i = 0; i < 65; i++)
        {
           rand = Math.random();  //generates a random value between 0.0 and 0.99
           one += xdiff;          //increments the initial x location of the line to the right
           three += xdiff;        //increments the final x location of the line to the right
           if(rand < .5)
           {
              two = four;     //sets the final y equal to the initial y so the pen that is
                              //drawing is moved accordingly   
              four += ydiff;  //moves the final y point ydiff up
              g.drawLine(one,two,three, four);      //draws the newly formed line
           }
           else
           {
              two = four;    //sets the final y equal to the initial y so the pen that is
                             //drawing is moved accordingly  
              four -= ydiff;   //moves the final y point ydiff down
              g.drawLine(one,two,three,four);       //draws the newly formed line
            }
        }  
    }
}
