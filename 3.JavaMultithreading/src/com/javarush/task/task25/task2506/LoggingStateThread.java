package com.javarush.task.task25.task2506;

/**
 * Created by User on 25.08.2020.
 */
public class LoggingStateThread extends Thread {
    private Thread target;


    public LoggingStateThread(Thread target) {
        this.target = target;
    }

    @Override
    public void run() {
        State state = target.getState();
        System.out.println(state);
        while(state != State.TERMINATED)
        {
            if (state != target.getState())
            {
                state = target.getState();
                System.out.println(state);
            }
        }
    }

}
