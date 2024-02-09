module com.github.jingerjesus.towerofbabelemu {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.github.jingerjesus.towerofbabelemu to javafx.fxml;
    exports com.github.jingerjesus.towerofbabelemu;
}