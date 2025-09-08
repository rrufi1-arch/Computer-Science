
public class Cone {
    private String color;
    private double height;
    private String feel;
    private int weight;
    private String material;

    public Cone() {
        color = "Yellow";
        height = 1.5;
        feel = "Smooth";
        weight = 1;
        material = "Rubber";

    }
    
    public void burn() {
        System.out.println("The cone burned");
    }

    public void print() {
        System.out.println("Something Printed");
    }

    public void paintRed(){
        color = "Red";
        System.out.println("The new color is " + color);
        return;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "this is a valid string" + color +
        "and the cone height is" + height +
        "and the weight is" + weight +
        "and the material is" + material +
        "and the feel is" + feel;
    }

    public boolean equals(Cone other) {
        if(this.color.equals(other.color) && this.height == other.height && this.feel.equals(other.feel)
        && this.weight == other.weight && this.material.equals(other.material)) {
            return true;
        }
        return false;
    }
}
