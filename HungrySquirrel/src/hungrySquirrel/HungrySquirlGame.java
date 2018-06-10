/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungrySquirrel;

import java.io.IOException;

/**
 *
 * @author jmjamison
 */
public class HungrySquirlGame  
{
    
    public static void main(String[] args) throws IOException
    {
        //String workingDirectory = System.getProperty("user.dir") + "/";   
        //String filename = workingDirectory + "Maze.txt";
        String filename = "Maze.txt";
        //System.out.println(filename);  //ubiquitious debugging code
        // 1) create maze
        // 2) create Squirl
        // 3) instantiate Nut objects, determine and create type of nut: almond, peanut or poisonous cashew
        // 4) display maze and entities
        // 5) accept user input to move squirrel
        //  5a) if position isn't available prompte user to try again
        // 6) for every move full maze and entities should be displayed
        // 7) when the squirrel eats an nut, print points collected and total points
        // 8) when squirrel collects all the nuts game-over message is displayed
        Maze newMaze = new Maze();
        try 
        {
            newMaze.create("Maze.txt");
            newMaze.display();
            
        }
         catch(Exception e){}
       
    }
    
}
