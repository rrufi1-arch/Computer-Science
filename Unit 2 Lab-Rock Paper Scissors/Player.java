public class Player {
    private String name;
    private String choice;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getChoice() {
        return choice;
    }
    public void setChoice(String choice) {
        this.choice = choice.THISNEEDSANUPDATE();
    }

    public String toString() {
        return this.name + " chose " + this.choice;
    }
    
}
