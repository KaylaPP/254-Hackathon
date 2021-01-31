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
        Text text1 = new Text("Orange County");
        Text text2 = new Text("COVID-19 \nHospital Resource \nLocator");
        Text text3 = new Text("©Young Innovators Club 2021");
        Text text4 = new Text("Broward County");

        ChoiceBox<String> choiceBox1 = new ChoiceBox();

        FileInputStream inputStream1 = new FileInputStream("src/main/resources/images/fl.png");
        Image image1 = new Image(inputStream1);
        ImageView imageView1 = new ImageView(image1);

        FileInputStream inputStream2 = new FileInputStream("src/main/resources/images/orange.png");
        Image image2 = new Image(inputStream2);
        ImageView imageView2 = new ImageView(image2);

        FileInputStream inputStream3 = new FileInputStream("src/main/resources/images/broward.png");
        Image image3 = new Image(inputStream3);
        ImageView imageView3 = new ImageView(image3);

        double sceneOrangeResX = 1280;
        double sceneOrangeResY = 720;

        double sceneMainResX = 1280;
        double sceneMainResY = 720;

        double sceneBrowardResX = 1280;
        double sceneBrowardResY = 720;

        Button button3 = new Button("Orange County");
        Button button4 = new Button("Broward County");

        Button bbutton1 = new Button("MAIN MENU");
        Button bbutton2 = new Button("MAIN MENU");

        ScaleTransition scaleTransition1 = new ScaleTransition();
        

        //SIZE AND POS - SCENEBROWARD
        bbutton1.setLayoutX(0);
        bbutton1.setLayoutY(670);
        bbutton1.setMinSize(100, 50);

        imageView3.setX(0);
        imageView3.setY(0);
        imageView3.setFitHeight(sceneBrowardResY);
        imageView3.setFitWidth(sceneBrowardResX);
        imageView3.setPreserveRatio(true);

        text4.setFont(Font.font("bowlby one sc", FontWeight.BOLD, FontPosture.REGULAR, 46.5));
        text4.setX(780);
        text4.setY(60);
        text4.setFill(Color.rgb(121, 209, 33));
        text4.setStrokeWidth(3);
        text4.setStroke(Color.rgb(0, 0, 0));

        //SIZE AND POS - SCENEORANGE
        bbutton2.setLayoutX(0);
        bbutton2.setLayoutY(670);
        bbutton2.setMinSize(100, 50);

        imageView2.setX(0);
        imageView2.setY(0);
        imageView2.setFitHeight(sceneOrangeResY);
        imageView2.setFitWidth(sceneOrangeResX);
        imageView2.setPreserveRatio(true);

        text1.setFont(Font.font("bowlby one sc", FontWeight.BOLD, FontPosture.REGULAR, 46.5));
        text1.setX(820);
        text1.setY(60);
        text1.setFill(Color.rgb(121, 209, 33));
        text1.setStrokeWidth(3);
        text1.setStroke(Color.rgb(0, 0, 0));

        choiceBox1.getItems().add("Aspire Health Partners");
        choiceBox1.getItems().add("Brookwood Community Hospital");
        choiceBox1.getItems().add("Cancer Center of Florida");
        choiceBox1.getItems().add("Central Florida Hospital");
        choiceBox1.getItems().add("Doctor P Phillips Hospital");
        choiceBox1.getItems().add("Florida Hospital Apopka");
        choiceBox1.getItems().add("Florida Hospital East Orlando");
        choiceBox1.getItems().add("Florida Hospital of Maitland");
        choiceBox1.getItems().add("Florida Hospital Orlando");
        choiceBox1.getItems().add("Florida Hospital Winter Park Memorial Hospital");
        choiceBox1.getItems().add("Florida Sanitarium");
        choiceBox1.getItems().add("Health Central Hospital");
        choiceBox1.getItems().add("Lakeside Alternatives Treatment Facility");
        choiceBox1.getItems().add("Orlando Health Arnold Palmer Hospital for Children");
        choiceBox1.getItems().add("Orlando Health Orlando Regional Medical Center");
        choiceBox1.getItems().add("Orlando Regional Medical Center Lucerne Pavilion");
        choiceBox1.getItems().add("Orlando Surgery Center");
        choiceBox1.getItems().add("Princeton Hospital");
        choiceBox1.getItems().add("Walt Disney Memorial Cancer Institute");
        choiceBox1.getItems().add("Winter Park Ambulatory Surgery Center");
        choiceBox1.getItems().add("Winter Park Womens Center");
        choiceBox1.setLayoutX(400);
        choiceBox1.setLayoutY(400);

        //SIZE AND POS - SCENEMAIN
        text2.setFont(Font.font("bowlby one sc", FontWeight.BOLD, FontPosture.REGULAR, 46.5));
        text2.setX(80);
        text2.setY(325);
        text2.setFill(Color.rgb(121, 209, 33));
        text2.setStrokeWidth(3);
        text2.setStroke(Color.rgb(0, 0, 0));

        text3.setFont(Font.font("bowlby one sc", FontWeight.BOLD, FontPosture.REGULAR, 22.5));
        text3.setX(450);
        text3.setY(690);
        text3.setFill(Color.BLACK);

        imageView1.setX(0);
        imageView1.setY(0);
        imageView1.setFitHeight(sceneMainResY);
        imageView1.setFitWidth(sceneMainResX+15);
        imageView1.setPreserveRatio(false);

        button3.setLayoutX(730);
        button3.setLayoutY(280);
        button3.setMinSize(75, 37);

        button4.setLayoutX(800);
        button4.setLayoutY(510);
        button4.setMinSize(75, 37);

        scaleTransition1.setDuration(Duration.millis(2000));
        scaleTransition1.setNode(text2);
        scaleTransition1.setByX(0.075);
        scaleTransition1.setByY(0.075);
        scaleTransition1.setCycleCount(1000);
        scaleTransition1.setAutoReverse(true);
        scaleTransition1.play();

        //Group
        Group rootBroward = new Group(imageView3, bbutton1, text4);
        Group rootMain = new Group(imageView1, button3, button4, text2, text3);
        Group rootOrange = new Group(imageView2, bbutton2, text1, choiceBox1);

        //Node Style
        button3.setStyle("-fx-background-color: beige; -fx-text-fill: darkslateblue; -fx-font: normal bold 14px 'bowlby one sc'; -fx-border-width: 2; -fx-border-color: black;");
        button4.setStyle("-fx-background-color: beige; -fx-text-fill: darkslateblue; -fx-font: normal bold 14px 'bowlby one sc'; -fx-border-width: 2; -fx-border-color: black;");
        bbutton1.setStyle("-fx-background-color: beige; -fx-text-fill: darkslateblue; -fx-font: normal bold 20px 'bowlby one sc'; -fx-border-width: 2; -fx-border-color: black;");
        bbutton2.setStyle("-fx-background-color: beige; -fx-text-fill: darkslateblue; -fx-font: normal bold 20px 'bowlby one sc'; -fx-border-width: 2; -fx-border-color: black;");

        //Scenes
        Scene sceneOrange = new Scene(rootOrange, sceneOrangeResX, sceneOrangeResY);
        Scene sceneMain = new Scene(rootMain, sceneMainResX, sceneMainResY);
        Scene sceneBroward = new Scene(rootBroward, sceneBrowardResX, sceneBrowardResY);

        //Resolution Change
        sceneOrangeResX = sceneOrange.getWidth();
        sceneOrangeResY = sceneOrange.getHeight();

        sceneMainResX = sceneMain.getWidth();
        sceneMainResY = sceneMain.getHeight();

        sceneBrowardResX = sceneBroward.getWidth();
        sceneBrowardResY = sceneBroward.getHeight();

        //EventHandlers

            //BUTTON 3
        javafx.event.EventHandler<javafx.scene.input.MouseEvent> eventHandlerButton3 = 
            new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
                @Override
                public void handle(javafx.scene.input.MouseEvent e) {
                    primaryStage.setScene(sceneOrange);
                    primaryStage.show();
                }
            };

        button3.addEventFilter(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandlerButton3);

        javafx.event.EventHandler<javafx.scene.input.MouseEvent> eventHandlerButton3B = 
            new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
                @Override
                public void handle(javafx.scene.input.MouseEvent e) {
                    button3.setStyle("-fx-background-color: lightblue; -fx-text-fill: darkslateblue; -fx-font: normal bold 14px 'bowlby one sc'; -fx-border-width: 2; -fx-border-color: black;");
                }
            };

        button3.addEventFilter(javafx.scene.input.MouseEvent.MOUSE_ENTERED, eventHandlerButton3B);

        javafx.event.EventHandler<javafx.scene.input.MouseEvent> eventHandlerButton3C = 
        new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent e) {
                button3.setStyle("-fx-background-color: beige; -fx-text-fill: darkslateblue; -fx-font: normal bold 14px 'bowlby one sc'; -fx-border-width: 2; -fx-border-color: black;");
            }
        };

        button3.addEventFilter(javafx.scene.input.MouseEvent.MOUSE_EXITED, eventHandlerButton3C);
        
            //BUTTON 4
        javafx.event.EventHandler<javafx.scene.input.MouseEvent> eventHandlerButton4 = 
            new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
                @Override
                public void handle(javafx.scene.input.MouseEvent e) {
                    primaryStage.setScene(sceneBroward);
                    primaryStage.show();
                }
            };

        button4.addEventFilter(javafx.scene.input.MouseEvent.MOUSE_CLICKED, eventHandlerButton4);

        javafx.event.EventHandler<javafx.scene.input.MouseEvent> eventHandlerButton4B = 
            new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
                @Override
                public void handle(javafx.scene.input.MouseEvent e) {
                    button4.setStyle("-fx-background-color: lightblue; -fx-text-fill: darkslateblue; -fx-font: normal bold 14px 'bowlby one sc'; -fx-border-width: 2; -fx-border-color: black;");
                }
            };

        button4.addEventFilter(javafx.scene.input.MouseEvent.MOUSE_ENTERED, eventHandlerButton4B);

        javafx.event.EventHandler<javafx.scene.input.MouseEvent> eventHandlerButton4C = 
        new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
            @Override
            public void handle(javafx.scene.input.MouseEvent e) {
                button4.setStyle("-fx-background-color: beige; -fx-text-fill: darkslateblue; -fx-font: normal bold 14px 'bowlby one sc'; -fx-border-width: 2; -fx-border-color: black;");
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