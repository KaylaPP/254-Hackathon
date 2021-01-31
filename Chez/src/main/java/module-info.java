module YIC {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires java.sql;
    opens YIC to javafx.fxml;
    exports YIC;
}