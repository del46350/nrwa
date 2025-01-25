/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import nrw.models.BurstRealData;

/**
 *
 * @author Kadzitaye.m
 */
public class BurstRealDataService {
    public ObservableList<BurstRealData> getSampleBurstDataDetails()
    {
        ObservableList<BurstRealData> burstRealData = FXCollections
                .observableArrayList();
        
        for(int i = 1; i < 11; i++) {
            burstRealData.add(new BurstRealData(i, 1.983, 72.073, 514.70));
        }
        
        return burstRealData;
    }
}
