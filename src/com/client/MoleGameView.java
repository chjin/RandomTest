package com.client;

import javax.swing.*;
import javax.swing.Timer;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.*;

/**
 * Created by sist on 2016-02-11.
 */
public class MoleGameView extends JPanel implements Runnable, MouseMotionListener{
    NotiBar notiBar=new NotiBar();
    Rectangle[] rectangles=new Rectangle[9];
    Image[] images=new Image[5];
    Image[] images2=new Image[11];
    Image image1,image2,image3,image4;

    String[] stringsImage={
        ".\\img\\mole1.png",".\\img\\mole2.png",
        ".\\img\\mole3.png",".\\img\\mole4.png",
        ""
    };

    String[] stringsNumber1={
        ".\\img\\0.png",".\\img\\1.png",
        ".\\img\\2.png",".\\img\\3.png",
        ".\\img\\4.png",".\\img\\5.png",
        ".\\img\\6.png",".\\img\\7.png",
        ".\\img\\8.png",".\\img\\9.png",
        ".\\img\\10.png"
    };

    int left,top,width,height;
    int stringsNumber2=0;
    int count=0;
    int memberTimer=600;

    JLabel jLabel;
    int hammerX,hammerY;

    Timer timer=new Timer(10,null);

    public MoleGameView(){
        this.addMouseMotionListener(this);

        image2=Toolkit.getDefaultToolkit().getImage(".\\img\\ground.png");
        image3=Toolkit.getDefaultToolkit().getImage(".\\img\\starhammericon.png");

        for(int i=0;i<8;i++){
            rectangles[i]=new Rectangle();
        }

        //두더지 위치 설정.
        rectangles[0].setRect(186,21,266,101);
        rectangles[1].setRect(406,4,486,84);
        rectangles[2].setRect(66,108,146,188);
        rectangles[3].setRect(335,94,415,174);
        rectangles[4].setRect(174,172,254,252);
        rectangles[5].setRect(454,177,534,257);
        rectangles[6].setRect(60,250,140,330);
        rectangles[7].setRect(320,255,400,335);

        jLabel=new JLabel();
        jLabel.setBounds(20,20,100,50);
        jLabel.setText(0+"");
        this.add(jLabel);

        for(int i=0;i<5;i++){
            images[i]=Toolkit.getDefaultToolkit().getImage(stringsImage[i]);
        }

        for(int j=0;j<11;j++){
            images2[j]=Toolkit.getDefaultToolkit().getImage(stringsNumber1[j]);
        }





    }



    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void run() {

    }
}







































