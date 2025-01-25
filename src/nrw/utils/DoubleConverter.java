/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nrw.utils;

import javafx.util.StringConverter;

/**
 *
 * @author Kadzitaye.m
 */
public class DoubleConverter extends StringConverter<Double> {

    @Override
    public String toString(Double object) {
        return object != null ? String.valueOf(object) : "";
    }

    @Override
    public Double fromString(String string) {
        try {
            return Double.valueOf(string);
        } catch (Exception ex) {
            return null;
        }
    }
   
}

