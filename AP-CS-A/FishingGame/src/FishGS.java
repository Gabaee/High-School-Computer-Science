/*
 * Activity 4.9.3
 */
public class FishGS extends LakeObjectGS
{
    @Override
    public String say()
    {
        return "You now have a fish!";
    }
    @Override
    public void setCost(int cost)
    {
       setCost(cost * getWeight());
    }

}