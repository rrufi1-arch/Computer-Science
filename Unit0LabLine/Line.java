public class Line {
    private int a;
    private int b;
    private int c;

    public Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateSlope() {
        return (double) (this.a * -1) / this.b;
    }

    public boolean isCoordinateOnLine(int x, int y) {
        if ((this.a * x) + (this.b * y) + this.c == 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Equation: " + this.a + "x + " 
            + this.b + "y + " + this.c + " = 0";
    }

    public boolean equals(Line other) {
        if (this.a == other.a && this.b == other.b && this.c == other.c) {
            return true;
        }
        return false;
    }
}
