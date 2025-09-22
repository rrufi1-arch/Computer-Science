public class Student {
    private String name;
    private String id; 
    private int grade; 

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        generateId();
    }

    public Student(String name) {
        this.name = name;
        this.grade = 10;
        generateId();
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

    public void setId(String newId) {
        this.id = newId;
    }

    public String getId() {
        return id;
    }

    public boolean equals(Student other) {
        if (this.name.equals(other.name) && this.grade == other.grade 
        && this.id.equals(other.id)) {
            return true;
        }
        return false;
    }

    public static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }

    public String toString() {
        return this.name + " is a " + grade + "th grade student. Their id is " + this.id;
    }
    
    public String generateId() {
        String k = new String();
        int j;
        for (int i = 0; i < 9; i++) {
            if (i < 3) {
                j = getRandomNumber(1, 8);
                k += j;
            }
            if (i == 4) {
                k += "-";
            }
            if (5 <= i && i < 10) {
                j = getRandomNumber(0, 9);
                k += j;
            }
        }
        this.id = k;
        return this.id;
    }
}
