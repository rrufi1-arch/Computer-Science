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
        return "The rectangle has a length of " + length + 
        "and a width of " + width + ". Its area is " + length * width;
    }

    public boolean equals(Rectangle other) {
        if (this.length == other.length && this.width == other.width) {
            return true;
        }
        return false;
    }

    public int calculateArea() {
        return this.length * this.width;
    }

    public int calculatePerimeter() {
        return (2 * this.length) + (2 * this.width);
    }

    public double calculateDiagonal() {
        return Math.sqrt((this.length * this.length) + (this.width * this.width));
    }

}
