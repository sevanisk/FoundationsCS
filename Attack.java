import java.util.*;


import java.io.*;


public class Attack


{


private int damage, type;


private String name;


private String description;


public Attack(String nam, int d, String des)


{


name = nam;

damage = d;

description = des;


}

public Attack(String nam, int d)

{

name = nam;

damage=d;

}

public String getName()


{


return name;


}


public void setName(String n)


{


name = n;


}




public String getDescription()


{



return description;


}


public void setDescription(String des)


{


description = des;


}




public int getDamage()


{

return damage;


}


public void setDamage(int d)


{


damage = d;


}




public int getType()


{


return type;


}


public void setType( int t)


{


type= t;


}

//attacking opponent
public int attack(int hp)

{

int dam = (int) (Math.random() * damage);

int hpleft = hp - dam;

if(miss()==true)

return hp;

return hpleft;

}


public boolean miss()


{


if(Math.random()< 0.1)


return true;


else


return false;


}


}









