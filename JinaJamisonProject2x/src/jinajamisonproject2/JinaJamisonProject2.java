/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jinajamisonproject2;

/**
 *
 * @author jmjamison
 */
public class JinaJamisonProject2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int totalStudents = 5;
        int count = 1;        
        char letterGrade;
        //letterGrade = 'A';
        
        while (count <= totalStudents)
        {
            
        int grade = (int) (Math.random() * 50) + 50;   // generate the grade
        
        if (grade >= 90 && grade <= 100)
        {
            letterGrade = 'A';
            System.out.println("Student grade is " + grade + " which is " + letterGrade + "\n");
        }
        else if (grade >= 80 && grade <= 89)
        {
            letterGrade = 'B';
            System.out.println("Student grade is " + grade + " which is " + letterGrade + "\n");
        }
        else if (grade >= 70 && grade <= 79)
        {
            letterGrade = 'C';
            System.out.println("Student grade is " + grade + " which is " + letterGrade + "\n");
        }
        else if (grade >= 60 && grade <= 69)
        {
            letterGrade = 'D';
            System.out.println("Student grade is " + grade + " which is " + letterGrade + "\n");
        }
        else if (grade  <= 60)
        {
            letterGrade = 'F';
            System.out.println("Student grade is " + grade + " which is " + letterGrade + "\n");
        }
        //System.out.println("Student grade is " + grade + " which is " + letterGrade + "\n");
        count++;
        }
        
    }
    
}
