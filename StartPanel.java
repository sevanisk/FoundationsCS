

import javax.swing.*;


import java.awt.*;


import java.awt.image.*;


import java.awt.event.*;

import java.io.*;

import java.util.*;

import javax.swing.JOptionPane;

import javax.swing.JFrame;


public class StartPanel extends JPanel


{


   private Graphics myBuffer;

   private BufferedImage myImage;

   JButton button;
   JLabel label1, label2, label3, label4;

   public StartPanel()

   

   {

      setLayout(new FlowLayout());

      button = new JButton("Click to Start");

      button.addActionListener(new DisplayListener());

      add(button);
      
      myImage = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_RGB);

      myBuffer = myImage.getGraphics();

      myBuffer.setColor(Color.BLACK);

      myBuffer.fillRect(0, 0, 1000, 1000);

      myBuffer.setFont(new Font("Serif", Font.BOLD, 50));
      
      myBuffer.setColor(Color.ORANGE);

      myBuffer.drawString("HIT BUTTON TO START", 224, 525);

      myBuffer.setColor(Color.MAGENTA.darker());

      myBuffer.drawString("HIT BUTTON TO START", 223, 528);

   

   //circles

      int z = 0;

      int c1 = 0;

      int c2 = 0;

      int c3 = 0;

      myBuffer.setColor(Color.WHITE);

      for(int x = 50; x < 1000; x +=50)

         for(int y = 50; y < 1000; y +=100)

         {

            c1 = (int)(Math.random()*255);

            c2 = (int)(Math.random()*255);

            c3 = (int)(Math.random()*255);

            myBuffer.setColor(new Color(c1, c2, c3));

            z = (int)(Math.random()* 15 + 5);

            myBuffer.fillOval(x, y, z, z);

         }

   }

   public void paintComponent(Graphics g)

   {

      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);

   }


   private class DisplayListener implements ActionListener

   {

      public void actionPerformed(ActionEvent e)

      {

         JFrame frame = new JFrame("FINAL");

         frame.setSize(1900,1000);

         frame.setLocation(0,0);

         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         frame.setContentPane(new CharacterSelection());

         frame.setVisible(true);

      

      }

   }

}





