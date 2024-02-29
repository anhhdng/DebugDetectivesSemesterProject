module swe6673.debugdetectives.sprint1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires junit;


    opens swe6673.debugdetectives.sprint1 to javafx.fxml;
    exports swe6673.debugdetectives.sprint1;
}