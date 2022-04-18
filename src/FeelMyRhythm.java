/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rada
 */
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class FeelMyRhythm extends JFrame{ 
    
    private Image screenImage;
    private Graphics screenGraphic;
    
    private ImageIcon startButtonBasicImage = new ImageIcon(Main.class.getResource("/images/startButtonBasic.png"));
    private ImageIcon startButtonEnteredImage = new ImageIcon(Main.class.getResource("/images/startButtonEntered.png"));
    
    private Image introBackground = new ImageIcon(Main.class.getResource("/images/introBackground.jpg")).getImage();
    
    
    private JButton startButton = new JButton(startButtonBasicImage);

    public FeelMyRhythm() {
        //setUndecorated(true);
        setTitle("FEEL MY RHYTHM");
        setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        //setBackground(new Color(0, 0, 0, 0));
        setLayout(null);
       
        startButton.setBounds(550, 270, 197, 100);
        startButton.setBorderPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.setFocusPainted(false);
        startButton.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                startButton.setIcon(startButtonEnteredImage);
            }
            @Override
            public void mouseExited(MouseEvent e){
                startButton.setIcon(startButtonBasicImage);
            }
            @Override
            public void mousePressed(MouseEvent e){
                Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3",false);
                buttonEnteredMusic.start();
            }
        });

        Music introMusic = new Music("introMusic.mp3",true);
        introMusic.start();

        JLabel background = new JLabel(new ImageIcon(introBackground));
        background.setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        add(background);
        background.setLayout(new FlowLayout());
        background.add(startButton);

    }



}
