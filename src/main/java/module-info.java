module hu.petrik.java1115 {
    requires javafx.controls;
    requires javafx.fxml;


    opens hu.petrik.java1115 to javafx.fxml;
    exports hu.petrik.java1115;
}