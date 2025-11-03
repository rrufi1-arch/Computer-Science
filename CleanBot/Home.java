public class Home {
    private String address;
    private String ownerName;
    private String username;
    private int cleanlinessLevel;
    private boolean isScheduled;

    public Home(String address, String ownerName, int cleanlinessLevel) {
        this.address = address;
        this.ownerName = CleanUtils.fixName(ownerName);
        this.username = CleanUtils.generateUsername(username);
        this.cleanlinessLevel = CleanUtils.validateCleanlinessLevel(cleanlinessLevel);
        this.isScheduled = false;
    }

    public Home() {
        this.address = "address1";
        this.ownerName = "bob";
        this.username = "@random_user_1999";
        this.cleanlinessLevel = 2;
        this.isScheduled = true;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = CleanUtils.fixName(ownerName);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = CleanUtils.validateCleanlinessLevel(cleanlinessLevel);
    }

    public boolean isScheduled() {
        return isScheduled;
    }

    public void setScheduled(boolean isScheduled) {
        this.isScheduled = isScheduled;
    }

    public String toString(Home home) {
        return "i didnt have time :(";
    }

    public boolean equals(Home other) {
        if (this.address.equals(other.address) && this.ownerName.equals(other.ownerName) && this.username.equals(other.username)
                && this.cleanlinessLevel == other.cleanlinessLevel && this.isScheduled == other.isScheduled) {
                    return true;
            }
        return false;
    }
}
