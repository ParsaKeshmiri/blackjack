package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class blackJackGUI {

    /* GUI implemented with swing */
    private JLabel balance;
    private JFrame frame;
    private JPanel panel;
    //private JButton playButton;
    private JButton stand;
    private JButton hit;
    private JTextField textField = new JTextField(10); //will store user input of bet amount


    /* card deck */
    int CARDS_IN_DECK = 13;
    int[] deck = new int[CARDS_IN_DECK];
    String[] value = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};


    /* player's hand */
    private int currentHand = 0; //start with an empty hand before you are given any cards
    private int dealtCard = cardShuffle();


    public static void main(String[] args){

        new blackJackGUI();
    }

    public int cardShuffle(){  //TODO make sure this is non-static

        int randNum = (int)(Math.random() * CARDS_IN_DECK); //chooses a random spot in the array
        int returnedVal;

        switch (randNum){
            case 0:
                returnedVal = 11;  //Ace. This will be changed to a 1 if an 11 will cause a bust
                break;
            case 1:
                returnedVal = 2;
                break;
            case 2:
                returnedVal = 3;
                break;
            case 3:
                returnedVal = 4;
                break;
            case 4:
                returnedVal = 5;
                break;
            case 5:
                returnedVal = 6;
                break;
            case 6:
                returnedVal = 7;
                break;
            case 7:
                returnedVal = 8;
                break;
            case 8:
                returnedVal = 9;
                break;
            case 9:
                returnedVal = 10;
                break;
            case 10:
                returnedVal = 10; //Jack
                break;
            case 11:
                returnedVal = 10; //Queen
                break;
            case 12:
                returnedVal = 10; //King
                break;
            default:
                returnedVal = -1; //Error
        }
        return returnedVal;
    }

    public static String balanceOutput(){

        //TODO

        NumberFormat startingBalance = NumberFormat.getCurrencyInstance();
        String startingBalanceOutput = startingBalance.format(500);

        return startingBalanceOutput;

    }

    public blackJackGUI() {

        //Button actions

        hit = new JButton("Hit");
        hit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Checks to make sure player can indeed 'hit'
                if (currentHand >= 21){
                    //TODO
                }
            }
        });

        stand = new JButton("Stand");
        stand.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO Add code
            }
        });

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(360, 640,360,640));
        panel.setLayout(new GridLayout(0,1)); //change later if formatting is an issue
        balance = new JLabel("Current Balance: " + balanceOutput());
        panel.add(balance);
        panel.add(stand);
        panel.add(hit);


        frame = new JFrame();
        //SwingUtilities.updateComponentTreeUI(frame);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setLayout(new GridLayout());
        frame.setTitle("Blackjack");
        frame.pack();
        frame.setVisible(true);

    }

}
