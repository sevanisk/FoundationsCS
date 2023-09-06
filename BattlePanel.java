import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class BattlePanel extends JPanel
{
   private PlayerChar player;
   private Opponent foe;
   private Graphics myBuffer;
   private BufferedImage myImage;
   JPanel hpnorth,playerpanel, foepanel, southpanel;
   JLabel subfoe, subplayer, battletext, battletext2;
   JButton attack1, attack2, attack3;
   String playername;
   public BattlePanel(String play)
   {
      playername = play;
      player = new PlayerChar(play, 380);
      foe = new Opponent(380);
   
      myImage = new BufferedImage(1500, 1000, BufferedImage.TYPE_INT_RGB);
      myBuffer = myImage.getGraphics();
      setLayout(new BorderLayout());
      hpnorth = new JPanel();
      add(hpnorth, BorderLayout.NORTH);
      drawHPBars();
      
      southpanel = new JPanel();
      add(southpanel, BorderLayout.SOUTH);
      
      foepanel = new JPanel();
      southpanel.add(foepanel, BorderLayout.WEST);     
     
      playerpanel = new JPanel();
      southpanel.add(playerpanel, BorderLayout.EAST);
      displaySouthPanel();
     
      ImageIcon x = new ImageIcon(play + ".png");
      //myBuffer.drawImage(x.getImage(),1200, 300, 125 ,225,null);
      ImageIcon y = new ImageIcon("TJ Math Tests.png");
   
      //myBuffer.drawImage(y.getImage(), 300, 300, 125 ,225,null);
      myBuffer.setColor(Color.WHITE);
      subfoe = new JLabel(y);
      add(subfoe, BorderLayout.WEST);
      subplayer = new JLabel(x);
      add(subplayer, BorderLayout.EAST);
   
    
   //Use border Layout with HP panels in the north
   //blank in the Center
   //player in the east
   //foe in the west
   //and 2 subpanels side by side in the south
   
   }
   


   public void paintComponent(Graphics g)
   {
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }
   private void drawHPBars()
   {
      myBuffer.setColor(new Color(127, 91, 66));
      myBuffer.fillRect(50, 50, 400, 100);
      myBuffer.fillRect(1050, 50, 400, 100);
      myBuffer.setColor(Color.RED);
      myBuffer.fillRect(60, 60, 380, 80);
      myBuffer.fillRect(1060, 60, 380, 80);
      myBuffer.setColor(Color.WHITE);
      myBuffer.setFont(new Font("Serif", Font.BOLD, 100));
      myBuffer.drawString("HP", 700, 150);
   }
   public void displaySouthPanel()
   {
      attack1 = new JButton(""+(player.getAttack1()).getName());
      attack2 = new JButton((player.getAttack2()).getName());
      attack3 = new JButton((player.getAttack3()).getName());
      attack1.addActionListener(new AttackListener(1,player.getAttack1()));
      attack2.addActionListener(new AttackListener(2,player.getAttack2()));
      attack3.addActionListener(new AttackListener(3,player.getAttack3()));
   
      playerpanel.add(attack1);
      playerpanel.add(attack2);
      playerpanel.add(attack3);
      battletext = new JLabel("");
      foepanel.add(battletext);
      battletext2 = new JLabel("");
      foepanel.add(battletext2);
      
   }
   private class AttackListener implements ActionListener
   {
      private int attacknum;
      private Attack attack;
      AttackListener(int at, Attack att)
      {
         attacknum = at;
         attack = att;
      }
      public void actionPerformed(ActionEvent e)
      {
         foe.setHP(attack.attack(foe.getHP()));
         updateOpponent(foe.getHP());
         foe.defeat(foe);
         foe.retaliate(player);
         updateCharacter(player.getHP());
      }
      
   
     public void updateCharacter(int hp)
     {
     battletext.setText("Your HP:" + hp);
   }
      public void updateOpponent(int hp)
      {
         myBuffer.setFont(new Font("Serif", Font.BOLD, 50));
         myBuffer.setColor(Color.WHITE);
      
         battletext2.setText("Opponent HP: " + hp);
      
         myBuffer.setColor(new Color(127, 91, 66));
         myBuffer.fillRect(50, 50, 400, 100);
      
         myBuffer.setColor(Color.RED);
         myBuffer.fillRect(60, 60, hp, 100);
      
      }
   
   }
}




