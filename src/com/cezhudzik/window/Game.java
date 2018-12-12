package com.cezhudzik.window;


import java.awt.Canvas;



public class Game extends Canvas implements Runnable{

private static final  long serialVersionUID = -11111111111L;


    private boolean running = false;
    private Thread thread;

    //START IS PROPABLY RUN AUTOMATICLY ONCE
    public synchronized void start()
    {
        if(running)
        {
            return;
        }

        running = true;
        thread = new Thread(this);
        thread.start();

    }


    @Override
    public void run() {



    }


    public static void main(String[] args) {

        Game game = new Game();
        game.start();
        new Window(800,600,"Skoki",game);

    }








}
