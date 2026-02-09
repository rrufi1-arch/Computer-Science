import java.util.ArrayList;

public class BlackBear {
    private ArrayList<String> diet;
    private double age;
    private String location;
    private int jawStrength;
    private double standardClawLength;
    private boolean isHibernating;
    private double weight;

    public BlackBear(ArrayList<String> diet, double age, String location, int jawStrength, double standardClawLength,
            boolean isHibernating, double weight) {
        this.diet = diet;
        this.age = age;
        this.location = location;
        this.jawStrength = jawStrength;
        this.standardClawLength = standardClawLength;
        this.isHibernating = isHibernating;
        this.weight = weight;
    }

    public ArrayList<String> getDiet() {
        return diet;
    }
    public void setDiet(ArrayList<String> diet) {
        this.diet = diet;
    }
    public double getAge() {
        return age;
    }
    public void setAge(double age) {
        this.age = age;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getJawStrength() {
        return jawStrength;
    }
    public void setJawStrength(int jawStrength) {
        this.jawStrength = jawStrength;
    }
    public double getStandardClawLength() {
        return standardClawLength;
    }
    public void setStandardClawLength(double standardClawLength) {
        this.standardClawLength = standardClawLength;
    }
    public boolean isHibernating() {
        return isHibernating;
    }
    public void setHibernating(boolean isHibernating) {
        this.isHibernating = isHibernating;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    
}
