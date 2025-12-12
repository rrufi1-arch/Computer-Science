public class TheaterMember {
    private String name;
    private boolean[] loyaltyCredits;

    public TheaterMember(String name) {
        this.name = name;
        loyaltyCredits = new boolean[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean[] getLoyaltyCredits() {
        return loyaltyCredits;
    }

    public void setLoyaltyCredits(boolean[] loyaltyCredits) {
        this.loyaltyCredits = loyaltyCredits;
    }

    public void grantLoyaltyCredit() {
        for (int i = 0; i < loyaltyCredits.length - 1; i++) {
            if (loyaltyCredits[i] == false) {
                loyaltyCredits[i] = true;
                break;
            }
        }
    }

    public int countLoyaltyCredits() {
        int counter = 0;
        for (int i = 0; i < loyaltyCredits.length - 1; i++) {
            if (loyaltyCredits[i] == true) {
                counter++;
            }
        }
        return counter;
    }

    public String determineMembershipStatus() {
        int counter = 0;
        for (int i = 0; i < loyaltyCredits.length - 1; i++) {
            if (loyaltyCredits[i] == true) {
                counter++;
            }
        }
        if (counter >= 6) {
            return "Gold Member";
        } else if (counter >= 3 && counter <= 5) {
            return "Silver Member";
        } else {
            return "Plus Member";
        }
    }

    public String loyaltyHistory() {
        String finalString = "Loyalty History: [";
        for (int i = 0; i < loyaltyCredits.length - 1; i++) {
            if (i < loyaltyCredits.length - 1) {
                if (loyaltyCredits[i] == true) {
                    finalString += "X, ";
                } else {
                    finalString += "-, ";
                }
            } else {
                if (loyaltyCredits[i] == true) {
                    finalString += "X";
                } else {
                    finalString += "-";
                }
            }
        }
        finalString += "]";
        return finalString;
    }

    public String toString() {
        return name + " " + determineMembershipStatus()
            + ", " + loyaltyHistory(); 
    }

    public boolean equals(TheaterMember other) {
        if (this.name.equals(other.name)
            && this.loyaltyCredits == other.loyaltyCredits) {
            return true;
        }
        return false;
    }
}
