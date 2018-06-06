
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Project4:  Boat class: constructor and 3 methods: goFast, goSlow, wherIsTheSail
 * @author jmjamison
 */
public class Boat {
    
    /** protected private fields */
    private String boatName;
    private String boatCommand;
    private Boolean  sail;
    private float speed;
    
     /** constructor, initializes the object kind of like c++?  */
    Boat(String name, String command)
    {
        this.boatName = name;
        speed = 0;
        sail = true;
        
        this.boatCommand = command;
        
        System.out.println(boatName + " : " + boatCommand);
    }
    
    /** methods */
    // check boat name
    public void powerOn()
    {
        // power up the boat
    }
    
    public void powerOff()
    {
        //
    }
    
    public void turnLeft()
    {
        //
    }
    
    public void turnRight()
    {
        //
    }
    
    public void speedUp()
    {
        // code here
        sail = true;
        speed = speed + 10;
        
        // boat speed should not exceed 100
        if (speed > 100)
        {
            speed = 100;

        }
        System.out.println(boatName + " is raising the sail at the speed of " + Math.round(speed) + " mph.\n");
    }
    
    public void slowDown()
    {
        // code here
        sail = false;
        speed = speed - 5;
        System.out.println(boatName + " is lowering the sail at the speed of " + Math.round(speed) + " mph.\n");
    }   

    /** sail is true/up
        sail is false/down */
    public void whereIsTheSail()
    {
        // code here
        if(sail)  // sail is ture/up
            System.out.println(boatName + " sail is up.\n");
        else   // sale is false/down
            System.out.println(boatName + " sail is down.\n");
    }
    
    /**  the public interface to the protected fields */
    public void setName(String name)
    {
        this.boatName = name;
    }
    
    public void setSail(boolean sail)
    {
        this.sail = sail;
    }
    
    public void setSpeed(float speed)
    {
        this.speed = speed;
    }
    
    public void checkBoatName(String name) throws IOException
    {
        this.boatName = name;
        
        //load list into array
        final String workingDir = System.getProperty("user.dir");
        try (BufferedReader br = new BufferedReader(new FileReader(workingDir + "/" + "boatNames.txt"))) 
        {
        
            String line;
            String[] boatNames = new String[100];
            int counter = 0;
            
            while ((line = br.readLine()) != null) 
            {
                boatNames[counter] = line;
                // debugging code
                //System.out.println("line number: " + counter);
                counter  += 1;
            }
            
            // debugging code
            //System.out.println("total boat names: " + counter);
            
            //for (int i=0; i < counter; i++)
            //{
                //System.out.println(boatNames[i]);
            //}
            
            //System.out.println(boatName);
            
            
                // for (String s : VALUES) if (s.equals("MYVALUE")) return true;
            //boolean result = Arrays.stream(boatNames).anyMatch(this.boatName::equals);
            //if (result) 
            //{
                //System.out.println(this.boatName + ": name on list.");
            //}
            
            
        } // end of boat name checking routine
    }
            
    
}
