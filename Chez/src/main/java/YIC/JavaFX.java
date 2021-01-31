package YIC;

import javafx.event.EventHandler;
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Sphere;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.sql.*;

public class JavaFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Creating Elements
        Text text2 = new Text("COVID-19 Hospital Resource Locator");
        Text text3 = new Text("©Young Innovators Club 2021");

        FileInputStream inputStream = new FileInputStream("src/main/resources/images/backgroundCode.png");
        Image image = new Image(inputStream);
        ImageView imageView = new ImageView(image);

        double sceneCovidResX = 1280;
        double sceneCovidResY = 720;

        double sceneMainResX = 1280;
        double sceneMainResY = 720;

        double sceneSphereResX = 1280;
        double sceneSphereResY = 720;

        Button button3 = new Button("COUNTY 1");
        Button button4 = new Button("COUNTY 2");

        Button bbutton1 = new Button("MAIN MENU");
        Button bbutton2 = new Button("MAIN MENU");

        ScaleTransition scaleTransition1 = new ScaleTransition();
        

        //SIZE AND POS - SCENESPHERE
        bbutton1.setLayoutX(0);
        bbutton1.setLayoutY(670);
        bbutton1.setMinSize(100, 50);

        //SIZE AND POS - SCENECOVID
        bbutton2.setLayoutX(0);
        bbutton2.setLayoutY(670);
        bbutton2.setMinSize(100, 50);


        //SIZE AND POS - SCENEMAIN
        text2.setFont(Font.font("bowlby one sc", FontWeight.BOLD, FontPosture.REGULAR, 46.5));
        text2.setX(135);
        text2.setY(150);
        text2.setFill(Color.rgb(121, 209, 33));
        text2.setStrokeWidth(3);
        text2.setStroke(Color.rgb(0, 0, 0));

        text3.setFont(Font.font("bowlby one sc", FontWeight.BOLD, FontPosture.REGULAR, 22.5));
        text3.setX(450);
        text3.setY(690);
        text3.setFill(Color.BLACK);

        imageView.setX(0);
        imageView.setY(0);
        imageView.setFitHeight(sceneCovidResY);
        imageView.setFitWidth(sceneCovidResX+15);
        imageView.setPreserveRatio(false);

        button3.setLayoutX(300);
        button3.setLayoutY(360);
        button3.setMinSize(300, 150);

        button4.setLayoutX(687);
        button4.setLayoutY(360);
        button4.setMinSize(300, 150);

        scaleTransition1.setDuration(Duration.millis(800));
        scaleTransition1.setNode(text2);
        scaleTransition1.setByX(0.1);
        scaleTransition1.setByY(0.1);
        scaleTransition1.setCycleCount(1000);
        scaleTransition1.setAutoReverse(true);
        scaleTransition1.play();

        //Group
        Group rootSphere = new Group(bbutton1);
        Group rootMain = new Group(imageView, button3, button4, text2, text3);
        Group rootCovid = new Group(bbutton2);

        //Node Style
        button3.setStyle("-fx-background-color: beige; -fx-text-fill: darkslateblue; -fx-font: normal bold 37.5px 'bowlby one sc'; -fx-border-width: 5; -fx-border-color: black;");
        button4.setStyle("-fx-background-color: beige; -fx-text-fill: darkslateblue; -fx-font: normal bold 37.5px 'bowlby one sc'; -fx-border-width: 5; -fx-border-color: black;");
        bbutton1.setStyle("-fx-background-color: beige; -fx-text-fill: darkslateblue; -fx-font: normal bold 20px 'bowlby one sc'; -fx-border-width: 2; -fx-border-color: black;");
        bbutton2.setStyle("-fx-background-color: beige; -fx-text-fill: darkslateblue; -fx-font: normal bold 20px 'bowlby one sc'; -fx-border-width: 2; -fx-border-color: black;");

        //Scenes
        Scene sceneCovid = new Scene(rootCovid, sceneCovidResX, sceneCovidResY);
        Scene sceneMain = new Scene(rootMain, sceneMainResX, sceneMainResY);
        Scene sceneSphere = new Scene(rootSphere, sceneSphereResX, sceneSphereResY);

        //Resolution Change
        sceneCovidResX = sceneCovid.getWidth();
        sceneCovidResY = sceneCovid.getHeight();

        sceneMainResX = sceneMain.getWidth();
        sceneMainResY = sceneMain.getHeight();

        sceneSphereResX = sceneSphere.getWidth();
        sceneSphereResY = sceneSphere.getHeight();

        //EventHandlers

            //BUTTON 3
        javafx.event.EventHandler<javafx.scene.input.MouseEvent> eventHandlerButton3 = 
            new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
                @Override
                public void handle(javafx.scene.input.MouseEvent e) {
                    primaryStage.setScene(sceneCovid);
                    primaryStage.show();
                }
            };

        button3.addEventFilter(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandlerButton3);

        javafx.event.EventHandler<javafx.scene.input.MouseEvent> eventHandlerButton3B = 
            new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
                @Override
                public void handle(javafx.scene.input.MouseEvent e) {
                    button3.setStyle("-fx-background-color: lightblue; -fx-text-fill: darkslateblue; -fx-font: normal bold 37.5px 'bowlby one sc'; -fx-border-width: 5; -fx-border-color: black;");
                }
            };

        button3.addEventFilter(javafx.scene.input.MouseEvent.MOUSE_ENTERED, eventHandlerButton3B);

        javafx.event.EventHandler<javafx.scene.input.MouseEvent> eventHandlerButton3C = 
        new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent e) {
                button3.setStyle("-fx-background-color: beige; -fx-text-fill: darkslateblue; -fx-font: normal bold 37.5px 'bowlby one sc'; -fx-border-width: 5; -fx-border-color: black;");
            }
        };

        button3.addEventFilter(javafx.scene.input.MouseEvent.MOUSE_EXITED, eventHandlerButton3C);
        
            //BUTTON 4
        javafx.event.EventHandler<javafx.scene.input.MouseEvent> eventHandlerButton4 = 
            new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
                @Override
                public void handle(javafx.scene.input.MouseEvent e) {
                    primaryStage.setScene(sceneSphere);
                    primaryStage.show();
                }
            };

        button4.addEventFilter(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandlerButton4);

        javafx.event.EventHandler<javafx.scene.input.MouseEvent> eventHandlerButton4B = 
            new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
                @Override
                public void handle(javafx.scene.input.MouseEvent e) {
                    button4.setStyle("-fx-background-color: lightblue; -fx-text-fill: darkslateblue; -fx-font: normal bold 37.5px 'bowlby one sc'; -fx-border-width: 5; -fx-border-color: black;");
                }
            };

        button4.addEventFilter(javafx.scene.input.MouseEvent.MOUSE_ENTERED, eventHandlerButton4B);

        javafx.event.EventHandler<javafx.scene.input.MouseEvent> eventHandlerButton4C = 
        new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent e) {
                button4.setStyle("-fx-background-color: beige; -fx-text-fill: darkslateblue; -fx-font: normal bold 37.5px 'bowlby one sc'; -fx-border-width: 5; -fx-border-color: black;");
            }
        };

        button4.addEventFilter(javafx.scene.input.MouseEvent.MOUSE_EXITED, eventHandlerButton4C);


            //BACK BUTTON SPHERE (1)
        javafx.event.EventHandler<javafx.scene.input.MouseEvent> eventHandlerBbutton1 = 
            new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
                @Override
                public void handle(javafx.scene.input.MouseEvent e) {
                    primaryStage.setScene(sceneMain);
                    primaryStage.show();
                }
            };

        bbutton1.addEventFilter(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandlerBbutton1);

        javafx.event.EventHandler<javafx.scene.input.MouseEvent> eventHandlerBbutton1B = 
            new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
                @Override
                public void handle(javafx.scene.input.MouseEvent e) {
                    bbutton1.setStyle("-fx-background-color: lightblue; -fx-text-fill: darkslateblue; -fx-font: normal bold 20px 'bowlby one sc'; -fx-border-width: 2; -fx-border-color: black;");
                }
            };

        bbutton1.addEventFilter(javafx.scene.input.MouseEvent.MOUSE_ENTERED, eventHandlerBbutton1B);

        javafx.event.EventHandler<javafx.scene.input.MouseEvent> eventHandlerBbutton1C = 
            new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
                @Override
                public void handle(javafx.scene.input.MouseEvent e) {
                    bbutton1.setStyle("-fx-background-color: beige; -fx-text-fill: darkslateblue; -fx-font: normal bold 20px 'bowlby one sc'; -fx-border-width: 2; -fx-border-color: black;");
                }
            };

        bbutton1.addEventFilter(javafx.scene.input.MouseEvent.MOUSE_EXITED, eventHandlerBbutton1C);

            //BACK BUTTON COVID (2)
        javafx.event.EventHandler<javafx.scene.input.MouseEvent> eventHandlerBbutton2 = 
            new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
                @Override
                public void handle(javafx.scene.input.MouseEvent e) {
                    primaryStage.setScene(sceneMain);
                    primaryStage.show();
                }
            };

        bbutton2.addEventFilter(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandlerBbutton2);

        javafx.event.EventHandler<javafx.scene.input.MouseEvent> eventHandlerBbutton2B = 
            new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
                @Override
                public void handle(javafx.scene.input.MouseEvent e) {
                    bbutton2.setStyle("-fx-background-color: lightblue; -fx-text-fill: darkslateblue; -fx-font: normal bold 20px 'bowlby one sc'; -fx-border-width: 2; -fx-border-color: black;");
                }
            };

        bbutton2.addEventFilter(javafx.scene.input.MouseEvent.MOUSE_ENTERED, eventHandlerBbutton2B);

        javafx.event.EventHandler<javafx.scene.input.MouseEvent> eventHandlerBbutton2C = 
            new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
                @Override
                public void handle(javafx.scene.input.MouseEvent e) {
                    bbutton2.setStyle("-fx-background-color: beige; -fx-text-fill: darkslateblue; -fx-font: normal bold 20px 'bowlby one sc'; -fx-border-width: 2; -fx-border-color: black;");
                }
            };

        bbutton2.addEventFilter(javafx.scene.input.MouseEvent.MOUSE_EXITED, eventHandlerBbutton2C);

        primaryStage.setTitle("Young Innovators Club");
        primaryStage.setResizable(false);
        primaryStage.setScene(sceneMain);
        primaryStage.show();

    }
    public static void main(String args[]){
        launch(args);
    }
}