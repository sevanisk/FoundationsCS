
import javax.swing.*;

import java.awt.*;

import java.awt.image.*;

import java.awt.event.*;
public abstract class Character

{

private String title;

private int hp, originalHP;

private int myX, myY;

private ImageIcon img;


public Character()

{

title = "character";

myX = 0;

myY = 0;

originalHP= 380;

hp = 380;

}


public Character(String name, int x, int y, int ohp, String one, String des1, String two, String des2, String thr, String des3)throws Exception

{

title = name;
originalHP = ohp;
myX = x;
myY = y;
Attack a = new Attack(one , 100, des1);
Attack b = new Attack(two, 50, des2);
Attack c = new Attack (thr, 30, des3); 

/*attacks = new Attack[3];

for(int k= 0; k<3; k++)

attacks[k] = new Attack(name);

//special = new Attack(name);*/

}


public String getName()

{

return title;

}

/*public Attack getAttack(Attack letter)

{

return Attack letter;


}*/

public int getHP()

{
//checkHP();


return hp;

}


public void setHP(int x)

{

hp = x;
System.out.println("" + hp);
}

public void setOriginalHP(int o)
{
originalHP = o;
}

public void setX(int x)

{

myX = x;

}


public void setY(int y)

{

myY = y;

}

public ImageIcon getImage()

{

return img;

}

public void setImage(ImageIcon image)

{

img = image;

}

//public abstract void checkHP();

//public abstract void calcAttackDamage();


}




