package com.client;

import javax.swing.*;
import java.awt.*;

/**
 * Created by sist on 2016-02-11.
 */
public class NotiBar extends JPanel {
    JProgressBar jProgressBar;
    public NotiBar(){
        jProgressBar=new JProgressBar();
        jProgressBar.setMinimum(0);
        jProgressBar.setMaximum(2500);
        jProgressBar.setForeground(Color.green);
        jProgressBar.setBackground(Color.lightGray);
        jProgressBar.setValue(2500);
        jProgressBar.setString("Time");
        jProgressBar.setBorderPainted(false);

        this.setLayout(null);
        jProgressBar.setBounds(0,0,480,30);
        this.add(jProgressBar);
        this.setSize(480,30);
    }
}
























