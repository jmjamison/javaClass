/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author jmjamison
 */
public class roster {
    public static void main(String[] args)
    {
    
        String filename = "roster.txt";
        PrintWriter out;
        
        try 
        {
        
            out = new PrintWriter(filename);
        }
        catch(FileNotFoundExcaption e)
        {
            System.out.println("unable to open file " + filename);
            return;
        }
        
        // prompt user to enter text or quit program
        System.out.println("Enter student name and grade (name, grade) or quit: ");
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
            if (tokens.length != 2)
            {
                System.out.println("Invalid format, try again ....");
                continue;
            }
            
            String name = tokens[0].trim();
            String grade = tokens[1].trim();
            
            out.printf("%-10s %s \r\n", name, grade);
        
        }
        
        keyboard.close();
        out.close();
    
    }
    
}