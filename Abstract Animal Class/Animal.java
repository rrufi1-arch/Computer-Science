public abstract class Animal {
    private double age;
    private int weight;
    private String location;

    public Animal(double age, int weight, String location) {
        this.age = age;
        this.weight = weight;
        this.location = location;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void ageUp(double delta) {
        if (delta < 0) {
            throw new IllegalArgumentException("Delta must be positive.");
        }
        this.age += delta;
    }

    public void gainWeight(double kg) {
        if (kg < 0) {
            throw new IllegalArgumentException("Can't gain negative weight");
        }
        weight += kg;
    }

    public void loseWeight(double kg) {
        if (this.weight - kg < 0) {
            throw new IllegalArgumentException("Cannot become negative weight");
        }
        this.weight -= kg;
    }

    public abstract String makeNoise();
    
}
