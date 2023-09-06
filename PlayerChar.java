public class PlayerChar extends Character
{
   private String title;
   private int hp, originalHP;
   private int myX, myY;
   private Attack one, two, three;
   public PlayerChar()
   {
      super();
      
   }
   public PlayerChar(String name, int ohp)
   {
      title = name;
      originalHP = ohp;
      hp = ohp;
      one = new Attack("one", 50);
      two = new Attack("two", 10);
      three = new Attack("three", 20);
   }
   public PlayerChar(String name, int x, int y, int ohp, String on, String tw, String th)
   {
      super();
   }
public Attack getAttack1()
{
return one;
}
public Attack getAttack2()
{
return two;
}
public Attack getAttack3()
{
return three;
}
}



