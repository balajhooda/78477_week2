/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author _sowill
 */
public class Student {
    int id;
    String name;
    
    public static void main(String[]args){
        Student [] list=new Student[5];
        Scanner input=new Scanner(System.in);
        
        
        for(int i=0;i<list.length;i++)
        {
            list[i]=new Student();
            System.out.print("\nEnter student id ");
            list[i].id=input.nextInt();
            System.out.print("Enter student name ");
            list[i].name=input.next();
            System.out.print("Student id "+ list[i].id+ " Student name "+ list[i].name);
            
        }
        
        
        





    
        
        
        
    }
    }
        
        
        
        
    
    

