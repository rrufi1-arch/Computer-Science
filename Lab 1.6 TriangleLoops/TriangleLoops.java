public class TriangleLoops {

    public static String createLetterTriangleUp(int numberOfRows, char letter) {
        String triangle = "";
        int i = 1;
        while (i < numberOfRows + 1) {
            int j = 0;
            while (j < i) {
                triangle += letter;
                j += 1;
            }
            triangle += "\n";
            i += 1;
        }
        return triangle;
    }

    public static String createLetterTriangleDown(int numberOfRows, char letter) {
        String triangle = "";
        int i = 1;
        while (i < numberOfRows + 1) {
            for (int j = i; j < numberOfRows + 1; j++) {
                triangle += letter;
            }
            triangle += "\n";
            i += 1;
        }
        return triangle;
    }

    public static String createNumbersTriangle(int numberOfRows) {
        String triangle = "";
        for (int i = 1; i < numberOfRows + 1; i++) {
            for (int j = 0; j < i; j++) {
                triangle += i;
                triangle += " ";
            }
            triangle += "\n";
        }
        return triangle;
    }

    public static String createAlphabetTriangle(int numberOfRows) {
        String triangle = "";
        if (numberOfRows > 26) {
            numberOfRows = 26;
        }
        char tempCharValue = 0;
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = numberOfRows - i; j > 1; j--) {
                triangle += "*";
            }
            for (int m = 1; m < ((i * 2) + 2); m++) {
                if (m <= 0.5*((i * 2) + 2)) {
                    triangle += (char) (m + 64);
                    tempCharValue = (char) (m + 64);
                } else {
                    triangle += (char) (tempCharValue - 1);
                    tempCharValue -= 1;
                }
            }
            if (i != numberOfRows - 1) {
                triangle += "\n";
            }

        }
        return triangle;
    }

}