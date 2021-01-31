package YIC;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.sql.*;

public class JavaFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text1 = new Text("TEST");

        TextField textField1 = new TextField();

        Button button1 = new Button("BUTTON");

        GridPane gridPane = new GridPane();

        gridPane.setMinSize(400, 200);
        
        gridPane.setAlignment(Pos.CENTER);
        
        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);

        Scene scene = new Scene(gridPane);

        primaryStage.setTitle("CSS Example");

        primaryStage.setScene(scene);

        primaryStage.show();

    }
    public static void main(String args[]){
        launch(args);
    }
}