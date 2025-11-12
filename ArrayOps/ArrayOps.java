public class ArrayOps {

    public static String printStringArray(String[] array) {
        String finalString = "";
        finalString += "[";
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                finalString += array[i] + ", ";
            }
            finalString = finalString.substring(0, finalString.length() - 2);
            System.out.println(finalString);
        }
        finalString += "]";
        return finalString;
    }

    public static String printIntegerArray(int[] array) {
        String finalString = "";
        finalString += "[";
        for (int i = 0; i < array.length; i++) {
            finalString += array[i] + ", ";
        }
        finalString = finalString.substring(0, finalString.length() - 2);
        finalString += "]";
        System.out.println(finalString);
        return finalString;
    }

    public static int findMax(int[] array) {
        int biggestNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                biggestNum = array[i];
            } else if (i != 0 && array[i] > biggestNum) {
                biggestNum = array[i];
            }
        }
        return biggestNum;
    }

    public static String findLongestString(String[] array) {
        int stringLength = -1;
        String string = "";
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                if (i == 0 && array[i] != null) {
                    stringLength = array[i].length();
                    string = array[i];
                } else if (array[i] != null && i != 0 && array[i].length() > stringLength) {
                    stringLength = array[i].length();
                    string = array[i];
                }
            }
        }
        return string;
    }

    public static double averageStringLength(String[] array) {
        int amountOfNumbers = 0;
        double combinedValues = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                combinedValues += array[i].length();
                amountOfNumbers += 1;
            }
        }
        if (Double.isNaN(combinedValues / amountOfNumbers) == true) {
            return 0;
        }
        return combinedValues / amountOfNumbers;
    }

    public static int[] countLetterFrequencies(String input) {
        if (input != null) {
            int[] intArray = new int[26];
            for (int i = 0; i < input.length(); i++) {
                if ((int) input.charAt(i) < 91 && (int) input.charAt(i) > 64) {
                    intArray[(int) input.charAt(i) - 65] += 1;
                } else if ((int) input.charAt(i) < 123 && (int) input.charAt(i) > 96) {
                    intArray[(int) input.charAt(i) - 97] += 1;
                }
            }
            return intArray;
        }
        return new int[0];
    }

    public static int[] removeIntAndScoot(int[] array, int index) {
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
        return array;
    }

    public static int[] resizeIntArray(int[] array) {
        if (array != null) {
            int[] adjustedArray = new int[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                adjustedArray[i] = array[i];
            }
            return adjustedArray;
        }
        return new int[0];
    }

    public static String[] addNumToStringArray(String[] array) {
        if (array != null) {
            String[] adjustedArray = new String[array.length];
            for (int i = 0; i < array.length; i++) {
                if (array[i] != null) {
                    adjustedArray[i] = "#" + i + " " + array[i];
                }
            }
            return adjustedArray;
        }
        return new String[0];
    }

    public static int[] reverseIntArray(int[] array) {
        if (array != null) {
            int[] reversedArray = new int[array.length];
            int regularPlace = 0;
            for (int i = array.length - 1; i >= 0; i--) {
                reversedArray[regularPlace] = array[i];
                regularPlace += 1;
            }
            return reversedArray;
        }
        return new int[0];
    }

}
