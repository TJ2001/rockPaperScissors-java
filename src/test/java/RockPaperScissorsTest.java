import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {
  @Test
  public void pickWinner_PaperBeatsRock_Player1() {
    Rock rocky = new Rock();
    Paper mrPaper = new Paper();

    assertTrue(mrPaper.beats(rocky)>0);
    assertFalse(rocky.beats(mrPaper)>0);

  }

  @Test
  public void pickWinner_RockBeatsScissors_1(){
    Rock rocky = new Rock();
    Scissors sirScissor = new Scissors();

    assertTrue(rocky.beats(sirScissor)>0);
    assertFalse(sirScissor.beats(rocky)>0);
  }

  @Test
  public void pickWinner_RockTiesRock(){
    Rock rocky = new Rock();
    Rock mrRock = new Rock();

    assertTrue(rocky.beats(mrRock)==0);
    assertTrue(mrRock.beats(rocky)==0);
  }
}
