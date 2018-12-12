package com.cezhudzik.window;

import javax.swing.*;
import java.awt.*;

public class Window {


    public Window (int w, int h, String title, Game game)
    {
        game.setPreferredSize(new Dimension(w,h));
        game.setMaximumSize(new Dimension(1000,1200));
        game.setMinimumSize(new Dimension(400,600));

        JFrame frame = new JFrame(title);
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);



    }




}
