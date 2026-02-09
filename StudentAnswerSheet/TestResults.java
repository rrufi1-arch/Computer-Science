import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class TestResults {
    private ArrayList<String> answers;
    private ArrayList<StudentAnswerSheet> submissions;

    public TestResults(ArrayList<String> key, ArrayList<StudentAnswerSheet> submissions) {
        if (key == null || submissions == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }
        this.answers = key;
        this.submissions = submissions;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public ArrayList<StudentAnswerSheet> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(ArrayList<StudentAnswerSheet> submissions) {
        this.submissions = submissions;
    }

    public void submit(StudentAnswerSheet student) {
        this.submissions.add(student);
    }

    public void gradeTests() {
        if (submissions == null) {
            throw new IllegalArgumentException("Submissions cannot be null.");
        }
        for (StudentAnswerSheet submission : submissions) {
            if (submission.getAnswers().size() != answers.size()) {
                throw new IllegalArgumentException("Test lengths must match.");
            }
        }
        
        submissions.stream().forEach(submission -> submission
            .setTestScore(submission.getGrade(answers)));
    }

    public String highestScoringStudent() {
        if (submissions == null || submissions.isEmpty()) {
            return "No submissions.";
        }
        double[] scores = new double[submissions.size()];
        for (int i = 0; i < submissions.size(); i++) {
            scores[i] = submissions.get(i).getGrade(answers);
        }
        for (int i = 0; i < submissions.size(); i++) {
            if (Arrays.stream(scores).max().getAsDouble() == submissions.get(i).getGrade(answers)) {
                return submissions.get(i).getName();
            }
        }
        return "No highest scoring student found.";
    }

}
