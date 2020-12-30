package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class blackJackGUI implements ActionListener {

    /*GUI implemented with swing*/

    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    //private JButton playButton;
    private JButton stand;
    private JButton hit;
    private JTextField textField = new JTextField(10); //will store user input of bet amount


    public static void main(String[] args){

        new blackJackGUI();
    }

    public static String balanceOutput(){

        NumberFormat startingBalance = NumberFormat.getCurrencyInstance();
        String startingBalanceOutput = startingBalance.format(500);

        return startingBalanceOutput;

    }

    public blackJackGUI() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1280,720); //set default dimension to 720p
        frame = new JFrame();
        //frame.getContentPane().add(playButton);
        frame.setVisible(true);
        frame.add(panel, BorderLayout.CENTER);
        frame.setTitle("Black Jack");
        frame.pack();

        hit = new JButton("Hit");
        hit.addActionListener(this);

        stand = new JButton("Stand");
        stand.addActionListener(this);

        label = new JLabel("Play");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(360, 640,360,640));
        panel.setLayout(null); //change later if formatting is an issue
        //panel.add(playButton);
        panel.add(label);
        panel.add(stand);
        panel.add(hit);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
