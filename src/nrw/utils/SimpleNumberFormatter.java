/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nrw.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Kadzitaye.m
 */
public class SimpleNumberFormatter {
    
    public static double FormatDouble(double val) {
        BigDecimal decimal = new BigDecimal(val);
        
        decimal = decimal.setScale(3, RoundingMode.HALF_UP);
        
        return decimal.doubleValue();
    }
    
}
