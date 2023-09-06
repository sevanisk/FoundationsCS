import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
public class Opponent extends Character
{

public Opponent(int ohp)
{
setImage(randomImage());
setOriginalHP(ohp);
setHP(ohp);
}
public void retaliate(PlayerChar player)
{
player.setHP(player.getHP()-(int)(Math.random()*15+1));
}

public void defeat(Character c)
      {
         if(c.getHP() <=0)
         {
         JFrame frame = new JFrame("Final");
frame.setSize(1500,1000);


frame.setLocation(0,0);


frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


frame.setContentPane(new EndGame());


frame.setVisible(true);
}
}
private ImageIcon randomImage()
{
int c = (int)(Math.random()*7+1);
switch(c)
{
case 1: return new ImageIcon("karel.png");
case 2: return new ImageIcon("TJ Math Tests.png");
//case 8: return new ImageIcon("doggo.png");
case 4: return new ImageIcon("Fire1.png");
case 5: return new ImageIcon("snek.png");
case 6: return new ImageIcon("The All Seeing Eye.png");
case 7: return new ImageIcon("The fish.png");
case 3: return new ImageIcon("turtle.png");
default: return new ImageIcon("TJ Math Tests.png");
}

}

}


