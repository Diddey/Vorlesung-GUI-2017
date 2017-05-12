package de.fhrosenheim.gui.u03;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
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

    private final HeaderSettingsModel model = new HeaderSettingsModel();


    @FXML
    private ComboBox<String> seriesInput;
    @FXML
    private ComboBox<String> measurementInput;
    @FXML
    private ComboBox<String> hostInput;
    @FXML
    private ComboBox<String> processInput;
    @FXML
    private ComboBox<String> typeInput;
    @FXML
    private ComboBox<String> metricInput;
    @FXML
    private TextField excludeInput;
    @FXML
    private TextField textfieldInput;
    @FXML
    private ComboBox<String> samplingInput;
    @FXML
    private ComboBox<String> aggregationInput;
    @FXML
    private ComboBox<String> graphInput;
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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        /*generateGraphButton.setOnAction(this::onGenerateGraph);
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
*/
        seriesInput.valueProperty().bindBidirectional(
                model.seriesProperty()
        );
        measurementInput.valueProperty().bindBidirectional(
                model.measurementProperty()
        );
        hostInput.valueProperty().bindBidirectional(
                model.hostProperty()
        );
        processInput.valueProperty().bindBidirectional(
                model.processProperty()
        );
        typeInput.valueProperty().bindBidirectional(
                model.typeProperty()
        );
        metricInput.valueProperty().bindBidirectional(
                model.metricProperty()
        );
        samplingInput.valueProperty().bindBidirectional(
                model.samplingProperty()
        );
        aggregationInput.valueProperty().bindBidirectional(
                model.aggregationProperty()
        );
        graphInput.valueProperty().bindBidirectional(
                model.graphProperty()
        );
        excludeInput.textProperty().bindBidirectional(
                model.excludeProperty()
        );
        textfieldInput.textProperty().bindBidirectional(
                model.textfieldProperty()
        );
        fromInput.valueProperty().bindBidirectional(
                model.fromProperty()
        );
        untilInput.valueProperty().bindBidirectional(
                model.untilProperty()
        );
        expertModeInput.selectedProperty().bindBidirectional(
                model.expertModeProperty()
        );

    }

    public void onGenerateGraph(ActionEvent e) {
        LOGGER.log(Level.INFO, "on generate graph: {0}", model);
    }

    /*private HeaderSettingsModel toSettings() {
        HeaderSettingsModel result = new HeaderSettingsModel();
        result.setSeries(seriesInput.getEditor().getText());
        result.setMeasurement(measurementInput.getEditor().getText());
        result.setHost(hostInput.getEditor().getText());
        result.setProcess(processInput.getEditor().getText());
        result.setType(typeInput.getEditor().getText());
        result.setMetric(metricInput.getEditor().getText());
        result.setExclude(excludeInput.getText());
        result.setExpertMode(expertModeInput.isSelected());
        result.setTextfield(textfieldInput.getText());
        
        result.setSampling(samplingInput.getSelectionModel().getSelectedItem());
        result.setAggregation(aggregationInput.getSelectionModel().getSelectedItem());
        result.setGraph(graphInput.getSelectionModel().getSelectedItem());
        
        result.setFrom(fromInput.getValue());
        result.setUntil(untilInput.getValue());
        
        return result;
    }*/


}
