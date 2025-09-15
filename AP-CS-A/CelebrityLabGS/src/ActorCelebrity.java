import java.util.ArrayList;
import java.util.Arrays;

public class ActorCelebrity extends Celebrity
{
    private ArrayList<String> clueList;

    public ActorCelebrity(String name, String clue)
    {
        super(name, clue);
        processClues();
    }
    @Override
    public String toString()
    {
        String dsc = "This is the actor celebrity: " + getName() + "\nThe clues are:\n";

        for (String word : super.getClue().split(","))
        {
            dsc += word + "\n";
        }

        return dsc;
    }
    private void processClues()
    {
        String[] clues = super.getClue().split(",");
        clueList = new ArrayList<>();
        clueList.addAll(Arrays.asList(clues));
    }
    @Override
    public String getClue()
    {
        if (clueList.isEmpty())
        {
            processClues();
        }

        return clueList.removeFirst();
    }
}
