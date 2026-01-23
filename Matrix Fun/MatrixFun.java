public class MatrixFun {

    private int[][] matrix;

    public MatrixFun(int numberOfRows, int numberOfCols) {
        if (numberOfRows < 1 || numberOfCols < 1) {
            throw new IllegalArgumentException("Rows and Columns must both be positive.");
        }
        this.matrix = new int[numberOfRows][numberOfCols];
        this.matrix = assignRandomValuesToMatrix(matrix, 0, 9);

    }

    public MatrixFun(int[][] starterMatrix) {
        this.matrix = starterMatrix;
    }

    public MatrixFun() {
        this.matrix = assignRandomValuesToMatrix(new int[3][3], 0, 9);
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public static int generateRandomInt(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int[][] assignRandomValuesToMatrix(int[][] matrix, int min, int max) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = generateRandomInt(min, max);
            }
        }
        return matrix;
    }

    public String toString() {
        String output = "";
        String equals = "";
        for (int k = 0; k < this.matrix.length; k++) {
            equals += "==";

        }
        output += equals + "\n";
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                output += this.matrix[i][j] + " ";
            }
            output += "\n";
        }
        output += equals;
        return output;
    }

    public boolean equals(MatrixFun other) {
        if (matrix.length != other.getMatrix().length) {
            return false;
        }
        for (int k = 0; k < matrix.length; k++) {
            if (matrix[k].length != other.getMatrix()[k].length) {
                return false;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != other.getMatrix()[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean equals(int[][] other) {
        return equals(new MatrixFun(other));
    }

    public void replaceAll(int oldValue, int newValue) {
        for (int i = 0; i < this.matrix.length - 1; i++) {
            for (int j = 0; j < this.matrix[i].length - 1; i++) {
                if (matrix[i][j] == oldValue) {
                    matrix[i][j] = newValue;
                }
            }
        }
    }

    public void swapRow(int rowA, int rowB) {
        if (rowA < 1 || rowB < 1) {
            throw new IllegalArgumentException("Row number cannot be negative.");
        }
        int temp = 0;
        if (rowB > rowA) {
            temp = rowA;
            rowA = rowB;
            rowB = temp;
        }
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length - 1; i++) {
                if (i == rowA) {
                    matrix[rowA][j] = matrix[rowB][j];
                }
            }
        }
    }
} 