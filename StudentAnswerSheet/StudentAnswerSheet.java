import java.util.ArrayList;

public class StudentAnswerSheet {
    private String name;
    private double testScore;
    private ArrayList<String> answers;

    public StudentAnswerSheet(String name, ArrayList<String> answers) {
        this.name = name;
        this.answers = new ArrayList<>(0);
        this.testScore = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTestScore() {
        return testScore;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public double getGrade(ArrayList<String> key) {
        if (key == null || this.answers == null) {
            throw new IllegalArgumentException("Arrays cannot be null.");
        }
        double score = 0;
        for (int i = 0; i < this.answers.size(); i++) {
            if (this.answers.get(i).equals(key.get(i))) {
                score += 1;
            } else if (!this.answers.get(i).equals(key.get(i)) && !this.answers.get(i).equals("?")) {
                score -= 0.25;
            } else if (this.answers.get(i).equals("?")) {
                score += 0;
            } else {
                throw new IllegalArgumentException("Answers cannot contain illegal character.");
            }
        }
        return score;
    }
    
}