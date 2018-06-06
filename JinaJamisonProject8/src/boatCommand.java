
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jamie
 */
public class boatCommand {
    
    // constructor
    String[] boatCommandList = new String[]{"power on", "power off", "speed up", "slow down", "turn left", "turn right"};
    String boatCommand;
    
    boatCommand()
    {
        this.boatCommandList = boatCommandList;
        this.boatCommand = boatCommand;
    }
    
    boolean checkBoatCommand(String boatCommand)
    {
        boolean success = true;
        
        this.boatCommand = boatCommand;
        //System.out.println(boatName);
         // Convert String Array to List
        List<String> list = Arrays.asList(boatCommandList);
        
        if(list.contains(boatCommand)){
            System.out.println(boatCommand + " is a valid boat name.");
            success = true;
        }
        else
        {
            System.out.println(boatCommand + " is not a valid boat name");
            success = false;
        }
        
        return success;
    }
}


