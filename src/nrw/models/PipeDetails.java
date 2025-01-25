/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nrw.models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 *
 * @author Kadzitaye.m
 */
public class PipeDetails {
    public IntegerProperty pipeId;
    public DoubleProperty node1;
    public DoubleProperty node2;
    public DoubleProperty diameter;
    public DoubleProperty roughness;
    public DoubleProperty length;
    
    public PipeDetails(
            int pipeId, 
            double node1, 
            double node2, 
            double length,
            double diamater, 
            double roughness) {
        this.pipeId = new SimpleIntegerProperty(pipeId);
        this.node1 = new SimpleDoubleProperty(node1);
        this.node2 = new SimpleDoubleProperty(node2);
        this.diameter = new SimpleDoubleProperty(diamater);
        this.roughness = new SimpleDoubleProperty(roughness);
        this.length = new SimpleDoubleProperty(length);
    }
}
