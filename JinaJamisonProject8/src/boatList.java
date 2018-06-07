

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author jamie
 */
public class boatList {
    
    /**
     *
     * @throws IOException
     */
    String line;
    String[] boatNames = new String[100];
    String boatName;
    String workingDirectory;
            
    boatList()
    {
        this.line = line;
        this.boatName = boatName;
        this.boatNames = boatNames;
    }
    
    void createBoatList() throws IOException
    {
        workingDirectory = System.getProperty("user.dir") + "/";
        //System.out.println("working directory: " + workingDirectory);
        
        try (BufferedReader br = new BufferedReader(new FileReader(workingDirectory + "boatNames.txt"))) 
        {
            
            //String line;
            //String[] boatNames = new String[100];
            int counter = 0;
            
            while ((line = br.readLine()) != null) 
            {
                // String[] anArrayOfStrings;
                boatNames[counter] = line;
                counter  += 1;
            }
            
            //System.out.println("total boat names: " + counter);
            
            
        }
        
    }
    void listBoats() throws IOException
    {
        System.out.println("List of Available Boats\n");
        workingDirectory = System.getProperty("user.dir") + "/";
        //System.out.println("working directory: " + workingDirectory);
        
        try (BufferedReader br = new BufferedReader(new FileReader(workingDirectory + "boatNames.txt"))) 
        {
            
            //String line;
            //String[] boatNames = new String[100];
            int counter = 0;
            
            while ((line = br.readLine()) != null) 
            {
                // String[] anArrayOfStrings;
                System.out.println(line);
                counter  += 1;
            }
            
            //System.out.println("total boat names: " + counter);
            
            
        }
        
    }
    
    boolean checkBoatName(String name)
    {
        boolean success = true;
        
        this.boatName = name;
        //System.out.println(boatName);
         // Convert String Array to List
        List<String> list = Arrays.asList(boatNames);
        
        if(list.contains(boatName)){
            // System.out.println(boatName + " is a valid boat name.");
            success = true;
        }
        else
        {
            System.out.println(boatName + " is not a valid boat name, try again.");
            success = false;
        }
        
        return success;
    }
    
    
}
