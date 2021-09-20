package com.gameoflife;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main extends JFrame{
    int length = 50;
    JLabel[][] cell = new JLabel[length][length];
    boolean cellMap[][] = new boolean[length][length];
    Random place = new Random();

    public Main() {
        super("Game of Life - Ardi");

        setSize(500, 500);
        setLayout(new GridLayout(length,length));

        for(int row = 0; row < length; row++){
            for(int col = 0; col < length; col++){
                cell[row][col] = new JLabel();
                cell[row][col].setOpaque(true);
                if(place.nextInt(100)<30){
                    cell[row][col].setBackground(Color.BLACK);
                } else {
                    cell[row][col].setBackground(Color.WHITE);
                }
                add(cell[row][col]);
            }
        }

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Timer animation = new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        animation.start();
    }

    public static void main(String[] args) {
        new Main();
    }
}
