import java.util.ArrayList;

public class BlackBear extends Animal{
    private ArrayList<String> diet;
    private int jawStrength;
    private double standardClawLength;
    private boolean isHibernating;

    public BlackBear(ArrayList<String> diet, int jawStrength, double standardClawLength,
            boolean isHibernating) {
        super(10, 1000000, "ohio");
        this.diet = diet;
        this.jawStrength = jawStrength;
        this.standardClawLength = standardClawLength;
        this.isHibernating = isHibernating;
    }

    public ArrayList<String> getDiet() {
        return diet;
    }
    public void setDiet(ArrayList<String> diet) {
        this.diet = diet;
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

    public String makeNoise() {
        return "groWWl";
    }
}
