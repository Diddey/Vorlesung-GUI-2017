package de.fhrosenheim.gui.u03;

import javafx.beans.property.*;

import java.time.LocalDate;

/**
 * POJO fuer die Eingaben im Header.
 * 
 * @author dominik.haas
 */
public class HeaderSettingsModel {

    private StringProperty series = new SimpleStringProperty();
    private StringProperty measurement = new SimpleStringProperty();
    private StringProperty host = new SimpleStringProperty();
    private StringProperty process = new SimpleStringProperty();
    private StringProperty type = new SimpleStringProperty();
    private StringProperty metric = new SimpleStringProperty();
    private StringProperty exclude = new SimpleStringProperty();
    private StringProperty sampling = new SimpleStringProperty();
    private StringProperty aggregation = new SimpleStringProperty();
    private StringProperty graph = new SimpleStringProperty();
    private StringProperty textfield = new SimpleStringProperty();

    private ObjectProperty<LocalDate> from = new SimpleObjectProperty<>();
    private ObjectProperty<LocalDate> until = new SimpleObjectProperty<>();
    private BooleanProperty expertMode = new SimpleBooleanProperty();

    public String getTextfield() {
        return textfield.get();
    }

    public StringProperty textfieldProperty() {
        return textfield;
    }

    public void setTextfield(String textfield) {
        this.textfield.set(textfield);
    }

    public Object getFrom() {
        return from.get();
    }

    public ObjectProperty<LocalDate> fromProperty() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from.set(from);
    }

    public Object getUntil() {
        return until.get();
    }

    public ObjectProperty<LocalDate> untilProperty() {
        return until;
    }

    public void setUntil(LocalDate until) {
        this.until.set(until);
    }

    public boolean isExpertMode() {
        return expertMode.get();
    }

    public BooleanProperty expertModeProperty() {
        return expertMode;
    }

    public void setExpertMode(boolean expertMode) {
        this.expertMode.set(expertMode);
    }

    public String getSeries() {
        return series.get();
    }

    public StringProperty seriesProperty() {
        return series;
    }

    public void setSeries(String series) {
        this.series.set(series);
    }

    public String getMeasurement() {
        return measurement.get();
    }

    public StringProperty measurementProperty() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement.set(measurement);
    }

    public String getHost() {
        return host.get();
    }

    public StringProperty hostProperty() {
        return host;
    }

    public void setHost(String host) {
        this.host.set(host);
    }

    public String getProcess() {
        return process.get();
    }

    public StringProperty processProperty() {
        return process;
    }

    public void setProcess(String process) {
        this.process.set(process);
    }

    public String getType() {
        return type.get();
    }

    public StringProperty typeProperty() {
        return type;
    }

    public void setType(String type) {
        this.type.set(type);
    }

    public String getMetric() {
        return metric.get();
    }

    public StringProperty metricProperty() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric.set(metric);
    }

    public String getExclude() {
        return exclude.get();
    }

    public StringProperty excludeProperty() {
        return exclude;
    }

    public void setExclude(String exclude) {
        this.exclude.set(exclude);
    }

    public String getSampling() {
        return sampling.get();
    }

    public StringProperty samplingProperty() {
        return sampling;
    }

    public void setSampling(String sampling) {
        this.sampling.set(sampling);
    }

    public String getAggregation() {
        return aggregation.get();
    }

    public StringProperty aggregationProperty() {
        return aggregation;
    }

    public void setAggregation(String aggregation) {
        this.aggregation.set(aggregation);
    }

    public String getGraph() {
        return graph.get();
    }

    public StringProperty graphProperty() {
        return graph;
    }

    public void setGraph(String graph) {
        this.graph.set(graph);
    }


/*
    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public String getExclude() {
        return exclude;
    }

    public void setExclude(String exclude) {
        this.exclude = exclude;
    }

    public String getSampling() {
        return sampling;
    }

    public void setSampling(String sampling) {
        this.sampling = sampling;
    }

    public String getAggregation() {
        return aggregation;
    }

    public void setAggregation(String aggregation) {
        this.aggregation = aggregation;
    }

    public String getGraph() {
        return graph;
    }

    public void setGraph(String graph) {
        this.graph = graph;
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public LocalDate getUntil() {
        return until;
    }

    public void setUntil(LocalDate until) {
        this.until = until;
    }

    public boolean isExpertMode() {
        return expertMode;
    }

    public void setExpertMode(boolean expertMode) {
        this.expertMode = expertMode;
    }
*/

    @Override
    public String toString() {
        return "HeaderSettingsModel{" + "series=" + series + ", measurement=" + measurement + ", host=" + host + ", process=" + process + ", type=" + type + ", metric=" + metric + ", exclude=" + exclude + ", sampling=" + sampling + ", aggregation=" + aggregation + ", graph=" + graph + ", from=" + from + ", until=" + until + ", expertMode=" + expertMode + '}';
    }
    
    
}
