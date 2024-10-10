/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numbers;
import java.util.Scanner;

/**
 *
 * @author Angel Vhugie
 */
public class Numbers {

    public static void main(String[] args) {
        int num1,num2,results=0;
        //Creatingf object for a scanner
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter First number");
        num1= sc.nextInt();
        
        System.out.println("Enter Second number");
        num2= sc.nextInt();
        
        System.out.print("====Menu=====");
        System.out.println("Enter the corresponding number of item in the menu");
        
        System.out.println("(1) Addition");
        System.out.println("(2) Subtraction");
        System.out.println("(3) Division");
        System.out.println("(4) multiplication");
       
          int i =0;
         while(i < 4){
             i++;
        
        System.out.print("Enter the number of your option");
        int option= sc.nextInt();
        
        
        
      switch(option){
          case 1:
          results=num1+num2;
          break;
          
          case 2:
          results=num1-num2;
          break;
          
           case 3:
          results=num1*num2;
          break;
          
          case 4:
          results=num1/num2;
          break;
              
          default:
              
              System.out.println("Calculation not recognized");
          
      }
      System.out.println("Answer"+ results);
    }
    }
}
          

      
         
    
