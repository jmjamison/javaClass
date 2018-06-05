

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author jamie
 */
public class boatList {
    
    /**
     *
     * @throws IOException
     */
    public static void readBoatList() throws IOException
    {
        try (BufferedReader br = new BufferedReader(new FileReader("/media/jamie/7EDC14F5DC14A983/javaClass/JinaJamisonProject8/boatNames.txt"))) 
        {
        
            String line;
            String[] boatNames = new String[100];
            int counter = 0;
            
            while ((line = br.readLine()) != null) 
            {
                // process the line.
                //System.out.println(line);
                // private BankAccount accountList[] = new BankAccount[100];
                // int[] myIntArray = new int[3];
                // String[] anArrayOfStrings;
                boatNames[counter] = line;
                System.out.println("line number: " + counter);
                counter  += 1;
            }
            
            System.out.println("total boat names: " + counter);
            
            for (int i=0; i < counter; i++)
            {
                System.out.println(boatNames[i]);
            }
        }
    }
    
}
