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
        this.dogId = PawesomeUtils.validateDogId(dogId);
        this.dogChar = PawesomeUtils.generateDogChar(this.dogId);
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, this.dogChar);
        this.stillInFacility = true;
    }

    public Dog() {
        this.name = "Bob";
        this.ownerName = "Abracadabra";
        this.age = 67;
        this.dogId = PawesomeUtils.validateDogId(dogId);
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
        this.dogId = PawesomeUtils.validateDogId(dogId);
        char newChar = PawesomeUtils.generateDogChar(this.dogId);
        setDogChar(newChar);
        String newTag = PawesomeUtils.generateDogTag(dogId, newChar);
        setDogTag(newTag);
    }

    public char getDogChar() {
        return dogChar;
    }

    public void setDogChar(char dogChar) {
        this.dogTag = PawesomeUtils.generateDogTag(this.dogId, dogChar);
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

    // public String generateDogTag() {
    //     return Integer.toString(this.dogId) + this.dogChar;
    // }

    // public static char generateDogChar(int dogId) {
    //     int hundredsDigit = (int) (dogId / 100);
    //     int tenthsDigit = (int) ((dogId / 10) % 10);
    //     int onesDigit = (int) (dogId % 10);
    //     int combinedIdValue = hundredsDigit + tenthsDigit + onesDigit;
    //     return (char) ('F' + (combinedIdValue % 10));
    // }

    // public static String pickup(Dog dog, String personName) {
    //     if (dog.ownerName == personName) {
    //         dog.stillInFacility = false;
    //         return dog.name + " has been picked up by their owner " + personName;
    //     }
    //     return "Unknown owner.";
    // }

    // public static void checkIn(Dog dog, String personName) {
    //     dog.ownerName = personName;
    //     dog.stillInFacility = true;
    //     }

}
