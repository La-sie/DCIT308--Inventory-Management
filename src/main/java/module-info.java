module com.djogatse0040.inventorysystemmanagement {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires fontawesomefx;


    opens com.djogatse0040.inventorysystemmanagement to javafx.fxml;
    exports com.djogatse0040.inventorysystemmanagement;
}