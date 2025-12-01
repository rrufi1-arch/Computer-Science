public class StudentRecord {

    private String name;
    private int[] scores;

    public StudentRecord(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public String toString() {
        String scoresString = "";
        scoresString += "[";
        for (int i = 0; i < scores.length; i++) {
            scoresString += scores[i];
            if (i != scores.length - 1) {
                scoresString += ", ";
            }
        }
        scoresString += "]";
        return name + "\'s scores: " + scoresString;
    }

    public boolean equals(StudentRecord other) {
        boolean areScoresEqual = true;
        for (int i = 0; i < scores.length - 1; i++) {
            if (scores[i] != other.scores[i]) {
                areScoresEqual = false;
            }
        }
        if (areScoresEqual && name == other.name) {
            return true;
        }
        return false;
    }

    public double getAverage(int first, int last) {
        double totalValue = 0.0;
        for (int i = 0; i < scores.length; i++) {
            if (i >= first && i <= last) {
                totalValue += scores[i];
            }
        }
        return totalValue / (last - first + 1);
    }

    public int getTestScore(int testNumber) {
        if (testNumber >= 0 && testNumber <= scores.length - 1) {
            return scores[testNumber];
        }
        return -1;
    }

    public boolean hasImproved() {
        boolean improvedScore = true;
        for (int i = 0; i < scores.length - 1; i++) {
            if (i > 0) {
                if (scores[i] < scores[i - 1]) {
                    improvedScore = false;
                }
            }
        }
        return improvedScore;
    }
    
    public double getFinalAverage() {
        if (hasImproved()) {
            return getAverage(scores.length / 2, scores.length - 1);
        }
        return getAverage(0, scores.length - 1);
    }

}