module com.nato {
    
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.media;
    requires transitive javafx.graphics;

    opens com.nato to javafx.fxml;
    exports com.nato;
}
