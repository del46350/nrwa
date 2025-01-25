/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import nrw.models.PipeDetails;

/**
 *
 * @author Kadzitaye.m
 */
public class PipeDetailsService {
    
    public ObservableList<PipeDetails> getSamplePipeDetails()
    {
        ObservableList<PipeDetails> pipeDetails = FXCollections
                .observableArrayList();
        
        for(int i = 1; i < 11; i++) {
            pipeDetails.add(new PipeDetails(i, 1, 3, 59, 300, 100));
        }
        
        return pipeDetails;
    }
}
