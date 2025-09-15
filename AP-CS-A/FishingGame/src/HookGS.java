/**
 * Activity 4.9.3
 */
public class HookGS extends LakeObjectGS
{
  private int strength;
  /*---------- accessor ----------*/
  public HookGS()
  {
    strength = 55;
    setCost(15);
    //System.out.println("Hook: " + getCost() + ":" + getWeight());
  }
  public int getStrength()
  {
    return strength; // This return will be updated in the next activity
    //return strength;
  }
  @Override
  public String say()
  {
    return "You now have a hook!";
  }
}