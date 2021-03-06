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
    public static Entity maze[][] = new Entity[Max_Maze_Row][Max_Maze_Column];
    public int row;
    public int col;
    
    
    Maze()
    {        
        //
    }
    
       
    public static void create(String filename) throws IOException 
    {
        
       //create the maze 
       //  instantiate the Wall entity
       //  read in the Maze.txt file
       // line is used reading in Maze.txt one line at a time
       String line;
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
        // NOTE:  also check for presence of almond, peanut or cashew
        if (row >= Max_Maze_Row)
        {
            return false;
        }
        if (col >= Max_Maze_Column)
        {
            return false;
        }
        if ((maze[row][col] == null) || (maze[row][col].symbol=="A") || (maze[row][col].symbol=="P") || (maze[row][col].symbol=="C"))
        {
            return true;
        }
        return false;
            
    }
    
        
}
