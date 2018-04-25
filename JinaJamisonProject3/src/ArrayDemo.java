
import java.util.Scanner;

/*
 *  Project3 
 *  Winter quarter 2018
 *  Java class at ucla extension
 */

/**
 *  1) Use Scanner method from the video sample for input
 * @author jamie
 */
        
public class ArrayDemo {
    public static void main(String[] args)
    {
        int[] data = new int[5];
        Scanner in = new Scanner(System.in);
        
        for (int i=0; i < data.length; i++)
        {
            System.out.println("Enter a value (" + (i+1) + " of 5): ");
            data[i] = in.nextInt();
        }
        
        display(data);        
           
        float numberAverage = getAverage(data);
        System.out.println("Average of the numbers is: " + numberAverage);
        
        int largestNumber = getLargest(data);
        System.out.println("The largest number is: " + largestNumber);
        
        int smallestNumber = getSmallest(data);
        System.out.println("The smallest number is: " + smallestNumber);
    }
    
    /* From the scanner demo, display the integer values in the array */
    static void display(int[] values)
    {
        System.out.println("You've entered the following numbers: ");
        for (int i=0; i<values.length; i++)
        {
            System.out.print(values[i] + " ");
        }
        System.out.println("");
    }
    
    static float getAverage(int[] data)
    {
        float total=0,average=0;
        
        for (int i=0; i<data.length; i++)
        {
           total = total + data[i];
        /*
        * debugging statements
        *  System.out.println("Total = " + total);
         */
        }
        
        /*
        * debugging statements
        * System.out.println("Length = " + data.length);
        * System.out.println("Average = " + average);
        * System.out.println("Total = " + total);
         */
       
        
        if (data.length>0) { average = total/data.length; }
        
        System.out.println("Total = " + Math.round(total));
        /* 
        * print out the average in the main class
        * System.out.println("Average: " + average);
        */
        return average;
    }
    
    static int getLargest(int[] data)
    {   
        int largest = data[0];
        for (int element : data)
        {
            if (element > largest )
            largest = element;
        }
        return largest;
    }
    
    static int getSmallest(int[] data)
    {
        int smallest = data[0];
        for (int element : data)
        {
            if (element < smallest)
            smallest = element;
        }
        return smallest;
    }
}
