/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multilator;

import com.sun.org.apache.xpath.internal.operations.Equals;
import static java.lang.String.valueOf;
import java.math.BigDecimal;


/**
 *
 * @author Samuel Karsko
 */
public class Operations {
    
    public static double addition(double x, double y){
        BigDecimal bd = new BigDecimal(x);
        bd = bd.add(new BigDecimal(y));
       
        return(bd.doubleValue());
    }
    
    
    public static double subtraction(double x, double y){
        BigDecimal bd = new BigDecimal(valueOf(x));      
        bd = bd.subtract(new BigDecimal(valueOf(y)));
     
        return(bd.doubleValue());
    }
    
    
    public static double multiplication(double x, double y){
        BigDecimal bd = new BigDecimal(valueOf(x));      
        bd = bd.multiply(new BigDecimal(valueOf(y)));
     
        return(bd.doubleValue());
    }
    
    
    public static double division(double x, double y){
  
        BigDecimal bd = new BigDecimal(valueOf(x));      
        bd = bd.divide(new BigDecimal(valueOf(y)));
     
        return(bd.doubleValue());
    }
}
