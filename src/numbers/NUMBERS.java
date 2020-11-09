/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import java.util.Scanner;

/**
 *
 * @author miriam
 */
public class NUMBERS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
      
       Scanner myKB = new Scanner(System.in);
       System.out.println( " please enter a number");
        int numb1 = myKB.nextInt();
        
        
        System.out.println ( " please enter a different number");
        int numb2= myKB.nextInt();
        
        System.out.println ( " The sum of " + numb1 + " and " + numb2 + " is " + (numb1 - numb2));
                
     
        
       
        
    }
    
}
