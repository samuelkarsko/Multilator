/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multilator;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Objects;
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
        System.out.println("3. Multiplikation (einfach)");
        System.out.println("2. Division (einfach)");
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("");
        System.out.println("5. Addition (mehrfache Summanden)");
        System.out.println("6. Subtraktion (mehrfache Dividenten)");
        System.out.println("7. Multiplikation (mehrfache Faktoren)");
        System.out.println("8. Division (mehrfache Divisoren)");
        System.out.println("");
        System.out.println("");
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
    
     
      public void multiplication(){
        System.out.println("Multiplikation: ");
     
        double x = parseDouble(s1.next());
        double y = parseDouble(s1.next());
       
        System.out.println(x + " * "  + y + " = " + Operations.multiplication(x, y));
    }
      
      
       public void division(){
        System.out.println("Division: ");
     
        double x = parseDouble(s1.next());
        double y = parseDouble(s1.next());
       
        System.out.println(x + " / "  + y + " = " + Operations.division(x, y));
    }
       
       public void additionarr(){
       System.out.println("Addition with more Summands");
       ArrayList<Double> array = new ArrayList();
       
       array.add(parseDouble(s1.next()));
       array.add(parseDouble(s1.next()));
       int size = array.size();
     
           while (true) {
               String r = s1.next(); 
               if(!r.equals("="))
               array.add(parseDouble(r));
               else
                   break;
        }
           System.out.println(Operations.additionarr(array));
    }

       
       public void subtractionarr(){
       System.out.println("Suubtraction with more Subtrahends");
       ArrayList<Double> array = new ArrayList();
       
       array.add(parseDouble(s1.next()));
       array.add(parseDouble(s1.next()));
       int size = array.size();
     
           while (true) {
               String r = s1.next(); 
               if(!r.equals("="))
               array.add(parseDouble(r));
               else
                   break;
        }
           System.out.println(Operations.subtractionarr(array));
    }


       public void multiplicationarr(){
       System.out.println("Multiplication with more Faktors");
       ArrayList<Double> array = new ArrayList();
       
       array.add(parseDouble(s1.next()));
       array.add(parseDouble(s1.next()));
       int size = array.size();
     
           while (true) {
               String r = s1.next(); 
               if(!r.equals("="))
               array.add(parseDouble(r));
               else
                   break;
        }
           System.out.println(Operations.multiplicationarr(array));
    }

              
       public void divisionarr(){
       System.out.println("Division with more Divisors");
       ArrayList<Double> array = new ArrayList();
       
       array.add(parseDouble(s1.next()));
       array.add(parseDouble(s1.next()));
       int size = array.size();
     
           while (true) {
               String r = s1.next(); 
               if(!r.equals("="))
               array.add(parseDouble(r));
               else
                   break;
        }
           System.out.println(Operations.divisionarr(array));
    }
}
