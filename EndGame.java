import javax.swing.*;

import java.awt.*;

import java.awt.image.*;

import java.awt.event.*;

public class EndGame extends JPanel

{

   private Graphics myBuffer;
   private BufferedImage myImage;

   public EndGame()
   
   {
      myImage = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_RGB);
      myBuffer = myImage.getGraphics();
      myBuffer.setColor(Color.BLACK);
      myBuffer.fillRect(0, 0, 1000, 1000);
      myBuffer.setFont(new Font("Serif", Font.BOLD, 50));
      myBuffer.drawString("HIT ENTER TO START", 225, 525);
      myBuffer.setColor(Color.MAGENTA.darker());
      myBuffer.drawString("HIT ENTER TO START", 223, 528);
   
      /*myImage = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_RGB);
      myBuffer = myImage.getGraphics();
      myBuffer.setColor(Color.BLACK);
      myBuffer.fillRect(0,0, 1000, 1000);
      String s = "GAME OVER";
      int c1 = 0;
      int c2 = 0;
      int c3 = 0;
      for(int x = 0; x < s.length(); x++)
      {
    c1 = (int)(Math.random()*255);
            c2 = (int)(Math.random()*255);
            c3 = (int)(Math.random()*255);
            myBuffer.setColor(new Color(c1, c2, c3));
            System.out.print("" + s.charAt(x));
            }*/
   }
   public EndGame(String leaderboard)
   
   {
   
   
   }

   public void displayLeaderboard(String l)
   
   {
   
   
   }

   public void updateLeaderboard(String f)
   
   {
   
   
   }

   public void displayScore(int s)
   
   {
   
   
   }

}



