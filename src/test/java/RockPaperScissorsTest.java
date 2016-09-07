import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {
  Game testGame = new Game();

  @Test
  public void pickWinner_PaperBeatsRock_PlayerTwo() {
      String expected = "playerTwo wins";
      String playerOne = "rock";
      String playerTwo = "paper";
      assertEquals(expected, testGame.pickWinner(playerOne, playerTwo));
    }
  @Test
  public void pickWinner_ScissorBeatsPaper_PlayerTwo() {
    String expected = "playerTwo wins";
    String playerOne = "paper";
    String playerTwo = "scissors";
    assertEquals(expected, testGame.pickWinner(playerOne, playerTwo));
    }
  @Test
  public void pickWinner_RockBeatsScissor_PlayerTwo() {
    String expected = "playerTwo wins";
    String playerOne = "scissors";
    String playerTwo = "rock";
    assertEquals(expected, testGame.pickWinner(playerOne, playerTwo));
    }
  @Test
  public void pickWinner_RockBeatsSissor_PlayerOne(){
    String expected = "playerOne wins";
    String playerOne = "rock";
    String playerTwo = "scissors";
    assertEquals(expected, testGame.pickWinner(playerOne, playerTwo));
  }
  @Test
  public void pickWinner_ScissorBeatsPaper_PlayerOne(){
    String expected = "playerOne wins";
    String playerOne = "scissor";
    String playerTwo = "rock";
    assertEquals(expected, testGame.pickWinner(playerOne,playerTwo));
  }
  @Test
  public void pickWinner_RockTiesRock_Tie(){
    String expected = "Tie";
    String playerOne = "rock";
    String playerTwo = "rock";
    assertEquals(expected, testGame.pickWinner(playerOne, playerTwo));
  }
  @Test
  public void pickWinner_ScissorTiesScissor_Tie(){
    String expected = "Tie";
    String playerOne = "scissor";
    String playerTwo = "scissor";
    assertEquals(expected, testGame.pickWinner(playerOne, playerTwo));
  }
  @Test
  public void pickWinner_PaperTiesPaper_Tie(){
    String expected = "Tie";
    String playerOne = "paper";
    String playerTwo = "paper";
    assertEquals(expected, testGame.pickWinner(playerOne, playerTwo));
  }
}
