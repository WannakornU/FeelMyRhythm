/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rada
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FeelMyRhythm extends JFrame{ 
    
    private Image screenImage;
    private Graphics screenGraphic;
    
    private Image introBackground = new ImageIcon(Main.class.getResource("/images/introBackground.jpg")).getImage();
    private JButton startButton = new JButton(new ImageIcon(Main.class.getResource("/images/startButtonBasic.png")));
    
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
       
        
        startButton.setBounds(50, 50, 30, 30);
        add(startButton);
        
        
        Music introMusic = new Music("introMusic.mp3",true);
        introMusic.start();
    }

    public void paint(Graphics g) {
        screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        screenGraphic = screenImage.getGraphics();
        screenDraw(screenGraphic);
        g.drawImage(screenImage, 0, 0, null);
    }
    
    public void screenDraw(Graphics g) {
        g.drawImage(introBackground, 0, 0, null);
        paintComponents(g);
        this.repaint();
    }

}
