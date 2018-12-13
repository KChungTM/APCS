import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.geometry.*;

public class Popup
{
    static Label label;
    public static void display(String title)
    {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL); //blocks interaction with other screens
        window.setMinWidth(250);
        window.setMinHeight(150);

        label = new Label("Getting ready in...");

        StackPane layout = new StackPane();
        layout.getChildren().add(label);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);

        
        /*
        new Thread(new Runnable() {
            @Override public void run() {
                for (int i = 3; i > 0; i--)
                {
                    try{
                        Thread.sleep(3000);
                        label.setText(i+"");
                    }
                    catch(Throwable e){}
                }
            }
        }).start();
        */

        window.setScene(scene);
        window.centerOnScreen();
        window.show();
        
        Task<Void> delay = new Task<Void>()
        {
            @Override
            protected Void call() throws Exception
            {
                for (int i = 3; i>0; i--)
                {
                    try
                    {
                        System.out.print("cool");
                        Thread.sleep(1500);
                        label.setText(i+"");
                    }
                    catch (InterruptedException e) {}
                }
                return null;
            }
        };

        new Thread(delay).start();

        //window.showAndWait();
        //displays window and b4 you return, this needs to be closed
        //often seen in conjunction with "Modality.APPLICATION_MODAL"

        

        
    }
}