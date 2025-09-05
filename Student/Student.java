public class Student {
    private int age;
    private String name;
    private double gpa;
    private boolean honorRoll;

    public Student(String newName, int newAge, double newGpa, boolean newHonorRoll){
        this.name = newName;
        this.age = newAge;
        this.gpa = newGpa;
        this.honorRoll = newHonorRoll;
    }

    public Student(String name){
        this.name = name;
        this.age = 12;
        this.gpa = 4.1;
        this.honorRoll = true;
    }
    
    public double study(int hours){
        this.gpa = gpa + hours/100;
        return gpa;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public String getName(){
        return name;
    }

    public double getGpa(){
        return gpa;
    }

}
