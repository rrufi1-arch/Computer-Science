import java.util.ArrayList;

public class RoadRunner extends Animal{
    private double legLength;
    private boolean isThirsty;
    private boolean isStalkingPrey;
    private ArrayList<String> familyMembers;

    public RoadRunner(double legLength, boolean isThirsty, boolean isStalkingPrey,
            ArrayList<String> familyMembers) {
        super(10, 2, "salty dela o doom");
        this.legLength = legLength;
        this.isThirsty = isThirsty;
        this.isStalkingPrey = isStalkingPrey;
        this.familyMembers = familyMembers;
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

    public String makeNoise() {
        return "scree";
    }
}
