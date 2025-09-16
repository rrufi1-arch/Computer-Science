public class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public Student(String name) {
        this.name = name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setGrade(int newGrade) {
        this.grade = newGrade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public boolean equals(Student other) {
        if(this.name == other.name && this.grade == other.grade) {
            return true;
        }
        return false;
    }

    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    public String generateId() {
        String k = new String();
        int j;
        for (int i = 0; i < 8; i++){
            if(i < 4) {
                j = getRandomNumber(1, 8);
                k += j;
            }
            if(i == 5){
                k += "-";
            }
            if(5 < i && i < 9) {
                j = getRandomNumber(0, 9);
                k += j;
            }
        }
        return k;
    }
}
