

import javax.swing.*;


import java.awt.*;


import java.awt.image.*;


import java.awt.event.*;


import java.io.*;


import java.util.*;


import javax.swing.JOptionPane;


import javax.swing.JFrame;




public class CharacterSelection extends JPanel

{



private Graphics myBuffer;


private BufferedImage myImage;



public CharacterSelection()



{

myImage = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_RGB);


myBuffer = myImage.getGraphics();



myBuffer.setColor(Color.BLACK);


myBuffer.fillRect(0, 0, 1000, 1000);



//setLayout(new GridLayout(1, 4, 5, 0));



Character[] options = new Character[4];


JButton select = new JButton("Select");

select.addActionListener(new SelectListener());

add(select);

ImageIcon doggo = new ImageIcon("doggo.png");
myBuffer.drawImage(doggo.getImage(),150, 100, 125 ,225,null);

ImageIcon turtle = new ImageIcon("turtle.png");
myBuffer.drawImage(turtle.getImage(),450, 100, 125 ,225,null);

ImageIcon fire1 = new ImageIcon("The Living Flame.png");
myBuffer.drawImage(fire1.getImage(),750, 100, 125 ,225,null);

ImageIcon snek = new ImageIcon("snek.png");
myBuffer.drawImage(snek.getImage(),150, 550, 125 ,225,null);

ImageIcon eye = new ImageIcon("The All Seeing Eye.png");
myBuffer.drawImage(eye.getImage(),450, 550, 125 ,225,null);

ImageIcon fish = new ImageIcon("The Fish.png");
myBuffer.drawImage(fish.getImage(),750, 550, 125 ,225,null);

myBuffer.setColor(Color.WHITE);
myBuffer.setFont(new Font("Serif", Font.BOLD, 30));
myBuffer.drawString("DOGGO", 175, 350);
myBuffer.drawString("TURTLE", 450, 350);
myBuffer.drawString("THE LIVING FLAME", 675, 350);
myBuffer.drawString("SNEK", 175, 800);
myBuffer.drawString("THE ALL SEEING EYE", 350, 800);
myBuffer.drawString("THE FISH", 750, 800);
myBuffer.setFont(new Font("Serif", Font.BOLD, 20));
myBuffer.drawString("FIRST LETTER OF EACH WORD IS UPPERCASE WHEN ENTERING CHARACTER NAME", 75, 950);
/*JPanel[] subs = new JPanel[4];



for(int k = 0; k<options.length; k++)



{



options[k] = new PlayerChar();



subs[k] = new JPanel();



displayCharacter(options[k], subs[k], k);



add(subs[k]);



}*/






}


public void paintComponent(Graphics g)

{

g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);

}


public void displayCharacter(Character c, JPanel sub, int num)



{



sub.setLayout(new GridLayout(5, 1, 0, 10));//row, column, horizontal gap, vertical gap



JLabel image = new JLabel(c.getImage());



sub.add(image);



/*JLabel[] attacks = new JLabel[3];



attacks[0] = new JLabel("" + c.getOneAttack());


attacks[1] = new JLabel("" + c.getTwoAttack());


attacks[2] = new JLabel("" + c.getThreeAttack());



for(int k = 0; k < 3; k++)


sub.add(attacks[k]);*/





}




private class SelectListener implements ActionListener
{
private String charactername;


public void actionPerformed(ActionEvent e)
{

String name = JOptionPane.showInputDialog("Which Character?");

charactername = name;

System.out.println("" + charactername);

JFrame frame = new JFrame("FINAL");

try
{
System.setOut(new PrintStream(new FileOutputStream("characters.txt")));
System.out.println("" + charactername);
}
catch(FileNotFoundException g)
{
System.exit(0);
}

frame.setSize(1500,1000);


frame.setLocation(0,0);


frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


frame.setContentPane(new BattlePanel(charactername));


frame.setVisible(true);



}



}




}













