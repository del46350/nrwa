/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nrw.models;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 *
 * @author Kadzitaye.m
 */
public class BurstRealData {
    public IntegerProperty burstId; 
    public DoubleProperty burstDischarge;
    public DoubleProperty burstDuration;
    public DoubleProperty burstLoses;
    
    public BurstRealData(int burstId, 
            double burstDischarge, 
            double burstDuration,
            double burstLoses) {
        this.burstId = new SimpleIntegerProperty(burstId);
        this.burstDischarge = new SimpleDoubleProperty(burstDischarge);
        this.burstDuration = new SimpleDoubleProperty(burstDuration);
        this.burstLoses = new SimpleDoubleProperty(burstLoses);
    }
}
