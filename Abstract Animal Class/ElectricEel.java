public class ElectricEel extends Animal{
    private boolean internalTemperature;
    private double electricStrength;
    private double shockRange;
    private boolean recentlyAte;
    private int fatigueLevel;

    public ElectricEel(boolean internalTemperature, double electricStrength, double shockRange,
            boolean recentlyAte, int fatigueLevel) {
        super(10, 2, "location");
        this.internalTemperature = internalTemperature;
        this.electricStrength = electricStrength;
        this.shockRange = shockRange;
        this.recentlyAte = recentlyAte;
        this.fatigueLevel = fatigueLevel;
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
    
    public String makeNoise() {
        return "IIIIIIII";
    }

}
