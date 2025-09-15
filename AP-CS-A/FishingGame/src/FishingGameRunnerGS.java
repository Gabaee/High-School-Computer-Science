/********************************************
 * Sample solution for Activity 4.9.3 
 ********************************************/
public class FishingGameRunnerGS
{
  public static void main(String[] args)
  {
    PlayerGS player = new PlayerGS();
    GameGUI gameGUI = new GameGUI(player);
   
    // setup all the components of the game
    gameGUI.playGame();
  }
}
