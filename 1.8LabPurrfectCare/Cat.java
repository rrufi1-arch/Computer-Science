public class Cat {
    private String name;
    private String ownerName;
    private int moodLevel;
    private String catId;
    private char catChar;
    private boolean isHungry;

    public Cat(String name, String ownerName, int moodLevel, String catId) {
        this.name = name;
        this.ownerName = ownerName;
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
        this.catId = PurrfectUtils.validateCatId(catId);
        this.catChar = PurrfectUtils.generateCatChar(catId);
        this.isHungry = true;
    }

    public Cat() {
        this.name = "bob";
        this.ownerName = "frank";
        this.moodLevel = 5;
        this.catId = "3456";
        this.catChar = PurrfectUtils.generateCatChar(catId);
        this.isHungry = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        if (moodLevel < 0){
            this.moodLevel = 0;
        } else if (moodLevel > 10) {
            this.moodLevel = 10;
        } else {
            this.moodLevel = moodLevel;
        }
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        if (Integer.parseInt("" + catId) <= 9999 && Integer.parseInt("" + catId) >= 1000) {
            this.catId = catId;
        }
        else {
            int min = 1000;
            int max = 9999;
            this.catId = Integer.toString((int) (Math.random() * (max-min) + min));
        }
    }

    public char getCatChar() {
        return catChar;
    }

    public void setCatChar(char catChar) {
        this.catChar = catChar;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    public String generateCatTag() {
        return this.catId + catChar;
    }

    public String toString() {
        String mood = "";
        String petting = "";
        if (this.moodLevel > 5) {
            mood = "good";
            petting = "acceptable";
        } else {
            mood = "bad";
            petting = "unacceptable";
        }
        return "== ABOUT " + this.name + " ==\n" + this.name
            + " is a cat.\nTheir tag is " + generateCatTag()
            + ".\n Currently, " + this.name + " is in a " + mood
            + " mood.\nPetting is " + petting;
    }

    public boolean equals(Cat other) {
        if (this.name.equals(other.name) && this.ownerName.equals(other.ownerName)
            && this.moodLevel == other.moodLevel && generateCatTag() == other.generateCatTag() 
            && this.isHungry == other.isHungry) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("KITTYCAT", "Random Dude", 6, "9991");
        PurrfectUtils.bootUp(cat1);
        PurrfectUtils.pet(cat1);
        for (int i = 0; i < 5; i++) {
            PurrfectUtils.trimClaws(cat1);
        }
        PurrfectUtils.cleanLitterBox(cat1);
        PurrfectUtils.feed(cat1);
    }
}
