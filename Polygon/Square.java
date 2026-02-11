public class Square extends Rectangle {
    public Square(double sideLength) {
        super(sideLength, sideLength);
    }

    public Square() {
        super(4, 4);
    }

    public String toString() {
        return super.toString() + "It has a side length of " + super.getLength()
        + " and an area of " + getArea() + ".";
    }
}
