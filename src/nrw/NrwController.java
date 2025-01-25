/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nrw;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.BooleanProperty;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.TextFieldTableCell;
import nrw.models.BurstRealData;
import nrw.models.PipeDetails;
import nrw.utils.DoubleConverter;
import services.BurstRealDataService;
import services.PipeDetailsService;

/**
 *
 * @author Kadzitaye.m
 */
public class NrwController implements Initializable {

    @FXML
    private TableView<BurstRealData> burstRealTable;
    @FXML
    private TableColumn<BurstRealData, Integer> burstNoCol;
    @FXML
    private TableColumn<BurstRealData, Double> burstDischargeCol;
    @FXML
    private TableColumn<BurstRealData, Double> burstDurationCol;
    @FXML
    private TableColumn<BurstRealData, Double> burstLosesCol;
    @FXML
    private TableColumn<BurstRealData, BooleanProperty> burstActionCol;
    @FXML
    private TableView<PipeDetails> pipeDetailsTable;
    @FXML
    private TableColumn<PipeDetails, Integer> pipeIdCol;
    @FXML
    private TableColumn<PipeDetails, Double> pipeNode1Col;
    @FXML
    private TableColumn<PipeDetails, Double> pipeNode2Col;
    @FXML
    private TableColumn<PipeDetails, Double> pipeLengthCol;
    @FXML
    private TableColumn<PipeDetails, Double> pipeDiameterCol;
    @FXML
    private TableColumn<PipeDetails, Double> pipeRoughnessCol;
    @FXML
    private TableColumn<PipeDetails, BooleanProperty> pipeActionCol;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       initializePipeDetailsTable();
       
       initializeBurstDataTable();
    }

    private void initializePipeDetailsTable() {
        setPipeDetailsTableValueCellFactory();
        
        ObservableList<PipeDetails> pipeDetails = new PipeDetailsService()
                .getSamplePipeDetails();
                  
        pipeDetailsTable.setItems(pipeDetails);
        
        enableEditInPipeColumns();
    }
    
    private void setPipeDetailsTableValueCellFactory() {
         pipeIdCol.setCellValueFactory(
                (CellDataFeatures<PipeDetails, Integer> p)
                -> p.getValue().pipeId.asObject()
        );
        
        pipeNode1Col.setCellValueFactory(
                (CellDataFeatures<PipeDetails, Double> p)
                -> p.getValue().node1.asObject()
        );
        
        pipeNode2Col.setCellValueFactory(
                (CellDataFeatures<PipeDetails, Double> p)
                -> p.getValue().node2.asObject()
        );
        
        pipeDiameterCol.setCellValueFactory(
                (CellDataFeatures<PipeDetails, Double> p)
                -> p.getValue().diameter.asObject()
        );
        
        pipeRoughnessCol.setCellValueFactory(
                (CellDataFeatures<PipeDetails, Double> p)
                -> p.getValue().roughness.asObject()
        );
        
        pipeLengthCol.setCellValueFactory(
                (CellDataFeatures<PipeDetails, Double> p)
                -> p.getValue().length.asObject()
        );
    }

    private void enableEditInPipeColumns() {
        pipeNode1Col.setCellFactory(TextFieldTableCell.forTableColumn(
            new DoubleConverter()));
        
        pipeNode2Col.setCellFactory(TextFieldTableCell.forTableColumn(
            new DoubleConverter()));
        
        pipeDiameterCol.setCellFactory(TextFieldTableCell.forTableColumn(
            new DoubleConverter()));
        
        pipeRoughnessCol.setCellFactory(TextFieldTableCell.forTableColumn(
            new DoubleConverter()));
        
        pipeLengthCol.setCellFactory(TextFieldTableCell.forTableColumn(
            new DoubleConverter()));

        //pipeActionCol.setOnEditCommit(e -> System.out.println(e.getNewValue()));

    }
    
    private void initializeBurstDataTable() {
        setBurstTableValueCellFactory();
        
        ObservableList<BurstRealData> burstRealData = new BurstRealDataService()
                .getSampleBurstDataDetails();
                  
        burstRealTable.setItems(burstRealData);
        
        enableEditInBurstColumns();
    }
    
    private void setBurstTableValueCellFactory() {
         burstNoCol.setCellValueFactory(
                (CellDataFeatures<BurstRealData, Integer> p)
                -> p.getValue().burstId.asObject()
        );
        
        burstDurationCol.setCellValueFactory(
                (CellDataFeatures<BurstRealData, Double> p)
                -> p.getValue().burstDuration.asObject()
        );
        
        burstLosesCol.setCellValueFactory(
                (CellDataFeatures<BurstRealData, Double> p)
                -> p.getValue().burstLoses.asObject()
        );
        
        burstDischargeCol.setCellValueFactory(
                (CellDataFeatures<BurstRealData, Double> p)
                -> p.getValue().burstDischarge.asObject()
        );
    }   
    
    private void enableEditInBurstColumns() {
        burstDurationCol.setCellFactory(TextFieldTableCell.forTableColumn(
            new DoubleConverter()));
        
        burstLosesCol.setCellFactory(TextFieldTableCell.forTableColumn(
            new DoubleConverter()));
        
        burstDischargeCol.setCellFactory(TextFieldTableCell.forTableColumn(
            new DoubleConverter()));

        //burstDurationCol.setOnEditCommit(e -> System.out.println(e.getNewValue()));

    }
}
