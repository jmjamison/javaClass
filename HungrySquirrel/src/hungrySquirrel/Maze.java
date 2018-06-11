/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungrySquirrel;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author jmjamison
 */
public class Maze {
    
    // maze constructor
    public static int Max_Maze_Column = 50;
    public static int Max_Maze_Row = 20;
    //private BankAccount accountList[] = new BankAccount[100];;
    private static Entity maze[][] = new Entity[Max_Maze_Row][Max_Maze_Column];
    
    Maze()
    {        
        //
    }
    
       
    public static void create(String filename) throws IOException 
    {
        // System.out.println(filename); // ubiquitious debugging code
        String line;
        
        Wall gameWall = new Wall();
        System.out.println("wall symbol: " + gameWall.symbol);
        freeSpace gameFreeSpace = new freeSpace();
        System.out.println("empty space symbol: " + gameFreeSpace.symbol);
        //String line;
        
        //create the maze 
       //  read in the Maze.txt file
       try (BufferedReader br = new BufferedReader(new FileReader(filename))) 
       {
            int row = 0;
            while((line = br.readLine()) != null) 
            {   
                // line index
                //System.out.println(row + " " + line);
                for (int col=0; col<Max_Maze_Column; col++)
                {
                   
                    if (line.charAt(col) == '*')
                    {
                        maze[row][col] = new Wall();
                    }
                }
                row = row + 1;
                
            }
            System.out.println("End of maze creation routines.");
            
            // insert the nuts into the maze
            // available, ie empty spaces
            // no more than 5 nuts
            // peanuts, almonds, plus 1 poisionous cashew
            
		
	}
       catch(IOException e)
       {
           System.out.println("Exception in maze.create() " + e);
       }
        
    }
    
    public static void display()
    {
        //
        System.out.println("Display Method output");
        for (int row=0; row<Max_Maze_Row; row++ )  // rows
         {
            for (int col=0; col<Max_Maze_Column; col++)
            {
                if (maze[row][col] != null)
                {
                    System.out.print(maze[row][col].symbol);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
            
                
         }   
    }
    
    public static boolean available (int row, int col)
    {
        // takes row, column and determine if the location is blank
        //  if blank, return true
        //  if not blank false
        if (maze[row][col] == null) 
        {
            return true;
        }
        return false;
            
    }
	
    
}
