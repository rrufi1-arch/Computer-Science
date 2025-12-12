public class Theater {
    private String theaterName;
    private int initialCapacity;
    private TheaterMember[] registeredMembers;

    public Theater(String theatherName, TheaterMember[] registeredMembers) {
        this.theaterName = theatherName;
        this.registeredMembers = registeredMembers;
    }

    public Theater(String theatherName, int initialCapacity) {
        this.theaterName = theatherName;
        this.initialCapacity = initialCapacity;
        this.registeredMembers = new TheaterMember[initialCapacity];
    }


    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public int getInitialCapacity() {
        return initialCapacity;
    }

    public void setInitialCapacity(int initialCapacity) {
        this.initialCapacity = initialCapacity;
    }

    public TheaterMember[] getRegisteredMembers() {
        return registeredMembers;
    }

    public void setRegisteredMembers(TheaterMember[] registeredMembers) {
        this.registeredMembers = registeredMembers;
    }

    public boolean isFull() {
        for (int i = 0; i < registeredMembers.length - 1; i++) {
            if (registeredMembers[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void increaseCapacity() {
        int index = 0;
        TheaterMember[] newArray = new TheaterMember[registeredMembers.length * 2];
        for (int i = 0; i < registeredMembers.length - 1; i++) {
            if (registeredMembers[i] != null) {
                newArray[index] = registeredMembers[i];
                index += 1;
            }
        }
        registeredMembers = newArray;
    }

    public void registerMember(TheaterMember member) {
        if (isFull()) {
            increaseCapacity();
            for (int i = 0; i < registeredMembers.length - 1; i++) {
                if (registeredMembers[i] == null) {
                    registeredMembers[i] = member;
                }
            }
        } else {
            for (int i = 0; i < registeredMembers.length - 1; i++) {
                if (registeredMembers[i] == null) {
                    registeredMembers[i] = member;
                }
            }
        }
    }

    public String toString() {
        String finalString = "== AMC Members ==";
        int memberCount = 1;
        for (int i = 0; i < registeredMembers.length - 1; i++) {
            if (registeredMembers[i] != null) {
                finalString += "\n" + memberCount + ".)"
                    + registeredMembers[i].toString();
            }
        }
        return finalString;
    }

    public boolean deleteMember(TheaterMember member) {
        for (int i = 0; i < registeredMembers.length - 1; i++) {
            if (registeredMembers[i] != null) {
                if (registeredMembers[i].getName().equals(member.getName())) {
                    registeredMembers[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
}
