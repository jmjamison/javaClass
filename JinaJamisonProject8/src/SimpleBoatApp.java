
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jmjamison
 */

public class SimpleBoatApp {
    public static void main(String[] args)  throws IOException
    {
        //boatList.readBoatList();
        
        // prompt user to enter boat names and command, separated by comma
        System.out.println("Enter boat name and command (boat, commant) or quit:");
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
                System.out.println("Invalid format, try: boatName, boat command");
                continue;
            }
            
            String boatName = tokens[0].trim();
            String boatCommand = tokens[1].trim();
            
            Boat boat2 = new Boat(boatName, boatCommand);
            // check boat name
            boat2.checkBoatName(boatName);
            
        
        }
        
        keyboard.close();
    }
    
}
