//Akshay Shivkumar
//6.2.19
import java.awt.*;
public class RandomWalkTester 
{ 
    public static void main(String[] args) 
    {
        Picture pict = new Picture("background.png");   //creates a new Picture with an image 
                                                        //as the background  
                                                        
        RandomWalk walk = new RandomWalk(pict);         //creates a RandomWalk object with the name walk
        walk.setTitle(250,50,Color.BLACK);              //calls the setTitle method written in the driver class
        walk.RandomWalk();                              //calls the RandomWalk method
        pict.show();                                    //shows the final picture output
    }
}

