/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multilator;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author Samuel Karsko
 */
public class Information {
    public static Scanner s1 = new Scanner(System.in);
    
    public static void main(String[] args){
    
        //Output of the main informations
        
        System.out.println("");
        System.out.println("Alle Funktionen: ");
        System.out.println("");
        System.out.println("1. Addition (einfach)");
        System.out.println("2. Subtraktion (einfach)");
        
             
    }
    
    public void addition(){
        System.out.println("Addition: ");
     
        double x = parseDouble(s1.next());
        double y = parseDouble(s1.next());
       
        System.out.println(x + " + "  + y + " = " + Operations.addition(x, y));
    }
    
    
    
     public void subtraction(){
        System.out.println("Subtraktion: ");
     
        double x = parseDouble(s1.next());
        double y = parseDouble(s1.next());
       
        System.out.println(x + " - "  + y + " = " + Operations.subtraction(x, y));
    }
    
}
