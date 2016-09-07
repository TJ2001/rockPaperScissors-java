import java.util.Arrays;
import java.util.List;

public class Game {

  public String pickWinner(String playerOne, String playerTwo){
    String winner = "";
    String p2 = "playerTwo wins";
    String p1 = "playerOne wins";
    String tie = "Tie";
    if(playerOne.equals("rock") && playerTwo.equals( "paper")){
      return winner = p2;
    } else if(playerOne.equals("paper") && playerTwo.equals("scissors")){
      return winner = p2;
    } else if(playerOne.equals("scissors") && playerTwo.equals("rock")) {
      return winner = p2;
    } else if(playerOne.equals("rock") && playerTwo.equals("scissors")) {
      return winner = p1;
    } else if(playerOne.equals("scissor") && playerTwo.equals("rock")) {
      return winner = p1;
    } else if(playerOne.equals("scissor") && playerTwo.equals("paper")) {
      return winner = p1;
    } else if(playerOne.equals("rock") && playerTwo.equals("rock")) {
      return winner = tie;
    } else if(playerOne.equals("scissor") && playerTwo.equals("scissor")) {
      return winner = tie;
    } else if(playerOne.equals("paper") && playerTwo.equals("paper")) {
      return winner = tie;
    }
        return(winner);
  }
}
