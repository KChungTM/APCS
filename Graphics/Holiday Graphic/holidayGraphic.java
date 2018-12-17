import java.util.Timer;
import javafx.scene.text.Font;
import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import java.util.TimerTask;
import java.util.Timer;


public class holidayGraphic extends Application implements EventHandler<ActionEvent>
{
    Stage window;
    Scene scene1, scene2;
    Label label1, label2;
    Button butt1, butt2;
    VBox layout1;
    StackPane layout2, layout3;

    public static void main(String[] args)
    {
            launch(args);
    }

    public void start(Stage primaryStage)
    {
        //Stage
        window = primaryStage;

        //Icon
        Image icon = new Image(getClass().getResourceAsStream("Icon.jpg"));

        //Button 1  (To enter second frame)
        butt1 = new Button("Click Here");
        butt1.setStyle("-fx-font: 22 impact; -fx-base: #f0f0f0;");
        butt1.setMinSize(300, 200);
        butt1.setOnAction(this);

        //Button 2 (To Quit)
        butt2 = new Button("Quit");
        butt2.setMinSize(50, 15);
        butt2.setStyle("-fx-font: 12 impact; -fx-base: #f0f0f0;");
        butt2.setOnAction(this);

        //Inside VBox (Media Player)
        
        layout2 = new StackPane();
        layout2.getChildren().add(butt1);
        layout2.setAlignment(Pos.TOP_CENTER);
        //scene2 = new Scene(layout2, 400,300);

        //Scrolling Name
        layout3 = new StackPane();
        layout3.setAlignment(Pos.CENTER);

        //VBox
        layout1 = new VBox(20);
        layout1.getChildren().add(butt1);
        layout1.setAlignment(Pos.CENTER);
        scene1 = new Scene(layout1,510,500);


        window.setScene(scene1);
        window.setTitle("Season's Greetings");
        window.getIcons().add(icon);
        window.centerOnScreen();
        window.show();
        
    }

    @Override                               //overrides handle() from super (Event Handler)
    public void handle(ActionEvent event)
    {
        if (event.getSource() == butt1)
        {
            //Top Label and Removes Click
            layout1.getChildren().remove(butt1);
            label1 = new Label("HaPpY hOlLaNdAiSe");
            label1.setFont(Font.font("Impact", 20));
            layout1.getChildren().add(label1);

            //Bottom Label
            label2 = new Label("kEnNeDy ChUnG");
            label2.setFont(Font.font("Impact", 20));
            layout3.getChildren().add(label2);

            MediaPlayer player = new MediaPlayer( new Media(getClass().getResource("Roblox.mp4").toExternalForm()));
            MediaView mediaView = new MediaView(player);

            layout2.getChildren().add(mediaView);
            
            /*
            //Initializes Santa Hat
            Polygon triangle = new Polygon();
            triangle.getPoints().addAll(new Double[]{
                0.0, -10.0,
                -50.0, 40.0,
                50.0, 40.0 });
            triangle.setFill(Color.CRIMSON);

            Circle circle = new Circle(10,10,8);
            circle.setFill(Color.WHITE);

            //Adds the shapes
            layout2.getChildren().addAll(triangle, circle);
            */
            
            //Adds the Media Player to the VBox
            layout1.getChildren().add(layout2);
            //Adds bottom label
            layout1.getChildren().add(layout3);
            //Adds quit button
            layout1.getChildren().add(butt2);

            player.setCycleCount(MediaPlayer.INDEFINITE);
            player.play();

            Timer timer1 = new Timer();
            TimerTask tt = new TimerTask()
            {
                int red = 255;
                int green = 255;

                public void run()
                {
                    if (red > 125)
                        label1.setTextFill(Color.rgb(red,0,0));
                    else
                        red = 255;

                    if (green > 125)
                        label2.setTextFill(Color.rgb(0,green,0));
                    else
                        green = 255;

                    red--;
                    green--;
                
                }
            };
            timer1.schedule(tt, 1, 50);
        }
        if (event.getSource() == butt2)
        {
            Platform.exit();
            System.exit(0);
        }
    }
}   

/*
Examples:
==============================================
Layout 1:
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(butt2);
        scene2 = new Scene(layout2, 600,300);
=============================================
Layout 2  - Children are laid out in vertical column
        //int= pixel space between
        VBox layout1 = new VBox(20); 
        layout1.getChildren().addAll(label, butt1);





butt.setOnAction(this); can also be handled by adding code at the end.
                        this is an anon inner class. That way you don't implement
                        EventHandler. Anonymous inner classes don't have to check
                        source and makes code cleaner.

*/
