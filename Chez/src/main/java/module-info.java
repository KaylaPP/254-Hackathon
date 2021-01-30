module YIC {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens YIC to javafx.fxml;
    exports YIC;
}