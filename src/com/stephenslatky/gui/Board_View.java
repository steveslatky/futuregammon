package com.stephenslatky.gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Board_View {

    public Board_View() throws IOException {
        view_init();
    }

    private void view_init() throws IOException {
        // The Frame
        JFrame f = new JFrame("FutureGammon");

        // Layout and Display
        Container content = f.getContentPane();
        content.setLayout(new BorderLayout(0,0));
        JPanel test = new JPanel();


        BufferedImage myPicture = ImageIO.read(new File( "images/board_blue.jpg"));
        JLabel picLabel = new JLabel(new ImageIcon(myPicture));
        test.add(picLabel);

        content.add(test);
        show_view(f);

    }

    private void show_view(Frame f){
        // Set the frame to be more user friendly.
        f.setSize(700,500);
        f.setMinimumSize(new Dimension(570, 150));
        f.setVisible(true);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Sets Frame to center of screen.
        f.setLocationRelativeTo(null);
    }

}