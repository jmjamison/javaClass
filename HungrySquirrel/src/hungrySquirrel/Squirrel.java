/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungrySquirrel;

import static java.lang.System.out;

/**
 *
 * @author jmjamison
 */
public class Squirrel extends Entity implements Movable {
    
    // Squirel is represented by @ symbol in the maze
    // Squirrel moves up, down, left and right.
    // Initial location of the squirl is determined by the user
    // Program prompts the user to enter the starting row and column of the squril
    // Squirrel can't move over a wall (*) but cam move over a nut
    // When Squirrel moves over a nut, it eats the nut and collects or loses points
    
    // implements movable
    
    public static int pointsCollected;
    public static int totalNutsEaten;
    
    Squirrel () 
    {
        symbol = "@";
    }
    
    @Override
    public void create()
    {
        // 
        
    }
    
    @Override
    public Entity put(int newRow, int newCol)
    {
        Maze.maze[newRow][newCol] = Squirrel.this;
        row = newRow;
        col = newCol;
        //System.out.println("Squirrel row and column: " + row + ", " + col);
        return null;
    }
    
    @Override
    public void move(char direction)
    {
        System.out.println("Squirrel starting at at: " + row + ", " + col);
        switch(direction)
        {
            case 'u':
            case 'U':
              if (Maze.available((row-1), col)) 
              {
                  if(Maze.maze[row-1][col] != null)
                  {
                      getPoints((Nut)Maze.maze[row-1][col]);
                  }
                  Maze.maze[row][col] = null;
                  row = row - 1;
                  Maze.maze[row][col] = Squirrel.this;
                  Maze.display();
              }
              else
              {
                  System.out.println("Squirrel can't jump the wall! Try again.");
              }
              break;
            case 'd':
            case 'D':
              if (Maze.available((row+1), col))
              {
                  if(Maze.maze[row+1][col] != null)
                  {
                      getPoints((Nut)Maze.maze[row+1][col]);
                  }
                  Maze.maze[row][col] = null;
                  row = row + 1;
                  Maze.maze[row][col] = Squirrel.this;
                  Maze.display();
              }
              else
              {
                  System.out.println("Squirrel can't jump the wall! Try again.");
              }
              break;
            case 'r':
            case 'R':
              if (Maze.available((row), col+1))
              {
                  if(Maze.maze[row][col+1] != null)
                  {
                      getPoints((Nut)Maze.maze[row][col+1]);
                  }
                  Maze.maze[row][col] = null;
                  col = col + 1;
                  Maze.maze[row][col] = Squirrel.this;
                  Maze.display();
              }
              else
              {
                  System.out.println("Squirrel can't jump the wall! Try again.");
              }
              break;
            case 'l':
            case 'L':
              if (Maze.available((row), col-1))
              {
                  if(Maze.maze[row][col-1] != null)
                  {
                      getPoints((Nut)Maze.maze[row][col-1]);
                  }
                  Maze.maze[row][col] = null;
                  col = col -1;
                  Maze.maze[row][col] = Squirrel.this;
                  Maze.display();
              }
              else
              {
                  System.out.println("Squirrel can't jump the wall! Try again.");
              }
              break;
                
        }
        
        
    }
    public void getPoints(Nut e)
    {
        pointsCollected = pointsCollected + e.nutritionPoints;
        totalNutsEaten++;
        System.out.println("!!!Squirrrel ate  " + e.name + " and gained " + e.nutritionPoints + " nutrition points. (Total " + pointsCollected + ") !!!");
    }
    
}
