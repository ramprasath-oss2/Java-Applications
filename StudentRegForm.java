import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class StudentRegForm extends Application {
    public static void main(String[] args) throws IOException {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        
        Label namelabel = new Label("NAME");
        TextField name = new TextField();

        Label doblabel = new Label("DATE OF BIRTH");
        DatePicker dob = new DatePicker();

        Label genderlabel = new Label("GENDER");
        ToggleGroup gender = new ToggleGroup();
        RadioButton male = new RadioButton("MALE");
        male.setToggleGroup(gender);
        RadioButton female = new RadioButton("FEMALE");
        female.setToggleGroup(gender);


        Label course = new Label("COURSE");
        ComboBox<String> a = new ComboBox<String>();
        a.setPromptText("Select");
        a.getItems().add("CSE");
        a.getItems().add("IT");
        a.getItems().add("ECE");
        a.getItems().add("EEE");
        a.getItems().add("MECH");
        a.getItems().add("CIVIL");

        Label qualification = new Label("STUDENT QUALIFICATION");
        ComboBox<String> qualify = new ComboBox<String>();
        qualify.setPromptText("Select");
        qualify.getItems().add("12-th");
        qualify.getItems().add("UG");
        qualify.getItems().add("PG");

        /* 
        ListView<String> l = new ListView<String>();
        ObservableList<String> c = FXCollections.observableArrayList();
        c.addAll("12^th", "UG", "pG");
        l.setItems(c);
        l.setPrefSize(100, 100);*/
        Button b = new Button("REGISTER");
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                b.setText("Registered");
            }
        };
        b.setOnAction(event);

        GridPane b1 = new GridPane();
        b1.setLayoutX(100);
        b1.setLayoutY(35);
        b1.setVgap(20);
        b1.setHgap(20);

        b1.add(namelabel, 0, 0);
        b1.add(name, 1, 0);

        b1.add(doblabel, 0, 1);
        b1.add(dob, 1, 1);

        b1.add(genderlabel, 0, 2);
        b1.add(male, 1, 2);
        b1.add(female, 2, 2);

        b1.add(course, 0, 3);
        b1.add(a, 1, 3);/* 
        b1.add(a1, 2, 3);
        b1.add(a2, 3, 3);
        b1.add(a3, 4, 3);
        b1.add(a4, 5, 3);*/


        b1.add(qualification, 0, 5);
        b1.add(qualify, 1, 5);
        b1.add(b, 5, 7);

        Scene scene = new Scene(b1, 700, 600);
        primaryStage.setTitle("STUDENT REGISTION FORM");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
