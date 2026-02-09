import java.util.ArrayList;

public class RoadRunner {
    private double weight;
    private String location;
    private double legLength;
    private boolean isThirsty;
    private boolean isStalkingPrey;
    private ArrayList<String> familyMembers;
    private double age;

    public RoadRunner(double weight, String location, double legLength, boolean isThirsty, boolean isStalkingPrey,
            ArrayList<String> familyMembers, double age) {
        this.weight = weight;
        this.location = location;
        this.legLength = legLength;
        this.isThirsty = isThirsty;
        this.isStalkingPrey = isStalkingPrey;
        this.familyMembers = familyMembers;
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public double getLegLength() {
        return legLength;
    }
    public void setLegLength(double legLength) {
        this.legLength = legLength;
    }
    public boolean isThirsty() {
        return isThirsty;
    }
    public void setThirsty(boolean isThirsty) {
        this.isThirsty = isThirsty;
    }
    public boolean isStalkingPrey() {
        return isStalkingPrey;
    }
    public void setStalkingPrey(boolean isStalkingPrey) {
        this.isStalkingPrey = isStalkingPrey;
    }
    public ArrayList<String> getFamilyMembers() {
        return familyMembers;
    }
    public void setFamilyMembers(ArrayList<String> familyMembers) {
        this.familyMembers = familyMembers;
    }
    public double getAge() {
        return age;
    }
    public void setAge(double age) {
        this.age = age;
    }

    

    
}
