/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multilator;

import java.util.Scanner;

/**
 *
 * @author Samuel Karsko
 */
public class Multilator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Asking for Info-Assistent
        System.out.println("Möchten sie den Multilator-Assistent aufrufen?");
        
        Scanner s1 = new Scanner(System.in);
        String info = s1.next();
        
        //Checking, if the input is "Y" or "N"
        while (!info.equals("J") && !info.equals("N")) {           
             System.out.println("Bitte J für ja oder N für nein eingeben.");
             info = s1.next();            
        }
       
        if(info.equals("J")){
        Information.main(args);
        }
        
   
            System.out.println("Bitte Operation aus der Liste eingeben: ");
            int operation = s1.nextInt();    
            Information i = new Information();  
     
     
       if(operation == 1 )  i.addition();
       if(operation == 2 )  i.subtraction();
       if(operation == 3 )  i.multiplication();
       if(operation == 4 )  i.division();
    
    
    
    
    }
    
}
