import java.util.Scanner;
public class RPSGame {
    private Player player;
    private NPC opponent;

    public RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        player.setName(name);
        int attempts = 0;
        String finalChoice = "";
        while (attempts < 3) {
            String choice = scan.nextLine();
            choice = choice.toLowerCase();
            if (validateChoice(choice)) {
                finalChoice += choice;
                break;
            } else {
                attempts += 1;
            }
        }
        if (attempts < 3) {
            player.setChoice(finalChoice);
        } else {
            player.setChoice(generateRandomChoice());
        }
        scan.close();
    }

    public void setPlayerValues(String name, String choice) {
        player.setName(name);
        player.setChoice(choice);
    }

    public boolean didPlayerWin() {
        if (player.getChoice().equals("rock") && opponent.getChoice().equals("scissors")) {
            return true;
        } else if (player.getChoice().equals("paper") && opponent.getChoice().equals("rock")) {
            return true;
        } else if (player.getChoice().equals("scissors") && opponent.getChoice().equals("paper")) {
            return true;
        } else if (player.getChoice().equals("rock") && opponent.getChoice().equals("paper")) {
            return false;
        } else if (player.getChoice().equals("paper") && opponent.getChoice().equals("scissors")) {
            return false;
        } else if (player.getChoice().equals("scissors") && opponent.getChoice().equals("rock")) {
            return false;
        }
        return false;
    }

    public String toString() {
        if (didPlayerWin()) {
            return player.getName() + "won! \nCongratulations!";
        }
        return "Opponent won!\nBetter luck next time!";
    }

    public String displayResults() {
        if (didPlayerWin()) {
            return "== GAME RESULTS ==\n" + player.getName() + " chose " + player.getChoice()
                + ".\nOpponent chose " + opponent.getChoice() + ".\n" + player.getName()
                + " won!\nCongratulations!";
        }
        return "== GAME RESULTS ==\n" + player.getName() + " chose " + player.getChoice()
                + ".\nOpponent chose " + opponent.getChoice()
                + ".\nOpponent won!\nBetter luck next time!";
    }

    public static boolean validateChoice(String choice) {
        if (choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")) {
            return true;
        }
        return false;
    }

    public static String generateRandomChoice() {
        int randomNumber = (int) Math.random() * (99) + 1;
        if (randomNumber >= 1 && randomNumber <= 33) {
            return "rock";
        } else if (randomNumber >= 34 && randomNumber <= 66) {
            return "paper";
        }
        return "scissors";
    }
}