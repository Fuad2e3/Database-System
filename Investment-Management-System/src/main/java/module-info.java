module com.softece.ims {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.jfoenix;
    requires java.sql;
    requires javafx.base;


    opens com.softece.ims to javafx.fxml;
    exports com.softece.ims;
}