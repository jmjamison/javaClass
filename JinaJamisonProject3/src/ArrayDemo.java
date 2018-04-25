
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *  1) Use Scanner method from the video
 * @author jamie
 */
        
public class ArrayDemo {
    public static void main(String[] args)
    {
        int[] data = new int[5];
        Scanner in = new Scanner(System.in);
        
        for (int i=0; i < data.length; i++)
        {
            System.out.println("Enter an value for index1 " + i + ":");
            data[i] = in.nextInt();
        }
        
        display(data);
        
        float numberAverage = getAverage(data);
        System.out.println("Average of numbers: " + numberAverage);
        
        
    }
    
    /*      
     *   More from the scanner demo, display the integer values in the array
     *
    */
    static void display(int[] values)
    {
        System.out.println("You entered the following numbers: ");
        for (int i=0; i<values.length; i++)
        {
            System.out.print(values[i] + " ");
        }
        System.out.println("");
    }
    
    static float getAverage(int[] data)
    {
        float total=0;
        float average=0;
        
        for (int i=0; i<data.length; i++)
        {
           total = total + data[i];
           System.out.println("Total = " + total);
        }
        
        /*
        * debugging statements
         */
        System.out.println("Length = " + data.length);
        System.out.println("Average = " + average);
        System.out.println("Total = " + Math.round(total));
       
        
        if (data.length>0) { average = total/data.length; }
        
        System.out.println("Total = " + total);
        System.out.println("Average: " + average);
        return average;
    }
    static int getLargest(int[] data)
    {   
        // code
        return 0;
    }
    
    static int getSmallest(int[] data)
    {
        // code
        return 0;
    }
}
