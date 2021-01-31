package YIC;

import javafx.event.EventHandler;
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.Glow;
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

public class JavaFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        //Creating Elements
        boolean onElement1 = false;
        Text text1 = new Text("Name");
        Text text2 = new Text("Young Innovators Club App");

        Sphere sphere1 = new Sphere();
        Sphere sphere2 = new Sphere();
        Sphere sphere3 = new Sphere();

        Rectangle rectangleBackground = new Rectangle(808, 430);

        TextField name = new TextField();

        Button button1 = new Button("ENTER");
        Button button2 = new Button("See your name :)");
        Button button3 = new Button("COVID-19");
        Button button4 = new Button("Graphics");

        Button bbutton1 = new Button("BACK");
        Button bbutton2 = new Button("BACK");

        ScaleTransition scaleTransition1 = new ScaleTransition();
        

        //SIZE AND POS - SCENESPHERE
        sphere1.setRadius(50.0);
        sphere1.setTranslateX(100);
        sphere1.setTranslateY(150);
        sphere1.setCullFace(CullFace.FRONT);

        sphere2.setRadius(50.0);
        sphere2.setTranslateX(300);
        sphere2.setTranslateY(150);
        sphere2.setCullFace(CullFace.BACK);
        
        sphere3.setRadius(50.0);
        sphere3.setTranslateX(500);
        sphere3.setTranslateY(150);
        sphere3.setCullFace(CullFace.NONE);

        //SIZE AND POS - SCENEMAIN
        text2.setFont(Font.font("bowlby one sc", FontWeight.BOLD, FontPosture.REGULAR, 43));
        text2.setX(90);
        text2.setY(100);
        text2.setFill(Color.rgb(121, 209, 33));
        text2.setStrokeWidth(2);
        text2.setStroke(Color.rgb(0, 0, 0));

        rectangleBackground.setFill(Color.DARKGRAY);
        rectangleBackground.setX(25);
        rectangleBackground.setY(25);

        button3.setLayoutX(200);
        button3.setLayoutY(240);
        button3.setMinSize(200, 100);

        button4.setLayoutX(458);
        button4.setLayoutY(240);
        button4.setMinSize(200, 100);

        scaleTransition1.setDuration(Duration.millis(800));
        scaleTransition1.setNode(text2);
        scaleTransition1.setByX(0.1);
        scaleTransition1.setByY(0.1);
        scaleTransition1.setCycleCount(1000);
        scaleTransition1.setAutoReverse(true);
        scaleTransition1.play();

        //Group
        Group rootSphere = new Group(sphere1, sphere2, sphere3, bbutton1);
        Group rootMain = new Group(rectangleBackground, button3, button4, text2);
        Group rootCovid = new Group(text1, name, button1, button2, bbutton2);

        //Node Style
        button1.setStyle("-fx-background-color: lightblue; -fx-text-fill: darkslateblue; -fx-font: normal bold 14px 'consola';");
        button2.setStyle("-fx-background-color: lightblue; -fx-text-fill: darkslateblue; -fx-font: normal bold 14px 'consola';");
        button3.setStyle("-fx-background-color: beige; -fx-text-fill: darkslateblue; -fx-font: normal bold 25px 'bowlby one sc'; -fx-border-width: 3; -fx-border-color: black;");
        button4.setStyle("-fx-background-color: beige; -fx-text-fill: darkslateblue; -fx-font: normal bold 25px 'bowlby one sc'; -fx-border-width: 3; -fx-border-color: black;");
        text1.setStyle("-fx-font: normal bold 14px 'consola'");

        //Scenes
        Scene sceneCovid = new Scene(rootCovid, 858, 480);
        Scene sceneMain = new Scene(rootMain, 858, 480);
        Scene sceneSphere = new Scene(rootSphere, 858, 480);

        

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
                    button3.setStyle("-fx-background-color: lightblue; -fx-text-fill: darkslateblue; -fx-font: normal bold 25px 'bowlby one sc'; -fx-border-width: 3; -fx-border-color: black;");
                }
            };

        button3.addEventFilter(javafx.scene.input.MouseEvent.MOUSE_ENTERED, eventHandlerButton3B);

        javafx.event.EventHandler<javafx.scene.input.MouseEvent> eventHandlerButton3C = 
        new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent e) {
                button3.setStyle("-fx-background-color: beige; -fx-text-fill: darkslateblue; -fx-font: normal bold 25px 'bowlby one sc'; -fx-border-width: 3; -fx-border-color: black;");
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
                    button4.setStyle("-fx-background-color: lightblue; -fx-text-fill: darkslateblue; -fx-font: normal bold 25px 'bowlby one sc'; -fx-border-width: 3; -fx-border-color: black;");
                }
            };

        button4.addEventFilter(javafx.scene.input.MouseEvent.MOUSE_ENTERED, eventHandlerButton4B);

        javafx.event.EventHandler<javafx.scene.input.MouseEvent> eventHandlerButton4C = 
        new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent e) {
                button4.setStyle("-fx-background-color: beige; -fx-text-fill: darkslateblue; -fx-font: normal bold 25px 'bowlby one sc'; -fx-border-width: 3; -fx-border-color: black;");
            }
        };

    button4.addEventFilter(javafx.scene.input.MouseEvent.MOUSE_EXITED, eventHandlerButton4C);


            //BACK BUTTON 1
        javafx.event.EventHandler<javafx.scene.input.MouseEvent> eventHandlerBbutton1 = 
            new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
                @Override
                public void handle(javafx.scene.input.MouseEvent e) {
                    primaryStage.setScene(sceneMain);
                    primaryStage.show();
                }
            };

        bbutton1.addEventFilter(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandlerBbutton1);

        javafx.event.EventHandler<javafx.scene.input.MouseEvent> eventHandlerBbutton2 = 
            new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
                @Override
                public void handle(javafx.scene.input.MouseEvent e) {
                    primaryStage.setScene(sceneMain);
                    primaryStage.show();
                }
            };

        bbutton2.addEventFilter(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandlerBbutton2);




        primaryStage.setTitle("Young Innovators Club");

        primaryStage.setScene(sceneMain);

        primaryStage.show();

    }
    public static void main(String args[]){
        launch(args);
    }
}