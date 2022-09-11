module com.kensoftph.textarea {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kensoftph.textarea to javafx.fxml;
    exports com.kensoftph.textarea;
}