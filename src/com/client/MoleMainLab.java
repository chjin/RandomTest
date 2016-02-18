package com.client;

import javax.smartcardio.CardChannel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by sist on 2016-02-11.
 */
public class MoleMainLab extends JFrame implements ActionListener, Runnable, MouseListener{
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

        //Add Listener 2.18
        moleGameView.addMouseListener(this);
        moleGameView.timer.addActionListener(this);



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
            moleGameView.thread=new Thread(moleGameView);
            moleGameView.thread.start();
            moleGameView.timer.start();     //시간 제한 적용 구현중....
            moleGamePlay.jButtonStn.setEnabled(false);
            moleGamePlay.jButtonPause.setEnabled(true);
            moleGamePlay.jButtonExit.setEnabled(false);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        //게임뷰moleGameView에서 두더지 hit시에.
        System.out.println("mole hit!");

        int x,y;
        x=e.getX();
        y=e.getY();

        //ground이미지 내에서 마우스 이벤트 발생하는 경우임
        if(y>=moleGameView.top && y<=(moleGameView.height+moleGameView.top)){
            if(x>=moleGameView.left && x<=(moleGameView.left+moleGameView.width)){
                //mole1.png 클릭시임.
                if(moleGameView.moleImage==moleGameView.molesImage[0]){
                    //mole1.png가 mole3.png로 바뀜.
                    moleGameView.moleImage=moleGameView.molesImage[2];
                    moleGameView.repaint();

                    //mole3.png 클릭시임.`
                } else if(moleGameView.moleImage==moleGameView.molesImage[1]){
                    //mole2.png가 mole4.png로 바뀜.
                    moleGameView.moleImage=moleGameView.molesImage[3];
                    moleGameView.repaint();
                }


            }
        }





    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void run() {

    }
}

























