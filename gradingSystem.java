/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.util.Scanner;
/*
 *
 * @author Prubdeep
 */
public class gradingSystem {

    /**
     * @param args the command line arguments
     */
    
    private static Scanner sc;
    public static void main(String[] args) {
        int English, Science, Kiswahili, Maths, SSt;
        float total, Percentage;
        String name;
        
    Scanner input = new Scanner(System.in);
        
        System.out.println(" Please enter your full name: ");
        name = input.nextLine();
        
         System.out.println("Enter the marks attained in each subject: ");
        
        System.out.println("English: ");
        English = input.nextInt();
        
       System.out.println("Science: ");
        Science = input.nextInt();
        
        
       System.out.println("Kiswahili: ");
        Kiswahili = input.nextInt();
        
        
         System.out.println("Maths: ");
        Maths = input.nextInt();
        
         SSt = input.nextInt();
         System.out.println("SSt: " + SSt);
        
        
        
        total = English + Science + Kiswahili + Maths + SSt;
        Percentage = (total/500)*100;
        
        
        System.out.println("Total marks= " + total);
         System.out.println("In percentage= "+ Percentage);
         
         
         if(Percentage >= 90){
             System.out.println("Grade A");
         }
         else if(Percentage >= 80){
             System.out.println("Grade B");
             
         }
         else if (Percentage >= 70){
             System.out.println("Grade C");
         }
         else if(Percentage >= 60){
             
             System.out.println("Grade D");
         }
         else if(Percentage >= 50){
             System.out.println("Grade E");
         }
         else if(Percentage <50){
             System.out.println("Fail");
         }
        
        // TODO code application logic here
    }

   
    }