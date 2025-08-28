
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
}
