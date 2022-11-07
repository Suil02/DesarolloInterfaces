module com.example.agendaej3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.agendaej3 to javafx.fxml;
    exports com.example.agendaej3;
}