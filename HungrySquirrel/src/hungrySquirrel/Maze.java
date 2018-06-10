/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungrySquirrel;

//import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;
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
    //public char maze[][];
    // int[][] array = new int[rows][columns];
    //private char maze[][];
    // private static char maze[][] = new char[Max_Maze_Row][Max_Maze_Column];
    private static String maze[][] = new String[Max_Maze_Row][Max_Maze_Column];
    private static String line;
    private static String lineArray[];
    
    private String filename;
    
    
    Maze()
    {        
        this.filename = filename;
    }
    
       
    public static void create(String filename) 
    {
        System.out.println(filename); // ubiquitious debugging code
        //String line;
        //System.out.println(Max_Maze_Row);
        
        //create the maze 
       //  read in the Maze.txt file
       //StringBuilder stringBuffer = new StringBuilder(); 
       try (BufferedReader br = new BufferedReader(new FileReader(filename))) 
       {
            int c;
            while((line = br.readLine()) != null) 
            {
                for (int i=0; i<Max_Maze_Row; i++ )  // rows
                {
                    //lineArray = line.split("", -1);
                    for (int j=0; j<Max_Maze_Column; j++)
                    {
                        //char aChar = j.charAt(j)
                        //String[] ary = "abc".split("");
                        maze[i][j] = "-";
                        //System.out.print(maze[i][j]);
                    }
                    // System.out.println("\n\n");
                }
                 
            }
            
            
            // insert the nuts into the maze
            // available, ie empty spaces
            // no more than 5 nuts
            // peanuts, almonds, plus 1 poisionous cashew
            for (int i=0; i<5; i++ )  // rows 1-20, available space
            {
                Random r = new Random();  // random number benerator
                int row = r.nextInt(Max_Maze_Row)+1; // 1 is the minumum
                System.out.println("Random number: " + row);
                for (int j=0; j<Max_Maze_Column; j++)
                {
                    //Random r = new Random();
                    int col = r.nextInt(Max_Maze_Column) + 1;  // one is the minimum
                    //r = randomNumberInRange(1,10);
                    maze[row][col] = "x";
                    //maze[getRandomNumberInRange(1,Max_Maze_Row)][getRandomNumberInRange(1,Max_Maze_Column)] = "A";
                    System.out.println("Random number: " + col);
                }
                
                
            }   
		
	}
       catch(IOException e) {}
       // debugging code
        
        
        
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
                //maze[i][j] = line.charAt(j);
                System.out.print(maze[i][j]);
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
