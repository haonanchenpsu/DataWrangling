module surge.datawrangling {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.apache.poi.ooxml;

    opens surge.datawrangling to javafx.fxml;
    exports surge.datawrangling;
    exports surge.datawrangling.controllers;
    opens surge.datawrangling.controllers to javafx.fxml;
}