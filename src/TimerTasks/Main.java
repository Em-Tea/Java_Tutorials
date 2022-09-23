package TimerTasks;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/*
A timer is a facility for threads to schedule tasks for fuuture execution in a background thread.

A TimerTask is a task that can be scheduled for a one-time or repeated execution Timer.
 */
public class Main {
    int x = 0;

    public static void main(String[] args) {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int counter = 10;
            @Override
            public void run() {
                if (counter > 0) {
                    System.out.println(counter + " seconds");
                    counter--;
                }
                else {
                    System.out.println("Happy New Year! Yahooooo");
                    timer.cancel();
                }
            }
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR,2022);
        date.set(Calendar.MONTH,Calendar.AUGUST);
        date.set(Calendar.DAY_OF_MONTH, 13);
        date.set(Calendar.HOUR,15);
        date.set(Calendar.MINUTE, 25);
        date.set(Calendar.SECOND,30);
        date.set(Calendar.MILLISECOND, 0);


        //timer.schedule(task, 1000);
        //timer.scheduleAtFixedRate(task, 0,1000);
        //timer.scheduleAtFixedRate(task, date.getTime(), 1000);

        System.out.println(date.getTime());
    }
}
