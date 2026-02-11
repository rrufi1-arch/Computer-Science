public class Triangle extends Polygon {
    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle(double base, double height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    public Triangle() {
        super(3);
        this.base = 3;
        this.height = 4;
    }

    public double getArea() {
        return (this.base * this.height) / 2;
    }

    public String toString() {
        return super.toString() + "It has a base of " + this.base
        + ", a height of " + this.height + ", and an area of "
        + getArea() + ".";
    }
    
}
