public class NPC {
    private String choice;

    public NPC() {
        this.choice = RPSGame.generateRandomChoice();
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice.UPDATETHISFUNCTION();
    }

    public String toString() {
        return "Opponent chose " + this.choice;
    }
    
}
