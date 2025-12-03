public class Course {
    
    private String courseName;
    private StudentRecord[] enrolledStudents;
    private int maxEnrollment;

    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String courseName, int maxEnrollment) {
        this.courseName = courseName;
        this.maxEnrollment = maxEnrollment;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(StudentRecord[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public String toString() {
        String name;
        String scores = "";
        int listNum = 0;
        String finalString = "== Mathematics ==";
        for (int j = 0; j < enrolledStudents.length; j++) {
            name = enrolledStudents[j].getName();
            scores += "[";
            for (int i = 0; i < enrolledStudents[j].getScores().length; i++) {
                if (i < enrolledStudents[j].getScores().length - 1) {
                    scores += enrolledStudents[j].getScores()[i];
                    scores += ", ";
                } else {
                    scores += enrolledStudents[j].getScores()[i];
                }
            }
            listNum += 1;
            scores += "]";
            finalString += "\n" + listNum + ".) " + name + "\'s scores: " + scores;
            scores = "";
        }
        return finalString + "\n";
    }

    public boolean isFull() {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void enrollStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] == null) {
                enrolledStudents[i] = student;
                break;
            }
        }
    }

    public boolean dropStudent(StudentRecord student) {
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                if (enrolledStudents[i].getName().equals(student.getName())) {
                    enrolledStudents[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public int countEnrolledStudents() {
        int counter = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                counter++;
            }
        }
        return counter;
    }

    public void increaseClassSizeBy(int sizeIncrease) {
        StudentRecord[] newEnrolledStudents = new
        StudentRecord[enrolledStudents.length + sizeIncrease];
        for (int i = 0; i < enrolledStudents.length; i++) {
            newEnrolledStudents[i] = enrolledStudents[i];
        }
        enrolledStudents = newEnrolledStudents;
    }

    public String findBestStudent() {
        String bestName = "";
        double bestScore = 0.0;
        for (int i = 0; i < enrolledStudents.length - 1; i++) {
            if (i == 0) {
                bestName = enrolledStudents[i].getName();
                bestScore = enrolledStudents[i].getFinalAverage();
            }
            if (bestScore < enrolledStudents[i].getFinalAverage()) {
                bestName = enrolledStudents[i].getName();
                bestScore = enrolledStudents[i].getFinalAverage();
            }
        }
        return bestName;
    }

    public double calculateTestAverage(int testNumber) {
        double totalValue = 0;
        int scoreNumber = 0;
        for (int i = 0; i < enrolledStudents.length; i++) {
            for (int j = 0; j < enrolledStudents[i].getScores().length - 1; j++) {
                if (testNumber == j) {
                    totalValue += enrolledStudents[i].getScores()[j];
                    scoreNumber += 1;
                }
            }
        }
        return totalValue / scoreNumber;
    }

}
