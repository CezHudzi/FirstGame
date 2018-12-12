package com.cezhudzik.window;


import java.awt.Canvas;



public class Game extends Canvas implements Runnable{

private static final  long serialVersionUID = -11111111111L;



    @Override
    public void run() {

    }


    public static void main(String[] args) {
        new Window(800,600,"Skoki",new Game());
    }










}
