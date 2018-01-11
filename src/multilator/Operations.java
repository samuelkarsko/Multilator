/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multilator;

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
        
        BigDecimal bd = new BigDecimal(x);

        return(bd.doubleValue());
    }
    
    
    
}
