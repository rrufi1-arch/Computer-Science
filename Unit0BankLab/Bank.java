public class Bank {
    private int numberOfLoanOfficers;
    private int numberOfTellers;

    public Bank(int numberOfLoanOfficers, int numberOfTellers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
        this.numberOfTellers = numberOfTellers;
    }

    public void setNumberOfLoanOfficers(int numberOfLoanOfficers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
    }

    public void setNumberOfTellers(int numberOfTellers) {
        this.numberOfTellers = numberOfTellers;
    }

    public int getNumberOfLoanOfficers() {
        return this.numberOfLoanOfficers;
    }

    public int getNumberOfTellers() {
        return this.numberOfTellers;
    }

    public int computeTotalEmployees() {
        return this.numberOfLoanOfficers + this.numberOfTellers;
    }

    public String toString() {
        return "The bank has " + this.numberOfLoanOfficers + " loan officers and " 
            + this.numberOfTellers + " tellers.";
    }

    public boolean equals(Bank other) {
        if (this.numberOfLoanOfficers == other.numberOfLoanOfficers 
            && this.numberOfTellers == other.numberOfTellers) {
            return true;
        }
        return false;
    }

    public void hireMembers(int numberToHire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            this.numberOfLoanOfficers += numberToHire;
        } else {
            this.numberOfTellers += numberToHire;
        }
    }

    public String getEmployeeRatio() {
        if (this.numberOfLoanOfficers > this.numberOfTellers) {
            return (double) this.numberOfLoanOfficers/this.numberOfTellers + "Loan Officers : 1 Teller";
        } else if (this.numberOfTellers > this.numberOfLoanOfficers) {
            return (double) this.numberOfTellers/numberOfLoanOfficers + "Tellers : 1 Loan Officer";
        } else {
            return "1 Loan Officer : 1 Teller";
        }
    }

    public void fireMembers(int numberToFire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            this.numberOfLoanOfficers -= numberToFire;
        } else {
            this.numberOfTellers -= numberToFire;
        }
    }

    public void transferEmployee(int numberToTransfer, boolean fromLoanOfficer) {
        if (fromLoanOfficer) {
            this.numberOfLoanOfficers -= numberToTransfer;
            this.numberOfTellers += numberToTransfer;
        } else {
            this.numberOfTellers -= numberToTransfer;
            this.numberOfLoanOfficers += numberToTransfer;
        }
    }

    public int calculateCombinedSalaries() {
        return (this.numberOfLoanOfficers * 75000) + (this.numberOfTellers * 45000);
    }

}
