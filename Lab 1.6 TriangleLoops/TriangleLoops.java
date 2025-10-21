public class TriangleLoops {
    public static void main(String[] args) {
        // to-do: create a separate tester class
        // to-do: invoke each method at least 2 times in the tester class

        // for example:
        // System.out.println(createLetterTriangleUp(3, 'A'));
        // System.out.println(createNumbersTriangle(15));
        System.out.println(createAlphabetTriangle(26));

    }

    /*
     * The method returns a String by creating rows of letters. Each row prints a
     * number of letters equal to the row number. The total number of rows printed
     * is determined by numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @param letter the letter to be printed
     * @return a String of letters in the shape of a triangle
     */

    // to-do: implement createLetterTriangleUp
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

    /*
     * The method returns a String by creating rows of letters. Each row prints a
     * number of letters equal to the total number of rows, descending downward. The
     * total number of rows printed is determined by numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @param letter the letter to be printed
     * @return a String of letters in the shape of a triangle
     */
    // to-do: implement createLetterTriangleDown
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

    /*
     * This method returns a String of a number triangle. The number of rows in the
     * triangle is determined by the numberOfRows, and the number used in each row
     * is determined by the row number.
     * @param numberOfRows the number of rows in the triangle
     * @return a String of numbers in the shape of a triangle
     */
    // to-do: implement createNumbersTriangle
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

    /*
     * The method returns a String by creating a pyramid pattern using the alphabet.
     * The method determines the height of the pyramid by using the int
     * numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @return a String of letters in the shape of a pyramid
     */
    // to-do: implement createAlphabetTriangle
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
            for (int m = 1; m < ((i*2) + 2); m++) {
                if (m <= 0.5*((i*2) + 2)) {
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