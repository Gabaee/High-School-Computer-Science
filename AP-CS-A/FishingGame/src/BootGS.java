/*
 * Activity 4.9.3
 */
public class BootGS extends LakeObjectGS
{
    public BootGS()
    {
        setCost(0);
    }
    @Override
    public String say()
    {
        return "You now have a boot!";
    }
    @Override
    public boolean wasCaught(HookGS h)
    {
        return getObjectName().equals("boot");
    }

}