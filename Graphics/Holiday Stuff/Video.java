import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.media.MediaPlayer;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.File;
import java.net.URL;

public class Video extends Application
{
    public static void main(String[] args)
    {
        String Dir = System.getProperty("user.dir");
        System.out.println(System.getProperty("user.dir"));
        start(Dir);
    }

    public static void start(String Dir) 
    {
        try{
        URL mediaURL = new URL("https://www.youtube.com/watch?v=x2Ty9T59NoI");
        Media media = new Media(mediaURL.toString());
        MediaPlayer player = new  MediaPlayer(media);
        player.setAutoPlay(true);

        MediaView mediaView = new MediaView(player);
        mediaView.setFitWidth(400);
        mediaView.setFitHeight(300);       
        mediaView.setSmooth(true);

        VBox root = new VBox(5,mediaView);
        root.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        }
        catch(Throwable e){};
    }
}