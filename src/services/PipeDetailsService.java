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
import nrw.utils.SimpleNumberFormatter;

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
            pipeDetails.add(new PipeDetails(i, 
                    SimpleNumberFormatter.FormatDouble(1 + i), 
                    SimpleNumberFormatter.FormatDouble(3 + i), 
                    SimpleNumberFormatter.FormatDouble(59 + i), 
                    SimpleNumberFormatter.FormatDouble(300 + i), 
                    SimpleNumberFormatter.FormatDouble(100 + i)));
        }
        
        return pipeDetails;
    }
}
