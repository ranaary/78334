/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package studentarray;

import java.util.Scanner;

/**
 * this class creates array of student object and iterate through it
 * @author Megha Patel
 */
public class StudentArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        
        Student[] studList=new Student[3];// array of student objects
        for(int i=0; i<studList.length;i++)
        {
                studList[i]=new Student();
                 System.out.println("Enter student id: ");
                 studList[i].setSid(input.nextInt());
                 System.out.println("Enter student name: ");
                 studList[i].setName(input.nextLine());
      
        }
     for(int i=0; i<studList.length;i++)
        {
         System.out.println("student id: "+studList[i].getSid());        
         System.out.println("student name: "+studList[i].getName());
                  
        }
    
    }
    
    

}
