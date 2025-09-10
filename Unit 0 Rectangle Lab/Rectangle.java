public class Rectangle {
    private int length;
    private int width;
    
    public Rectangle() {
        length = 20;
        width = 10;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public String toString() {
        return "The rectangle has a length of " + length
            + "and a width of " + width + ". Its area is " + length * width;
    }

    public boolean equals(Rectangle other) {
        if (this.length == other.length && this.width == other.width) {
            return true;
        }
        return false;
    }

    public int getArea() {
        return this.length * this.width;
    }

    public int getPerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    public double getDiagonal() {
        return Math.sqrt((this.length * this.length) + (this.width * this.width));
    }

    public int setLength(int newLength) {
        this.length = newLength;
        return this.length;
    }

    public int setWidth(int newWidth) {
        this.width = newWidth;
        return this.width;
    }

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

}