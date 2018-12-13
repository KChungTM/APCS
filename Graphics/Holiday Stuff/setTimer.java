import java.util.Timer;
import java.util.TimerTask;

import javafx.scene.control.Label;

public class setTimer
{
    Timer timer;
    TimerTask tt;

    public setTimer(Label label)
    {
        timer = new Timer();
        tt = new TimerTask()
        {
            @Override
            public void run()
            {
                int countdown = 3;
                label.setText(countdown+"");
                countdown--;

                if (countdown < 0)
                    timer.cancel();

            }
        };
        timer.schedule(tt, 1, 1500);
    }
}