package com.client;

import javax.smartcardio.CardChannel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by sist on 2016-02-11.
 */
public class MoleMainLab extends JFrame implements ActionListener{
    CardLayout cardLayout=new CardLayout();
    MoleGamePlay moleGamePlay=new MoleGamePlay();
    MoleGameView moleGameView=moleGamePlay.moleGameView;



    public MoleMainLab(){
        this.setLayout(cardLayout);
        this.add("플레이",moleGamePlay);

        //리스너 추가
        moleGamePlay.jButtonStn.addActionListener(this);
        moleGamePlay.jButtonPause.addActionListener(this);
        moleGamePlay.jButtonExit.addActionListener(this);


        this.setSize(850,650);
        this.setLocation(200,40);
        this.setVisible(true);
        this.setResizable(false);

        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }


    public static void main(String[] args){
        new MoleMainLab();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //MoleGameView의 스타트 버튼 이벤트처리
        if(e.getSource()==moleGamePlay.jButtonStn){

        }
    }
}

























