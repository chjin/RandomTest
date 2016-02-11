package com.client;

import javax.smartcardio.CardChannel;
import javax.swing.*;
import java.awt.*;

/**
 * Created by sist on 2016-02-11.
 */
public class MoleMainLab extends JFrame {
    CardLayout cardLayout=new CardLayout();
    MoleGamePlay moleGamePlay=new MoleGamePlay();

    public MoleMainLab(){
        this.setLayout(cardLayout);
        this.add("플레이",moleGamePlay);

        this.setSize(850,650);
        this.setLocation(200,40);
        this.setVisible(true);
        this.setResizable(false);

        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }


    public static void main(String[] args){
        new MoleMainLab();
    }
}

























