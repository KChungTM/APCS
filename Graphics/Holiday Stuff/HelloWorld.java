import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class HelloWorld extends Application implements EventHandler<ActionEvent>
{
    Stage window;
    Scene scene1, scene2;
    Label label;
    Button butt1, butt2;
    StackPane layout1;

    public static void main(String[] args)
    {
        Application.launch(args);
    }

    public void start(Stage primaryStage)
    {
        //Stage
        window = primaryStage;

        //Button 1
        butt1 = new Button("Click me");
        butt1.setOnAction(this);

        //Label
        label = new Label("Cool label bro");
        
        layout1 = new StackPane();
        layout1.getChildren().add(butt1);
        scene1 = new Scene(layout1, 500,350);
        

        window.setScene(scene1);
        window.setTitle("Ebic Dance");
        window.centerOnScreen();
        window.show();
        
    }

    @Override                               //overrides handle() from super (Event Handler)
    public void handle(ActionEvent event)
    {
        if (event.getSource() == butt1)
        {
            MediaPlayer player = new MediaPlayer( new Media(getClass().getResource("Roblox.mp4").toExternalForm()));
            MediaView mediaView = new MediaView(player);

            layout1.getChildren().add(mediaView);
            Popup.display("Ready?");

            player.play();   
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