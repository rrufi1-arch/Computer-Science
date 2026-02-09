public class SkyView {

    private double[][] view;

    public double[][] getView() {
        return view;
    }

    public void setView(double[][] view) {
        this.view = view;
    }

    public SkyView(int numberOfRows, int numberOfCols, double[] scanned) {
        this.view = reorderTelescopeView(arrayToMatrix(scanned, numberOfRows, numberOfCols));
    }

    private static double[][] arrayToMatrix(double[] array, int numOfRows, int numOfCols) {
        if (numOfRows < 1 || numOfCols < 1) {
            throw new IllegalArgumentException("Rows / Columns must be greater than 0.");
        } else if (numOfRows * numOfCols != array.length) {
            throw new 
                IllegalArgumentException("Rows * columns must be equal to the length of the array.");
        }
        double[][] matrix = new double[numOfRows][numOfCols];
        int counter = 0;
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfCols; j++) {
                matrix[i][j] = array[counter];
                counter += 1;
            }
        }
        return matrix;
    }

    public static double[][] reorderTelescopeView(double[][] telescopeView) {
        double[][] adjustedMatrix = new double[telescopeView.length][telescopeView[0].length];
        for (int i = 0; i < telescopeView.length; i++) {
            int counter = 0;
            if (i % 2 != 0) {
                for (int j = telescopeView[0].length - 1; j >= 0; j--) {
                    adjustedMatrix[i][counter] = telescopeView[i][j];
                    counter += 1;
                }
            } else {
                for (int j = 0; j < telescopeView[0].length; j++) {
                    adjustedMatrix[i][counter] = telescopeView[i][j];
                    counter += 1;
                }
            }
        }
        return adjustedMatrix;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < getView().length; i++) {
            for (int j = 0; j < getView()[0].length; j++) {
                output += getView()[i][j] + " ";
            }
            output += "\n";
        }
        return output;
    }

    public boolean equals(SkyView other) {
        for (int i = 0; i < getView().length; i++) {
            for (int j = 0; j < getView()[i].length; j++) {
                if (getView()[i][j] != other.getView()[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        double addedLightValues = 0;
        int counter = 0;
        if (startRow < 0 || startRow > getView().length || startCol < 0 || 
            startCol > getView()[0].length) {
            throw new IllegalArgumentException("Row / Column values must be in bounds.");
        }
        for (int i = 0; i < getView().length; i++) {
            for (int j = 0; j < getView()[i].length; j++) {
                if (i >= startRow && i <= endRow && j >= startCol && j <= endCol) {
                    addedLightValues += getView()[i][j];
                    counter += 1;
                }
            }
        }
        return addedLightValues / counter;
    }


}