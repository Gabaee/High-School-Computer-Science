/*
* Activity 4.9.3 and 4.9.4
* A LakeObject class for the Fishing Game
* 
* V1.0
* 10/10/2019
* Copyright(c) 2019 PLTW to present. All rights reserved
*/
public abstract class LakeObjectGS
{
  private int cost;
  private int weight;
  
  /*---------- constructor ----------*/
  public LakeObjectGS()
  {
    // generate a random cost and weight for the LakeObject
    cost = (int) (Math.random() * 7) + 1;
    weight = (int) (Math.random() * 15) + 1;
  }

  /*---------- accessors ----------*/
  public int getCost()
  {
    return cost;
  }

  public int getWeight()
  {
    return weight;
  }

  /*---------- mutators ----------*/
  public void setCost(int cost)
  {
    this.cost = cost;
  }

  /*---------- additional methods ----------*/
  public String say()
  {
    return "You have collected a LakeObject!";
  }

  public boolean wasCaught(HookGS h)
  {
    // an object in a lake is caught if the hook is strong enough
      return h.getStrength() >= weight;
  }

  public String getObjectName()
  {
    // Object methods getClass().getName() return the name of the subclassed item  
    // for example Fish or Bait
    return this.getClass().getName();
  }

}