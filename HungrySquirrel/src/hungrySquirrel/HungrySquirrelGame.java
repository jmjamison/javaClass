/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungrySquirrel;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author jmjamison
 */
public class HungrySquirrelGame 
{
    //private static Random random = new Random();  // generate random true/false
    public static Random r = new Random();       // generate random integers - for inserting nuts and squirrel
    public static char direction;  // direction squirrel moves: u,d,l,r
    
    public static void main(String[] args) throws IOException, FileNotFoundException, InputMismatchException
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
        
        // instantiate the squirrel and create
        Squirrel mySquirrel = new Squirrel();
        mySquirrel.create();
         
         // instantiate the nut objects
         // insert the nuts into the maze in available, ie empty spaces
         // no more than 5 nuts total, set in the nut.class
         // peanuts, almonds, plus 5 poisionous cashews
         // 50/50 chance for a peanut or almond
         //System.out.println("Total nuts allowed: " + gameNuts.totalNuts);
         int nutCount = 0;
         int totalNuts = Nut.totalNuts;  // from nut class
         while (nutCount < totalNuts)
            {
                int nutRow = getRandomNumbers(1, 20);
                int nutCol = getRandomNumbers(1, 50);
                
                if(myMaze.available(nutRow, nutCol))
                {
                    if (getRandomBoolean()) 
                    {
                        myMaze.maze[nutRow][nutCol] = new Almond();
                        nutCount = nutCount + 1;
                        // System.out.println("Nut count: " + nutCount);
                    }
                    else
                    {
                        myMaze.maze[nutRow][nutCol] = new Peanut();
                        nutCount = nutCount + 1;
                        // System.out.println("Nut count: " + nutCount);
                    }
                }
                
            }
         // insert poisonous cashews
         nutCount = 0;
         while (nutCount < totalNuts)
            {
                int nutRow = getRandomNumbers(1, 20);
                int nutCol = getRandomNumbers(1, 50);
                
                if(myMaze.available(nutRow, nutCol))
                {
                    myMaze.maze[nutRow][nutCol] = new PoisonousCashew();
                    nutCount = nutCount + 1;
                    // System.out.println("Nut count: " + nutCount);
                }
            }
         
        // prompt the user for squirrel's initial position
        System.out.println("Enter the Squirrel position (row, column): ");
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
                break;
            }
            else
            {
                System.out.println("Space " + row + ", " + col + " is not available, try again.");
                continue;
            }
            
            
        }
        myMaze.display(); 
        
        //  squirrel moves
        System.out.println("Enter u, d, l, r to move Up, Down, Left, and Right: ");
        
        keyboard = new Scanner(System.in);
        
        while(keyboard.hasNextLine())
        {
            direction =  keyboard.next(".").charAt(0);
            
            if (Character.toString(direction).matches("[qQ]"))   // if quit, break out of loop
            {
                break;
            }
            // if u, d, l, r then call move interface
            // if not prompt user with error
            else if (Character.toString(direction).matches("[udlrUDLR]"))
            {
                mySquirrel.move(direction);
            }
            
            else
            {
                System.out.println("Invalid direction, try again: u, d, l, r:");
                continue;
            }
                        
         }
        
        myMaze.display(); 
        
        keyboard.close();
    }
    
    public static int getRandomNumbers(int min, int max)
    {
        return r.nextInt((max - min) + 1) + min;
    }  
    
    public static boolean getRandomBoolean() 
    {
        return r.nextBoolean();
    }
    
}
