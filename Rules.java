package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame implements ActionListener {

    JButton b1 , b2;
    String username;

    Rules(String username){
        this.username = username ;
        setBounds(600,200,800,650);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel l1 = new JLabel("Welcome " + username + " to Quiz Application ");
        l1.setForeground(new Color(30,144,255));
        l1.setFont(new Font("Viner Hand ITC" , Font.BOLD,28));
        l1.setBounds(50,20,700,30);
        add(l1);

        JLabel l2 = new JLabel(" " );
        l2.setForeground(new Color(30,144,255));
        l2.setFont(new Font("Tahoma" , Font.PLAIN,16));
        l2.setBounds(20,90,600,250);
        l2.setText(
                "<html>" +
"1. 10 marks for correct answer and 5 negative marks for wrong answer." + "<br><br>" +
"2. If a team cannot answer the question, they can pass the question & then the question " + "<br><br>" +
"3. Answering time is only 30 seconds." + "<br><br>" +
"4. Team discussion is allowed." + "<br><br>" +
                        "</html>"

        );
        add(l2);

        b1 = new JButton("Back");
        b1.setBounds(250,500,100,30);
        b1.setBackground(new Color(30,144,255));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Start");
        b2.setBounds(400,500,100,30);
        b2.setBackground(new Color(30,144,255));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        add(b2);


        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1){
            this.setVisible(false);
            new WelcomeFrame().setVisible(true);
        }
        else if (ae.getSource() == b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
    }

    public static void main(String[] args){
        new Rules(" ");
    }
}
