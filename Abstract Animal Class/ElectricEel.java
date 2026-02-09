public class ElectricEel {
    private boolean internalTemperature;
    private double electricStrength;
    private String location;
    private double shockRange;
    private boolean recentlyAte;
    private int fatigueLevel;
    private double weight;
    private double age;

    public ElectricEel(boolean internalTemperature, double electricStrength, String location, double shockRange,
            boolean recentlyAte, int fatigueLevel, double weight, double age) {
        this.internalTemperature = internalTemperature;
        this.electricStrength = electricStrength;
        this.location = location;
        this.shockRange = shockRange;
        this.recentlyAte = recentlyAte;
        this.fatigueLevel = fatigueLevel;
        this.weight = weight;
        this.age = age;
    }

    public boolean isInternalTemperature() {
        return internalTemperature;
    }
    public void setInternalTemperature(boolean internalTemperature) {
        this.internalTemperature = internalTemperature;
    }
    public double getElectricStrength() {
        return electricStrength;
    }
    public void setElectricStrength(double electricStrength) {
        this.electricStrength = electricStrength;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public double getShockRange() {
        return shockRange;
    }
    public void setShockRange(double shockRange) {
        this.shockRange = shockRange;
    }
    public boolean isRecentlyAte() {
        return recentlyAte;
    }
    public void setRecentlyAte(boolean recentlyAte) {
        this.recentlyAte = recentlyAte;
    }
    public int getFatigueLevel() {
        return fatigueLevel;
    }
    public void setFatigueLevel(int fatigueLevel) {
        this.fatigueLevel = fatigueLevel;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getAge() {
        return age;
    }
    public void setAge(double age) {
        this.age = age;
    }

    

}
