package de.fhrosenheim.gui.u03;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Controller fuer die Header-Maske
 * 
 * @author dominik.haas
 */
public class HeaderController implements Initializable {
    
    private static final Logger LOGGER = Logger.getLogger(HeaderController.class.getName());

    @FXML
    private StringProperty seriesInput = new SimpleStringProperty();
    @FXML
    private StringProperty measurementInput = new SimpleStringProperty();
    @FXML
    private StringProperty hostInput = new SimpleStringProperty();
    @FXML
    private StringProperty processInput = new SimpleStringProperty();
    @FXML
    private StringProperty typeInput = new SimpleStringProperty();
    @FXML
    private StringProperty metricInput = new SimpleStringProperty();
    @FXML
    private TextField excludeInput;
    @FXML
    private StringProperty samplingInput = new SimpleStringProperty();
    @FXML
    private StringProperty aggregationInput = new SimpleStringProperty();
    @FXML
    private StringProperty graphInput = new SimpleStringProperty();
    @FXML
    private DatePicker fromInput;
    @FXML
    private DatePicker untilInput;
    @FXML
    private CheckBox expertModeInput;
    @FXML
    private Button generateGraphButton;
    @FXML
    private Pane rootPane;

    public String getSeriesInput() {
        return seriesInput.get();
    }

    public StringProperty seriesInputProperty() {
        return seriesInput;
    }

    public void setSeriesInput(String seriesInput) {
        this.seriesInput.set(seriesInput);
    }
    public String getMeasurementInput() {
        return measurementInput.get();
    }

    public StringProperty measurementInputProperty() {
        return measurementInput;
    }

    public void setMeasurementInput(String measurementInput) {
        this.measurementInput.set(measurementInput);
    }

    public String getHostInput() {
        return hostInput.get();
    }

    public StringProperty hostInputProperty() {
        return hostInput;
    }

    public void setHostInput(String hostInput) {
        this.hostInput.set(hostInput);
    }

    public String getProcessInput() {
        return processInput.get();
    }

    public StringProperty processInputProperty() {
        return processInput;
    }

    public void setProcessInput(String processInput) {
        this.processInput.set(processInput);
    }

    public String getTypeInput() {
        return typeInput.get();
    }

    public StringProperty typeInputProperty() {
        return typeInput;
    }

    public void setTypeInput(String typeInput) {
        this.typeInput.set(typeInput);
    }

    public String getMetricInput() {
        return metricInput.get();
    }

    public StringProperty metricInputProperty() {
        return metricInput;
    }

    public void setMetricInput(String metricInput) {
        this.metricInput.set(metricInput);
    }

    public String getSamplingInput() {
        return samplingInput.get();
    }

    public StringProperty samplingInputProperty() {
        return samplingInput;
    }

    public void setSamplingInput(String samplingInput) {
        this.samplingInput.set(samplingInput);
    }

    public String getAggregationInput() {
        return aggregationInput.get();
    }

    public StringProperty aggregationInputProperty() {
        return aggregationInput;
    }

    public void setAggregationInput(String aggregationInput) {
        this.aggregationInput.set(aggregationInput);
    }

    public String getGraphInput() {
        return graphInput.get();
    }

    public StringProperty graphInputProperty() {
        return graphInput;
    }

    public void setGraphInput(String graphInput) {
        this.graphInput.set(graphInput);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        generateGraphButton.setOnAction(this::onGenerateGraph);
        //Beispiel für zwei Event Filter und deren Reihenfolge
        //Der Event Filter auf oberer Ebene blockiert das kleine "a".
        rootPane.addEventFilter(KeyEvent.KEY_TYPED, e -> {
            if("a".equals(e.getCharacter())) {
                e.consume();
            }
            LOGGER.info("KEY_PRESSED on root");
        });
        seriesInput.addEventFilter(KeyEvent.KEY_TYPED, e -> {
            LOGGER.info("KEY_PRESSED on seriesInput");
        });
    }
    
    public void onGenerateGraph(ActionEvent e) {
        LOGGER.log(Level.INFO, "on generate graph: {0}", toSettings());
    }

    private HeaderSettingsModel toSettings() {
        HeaderSettingsModel result = new HeaderSettingsModel();
        result.setSeries(seriesInput.getEditor().getText());
        result.setMeasurement(measurementInput.getEditor().getText());
        result.setHost(hostInput.getEditor().getText());
        result.setProcess(processInput.getEditor().getText());
        result.setType(typeInput.getEditor().getText());
        result.setMetric(metricInput.getEditor().getText());
        result.setExclude(excludeInput.getText());
        result.setExpertMode(expertModeInput.isSelected());
        
        result.setSampling(samplingInput.getSelectionModel().getSelectedItem());
        result.setAggregation(aggregationInput.getSelectionModel().getSelectedItem());
        result.setGraph(graphInput.getSelectionModel().getSelectedItem());
        
        result.setFrom(fromInput.getValue());
        result.setUntil(untilInput.getValue());
        
        return result;
    }


}
