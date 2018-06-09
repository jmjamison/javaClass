/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungrySquirrel;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;
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
    //public char maze[][];
    // int[][] array = new int[rows][columns];
    //private char maze[][];
    private static char maze[][] = new char[Max_Maze_Row][Max_Maze_Column];
    private static String line;
    
    private String filename;
    
    
    Maze()
    {
        
        this.filename = filename;
        this.line = line;
        this.maze = maze;
        
        
    }
    
       
    public static void create(String filename) 
    {
             
        System.out.println(filename);
        //String line;
        //System.out.println(Max_Maze_Row);
        
        //create the maze 
       
        
       try (BufferedReader br = new BufferedReader(new FileReader(filename))) 
       {
            int c;
            while((line = br.readLine()) != null) 
            {
                for (int i=0; i<Max_Maze_Row; i++ )  // rows
                {
                    
                    
                    for (int j=0; j<Max_Maze_Column; j++)
                    {
                        //char aChar = j.charAt(j)
                        maze[i][j] = line.charAt(j);
                        //System.out.print(line.charAt(j));
                        System.out.print(maze[i][j]);
                    }
                    System.out.println("\n");
                }   
                 
            }
       } 
       catch(IOException e) {}
        
        
    }
    
    public static void display()
    {
        //
        System.out.println("display method");
        for (int i=0; i<Max_Maze_Row; i++ )  // rows
         {
            for (int j=0; j<Max_Maze_Column; j++)
            {
                //char aChar = j.charAt(j)
                maze[i][j] = line.charAt(j);
                System.out.print(line.charAt(j));
            }
            System.out.println("\n");
            
                
         }   
        
    }
    
    public static boolean available (int row, int col)
    {
        // takes row, column and determine if the location is blank
        //  if blank, return true
        //  if not blank false
        return true;
        
    }
    
}
