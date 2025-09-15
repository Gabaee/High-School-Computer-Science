import java.util.ArrayList;

/**
 * The framework for the Celebrity Game project
 * 
 * @author cody.henrichsen
 * @version 2.3 25/09/2018 refactored the prepareGame and play methods
 */
public class CelebrityGame
{
	/**
	 * A reference to a Celebrity or subclass instance.
	 */
	private Celebrity gameCelebrity;
	/**
	 * The GUI frame for the Celebrity game.
	 */
	private CelebrityFrame gameWindow;

	/**
	 * The ArrayList of Celebrity values that make up the game
	 */
	private ArrayList<Celebrity> celebGameList;

	/**
	 * Builds the game and starts the GUI
	 */
	public CelebrityGame() {
		celebGameList = new ArrayList<>();
		gameWindow = new CelebrityFrame(this);

	}

	/**
	 * Prepares the game to start by re-initializing the celebGameList and having the gameFrame open the start screen.
	 * Resets the game by changing screens.
	 */
	public void prepareGame() {
		celebGameList = new ArrayList<>();
		gameWindow.replaceScreen("START");
	}

	/**
	 * Determines if the supplied guess is correct.
	 *
	 * @param guess The supplied String
	 * @return Whether it matches regardless of case or extraneous external
	 * spaces.
	 */
	public boolean processGuess(String guess)
	{
		boolean matches = false;
		/*
		 * Why use the .trim() method on t the supplied String parameter? What
		 * would need to be done to support a score?
		 */
		if (guess.trim().equalsIgnoreCase(gameCelebrity.getName()))
		{
			matches = true;
			celebGameList.removeFirst();
			if (!celebGameList.isEmpty())
			{
				gameCelebrity = celebGameList.getFirst();
			}
		}
		return matches;
	}

	/**
	 * Asserts that the list is initialized and contains at least one Celebrity.
	 * Sets the current celebrity as the first item in the list. Opens the game
	 * play screen.
	 */
	public void play() {
		if ((celebGameList != null) && !celebGameList.isEmpty()) {
			this.gameCelebrity = celebGameList.getFirst();
			gameWindow.replaceScreen("GAME");
		}
	}

	/**
	 * Adds a Celebrity of specified type to the game list
	 *
	 * @param name  The name of the celebrity
	 * @param guess The clue(s) for the celebrity
	 * @param type  What type of celebrity
	 */
	public void addCelebrity(String name, String guess, String type)
	{
		if(type.equals("Literature"))
		{
			celebGameList.add(new LiteratureCelebrity(name, guess));
		}
		else if(type.equals("Actor"))
		{
			celebGameList.add(new ActorCelebrity(name, guess));
		}
		else
		{
			celebGameList.add(new Celebrity(name, guess));
		}
	}

	/**
	 * Validates the name of the celebrity. It must have at least 4 characters.
	 *
	 * @param name The name of the Celebrity
	 * @return If the supplied Celebrity is valid
	 */
	public boolean validateCelebrity(String name) {
		return name.length() >= 4;
	}

	/**
	 * Checks that the supplied clue has at least 10 characters or is a series of clues
	 * This method would be expanded based on your subclass of Celebrity.
	 *
	 * @param clue The text of the clue(s)
	 * @param type Supports a subclass of Celebrity
	 * @return If the clue is valid.
	 */
	public boolean validateClue(String clue, String type)
	{
		boolean validClue = false;
		if(clue.trim().length() >= 10)
		{
			validClue = true;
			if(type.equalsIgnoreCase("literature"))
			{
				String[] temp = clue.split(",");
				{
					if (temp.length > 1)
					{
						validClue = true;
					}
					else
					{
						validClue = false;
					}
				}
			}
		}
		return validClue;
	}

	/**
	 * Accessor method for the current list size of celebrities
	 *
	 * @return Remaining number of celebrities
	 */
	public int getCelebrityGameSize() {
		int count = 0;
		for (int i = 0; i < celebGameList.size(); i++) {
			count++;
		}
		return count;
	}

	/**
	 * Accessor method for the game clue to maintain low coupling between
	 * classes
	 *
	 * @return The String clue from the current celebrity.
	 */
	public String sendClue()
	{
		return gameCelebrity.getClue();
	}
}