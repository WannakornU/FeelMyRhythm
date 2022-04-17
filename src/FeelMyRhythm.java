/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rada
 */
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.Cursor;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import java.awt.Color;

public class FeelMyRhythm extends JFrame{
    
    private Image screenImage;
    private Graphics screenGraphic;
    
    private ImageIcon startButtonBasicImage = new ImageIcon(Main.class.getResource("/images/startButtonBasic.png"));
    private ImageIcon startButtonEnteredImage = new ImageIcon(Main.class.getResource("/images/startButtonEntered.png"));
    private Image introBackground = new ImageIcon(Main.class.getResource("/images/introBackground.jpg")).getImage();;
    
    private int mouseX, mouseY;
    
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
        //setLayout(null);
        
<<<<<<< Updated upstream
        introBackground = new ImageIcon(Main.class.getResource("/images/introBackground.jpg")).getImage();
=======
        startButton.setBounds(640, 300, 197, 101);
        startButton.setBorderPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.setFocusPainted(false);
        startButton.addMouseListener(new MouseAdapter() {
            
            @Override
            public void mouseEntered(MouseEvent e) {
                startButton.setIcon(startButtonEnteredImage);
                startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
                Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3", false);
                buttonEnteredMusic.start();
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                startButton.setIcon(startButtonBasicImage);
                startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
            }
        
            public void MousePressed(MouseEvent e) {
                Music buttonEnteredMusic = new Music("buttonEnteredMusic.mp3", false);
                buttonEnteredMusic.start();             
            }
        });
        add(startButton);
            
        Music introMusic = new Music("introMusic.mp3", true);
        introMusic.start();
>>>>>>> Stashed changes
    }

    public void paint(Graphics g) {
        screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        screenGraphic = screenImage.getGraphics();
        screenDraw(screenGraphic);
        g.drawImage(screenImage, 0, 0, null);
    }
    
    public void screenDraw(Graphics g) {
        g.drawImage(introBackground, 0, 0, null);
        this.repaint();
    }

}
