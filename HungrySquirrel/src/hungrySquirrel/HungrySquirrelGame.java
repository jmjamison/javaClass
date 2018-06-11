/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungrySquirrel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author jmjamison
 */
public class HungrySquirrelGame 
{
    
    public static void main(String[] args) throws IOException, FileNotFoundException
    {
        //String workingDirectory = System.getProperty("user.dir") + "/";   
        //String filename = "Maze.txt";
        //String filename = "Maze.txt";
        //System.out.println(filename);  //ubiquitious debugging code
        // 1) create maze
        // 2) create Squirrel
        // 3) instantiate Nut objects, determine and create type of nut: almond, peanut or poisonous cashew
        // 4) display maze and entities
        // 5) accept user input to move squirrel
        //  5a) if position isn't available prompte user to try again
        // 6) for every move full maze and entities should be displayed
        // 7) when the squirrel eats an nut, print points collected and total points
        // 8) when squirrel collects all the nuts game-over message is displayed
        Maze myMaze = new Maze();
        try 
        {
            // call Maze class create method
            myMaze.create("Maze.txt");
            myMaze.display();
            
            
        }
        catch(IOException e)
        {
             System.out.println(e.getMessage()); 
        }
        
         Squirrel mySquirrel = new Squirrel();
         mySquirrel.create();
         
        System.out.println("Enter the Squirrel position (row - between, column): ");
        Scanner keyboard = new Scanner(System.in);
         
         while(keyboard.hasNextLine())
        {
        
            String input = keyboard.nextLine();
            
            if (input.equalsIgnoreCase("quit"))   // if quit, break out of loop
            {
                break;
            }
            
            // if user enters name, grade then split the line
            String[] tokens = input.split(",");
            
            // check the input to be sure it is only 2 numbers            
            boolean b = Pattern.matches("[\\d]{1,2},\\s*[\\d]{1,2}", input);
            if (!b)
            {
                System.out.println("Invalid format, enter the Squirrel position (row, column): ");
                continue;
            }
            
            // input assigned to row, column
            Integer row = Integer.valueOf(tokens[0].trim());
            Integer col = Integer.valueOf(tokens[1].trim());
            
                        
            if (myMaze.available(row,col))
            {
                System.out.println("Space " + row + ", " + col);
                mySquirrel.put(row, col);
            }
            else
            {
                System.out.println("Space " + row + ", " + col + " is not available, try again.");
                continue;
            }
             myMaze.display();
            
        }
        
        keyboard.close();
    }
    
}
