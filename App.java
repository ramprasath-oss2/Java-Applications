import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage myStage) throws Exception { 
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 400, 200);
        MenuBar menu1 = new MenuBar();

        Menu fileMenu = new Menu("File");
        MenuItem itm1 = new MenuItem("New");
        MenuItem itm2 = new MenuItem("Save");
        MenuItem itm3 = new MenuItem("Exit");

        Menu editMenu = new Menu("Edit");
        MenuItem edit1 = new MenuItem("Cut");
        MenuItem edit2 = new MenuItem("Copy");
        MenuItem edit3 = new MenuItem("Paste");

        fileMenu.getItems().addAll(itm1, itm2, itm3);
        editMenu.getItems().addAll(edit1, edit2, edit3);
        menu1.getMenus().addAll(fileMenu, editMenu);
        root.setTop(menu1);
        myStage.setScene(scene);
        myStage.setTitle("My First Menu Application");
        myStage.show();
        
    }
}
