public class Dog {
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;

    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = dogId;
        this.dogChar = 'a';
        this.dogTag = "683a";
        this.stillInFacility = true;
    }

    public Dog() {
        this.name = "Bob";
        this.ownerName = "Abracadabra";
        this.age = 67;
        this.dogId = 455;
        this.dogChar = 'b';
        this.dogTag = "455b";
        this.stillInFacility = false;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDogId() {
        return dogId;
    }

    public void setDogId(int dogId) {
        this.dogId = dogId;
    }

    public char getDogChar() {
        return dogChar;
    }

    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }

    public String getDogTag() {
        return dogTag;
    }

    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }

    public boolean isStillInFacility() {
        return stillInFacility;
    }

    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    public String generateDogTag() {
        return Integer.toString(this.dogId) + this.dogChar;
    }

    public char generateDogChar() {
        int hundredsDigit = (int) (this.dogId / 100);
        int tenthsDigit = (int) ((this.dogId / 10) % 10);
        int onesDigit = (int) (this.dogId % 10);
        int combinedIdValue = hundredsDigit + tenthsDigit + onesDigit;
        return (char) combinedIdValue;
    }


}
