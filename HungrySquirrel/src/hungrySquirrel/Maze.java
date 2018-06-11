/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungrySquirrel;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

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
       Wall gameWall = new Wall();
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
            
            // insert the nuts into the maze in available, ie empty spaces
            // no more than 5 nuts total, set in the nut.class
            // peanuts, almonds, plus 1 poisionous cashew
            // 50/50 chance for a peanut or almond
            //System.out.println(Total nuts allowed: ) + Nut.totalNuts;
            Nut nutsTotal = new Nut();
            
            for (int nutCount = 1; nutCount < nutsTotal.totalNuts/2; nutCount++)
            {
                int nutRow = getRandomNumbers(1, 20);
                int nutCol = getRandomNumbers(1, 50);
                
                if(available(nutRow, nutCol))
                {
                    maze[nutRow][nutCol] = new Almond();
                }
                else
                {
                    continue;
                }
            }
            
            for (int nutCount = 1; nutCount < nutsTotal.totalNuts/2; nutCount++)
            {
                //System.out.println("Random rows and cols: " + getRandomNumbers(1, 20) + ", " + getRandomNumbers(1, 50));
                int nutRow = getRandomNumbers(1, 20);
                int nutCol = getRandomNumbers(1, 50);
                
                if(available(nutRow, nutCol))
                {
                    maze[nutRow][nutCol] = new Peanut();
                }
                else
                {
                    continue;
                }
                
            }
            
            int nutRow = getRandomNumbers(1, 20);
            int nutCol = getRandomNumbers(1, 50);
                
            if(available(nutRow, nutCol))
            {
                maze[nutRow][nutCol] = new PoisonousCashew();
            }
                    
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
        if (row >= 20)
        {
            System.out.println("Don't pick a row 20 or greater!");
            return false;
        }
        if (col >= 50)
        {
            System.out.println("Don't pick a column 50 or greater!");
            return false;
        }
        if (maze[row][col] == null)
        {
            return true;
        }
        
        return false;
            
    }
    
    public static int getRandomNumbers(int min, int max)
    {
        Random r = new Random();           
	return r.nextInt((max - min) + 1) + min;
    }      
        
    
}
