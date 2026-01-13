import java.lang.reflect.Array;
import java.util.Arrays;

public class Unit3Exercises {
    public static double calculateAverageStringLength(String[] strs) {
        boolean allNull = true;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] != null) {
                allNull = false;
            }
        }
        if (allNull == true) {
            return 0.0;
        }
        int sum = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] != null) {
                sum += strs[i].length();
            }
        }
        return sum / (strs.length);
    }

    // Intended: produce a new string with the characters of the input reversed.
    public static String reverseString(String str) {
        if (str == null) {
            return "";
        }
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        return reversed;
    }

    public static int findMaxValue(int[] numbers) {
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                max = numbers[i];
            }
            else if (numbers[i] > max) { 
                max = numbers[i];
            }
        }
        return max;
    }

    // Intended: check whether the input string reads the same forwards and
    // backwards.
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char a = str.charAt(left);
            char b = str.charAt(right);
            if (a != b) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Intended: sum only the even numbers in the array.
    public static int sumEvenNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }

    public static int calculateSumOfSquares(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow(numbers[i], 2);
        }
        return sum;
    }

    public static int getNthFibonacci(int n) {
    if (n <= 1) {
        return n;
    }

    int a = 0, b = 1, c;
    for (int i = 2; i <= n; i++) {
        c = a + b;
        a = b;
        b = c;
    }
    return b;
    }

    public static void sortArrayDescending(int[] arr) {
        Arrays.sort(arr);
        int[] tempArray = new int[arr.length];
        int tempNum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = tempArray[tempNum];
            tempNum++;
        }
        arr = tempArray;
    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public static double calculateInterest(double principal, double rate, int years) {
        for (int i = 0; i < years; i++) {
            principal += principal * (rate / 100);
        }
        return principal;
    }

    public static int parsePositiveInteger(String str) {
        if (str != null) {
            if (Integer.parseInt(str) >= 0) {
                return Integer.parseInt(str);
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public static String getArrayElement(String[] arr, int index) {
        try {
            String value = arr[index].toString();
            return value;
        } catch (IndexOutOfBoundsException e){
            return "Error index out of bounds.";
        }
    }

    public static double calculateSquareRoot(int number) {
        if (number < 0) {
            return Double.NaN;
        }
        return Math.sqrt(number);
    }

    public static int sumArrayElements(int[] array) {
        int sum = 0;
        if (array == null) {
            throw new NullPointerException("Array empty.");
        } else {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;    
        }
    }

    public static double calculatePower(double base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent must be a positive integer.");
        }
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        // System.out.println(calculateAverageStringLength(new String[]{"Personable","Tables","Their"}));
        // System.out.println(reverseString("The"));
        // System.out.println(findMaxValue(new int[]{-3,-9,-6,-2}));
        // System.out.println(isPalindrome("tacocat"));
        // System.out.println(sumEvenNumbers(new int[]{4,10,9,4,11,2}));
        // System.out.println(getNthFibonacci(5));
        // sortArrayDescending(new int[] {4, 1, 5, 100});
        // System.out.println(findLongestWord("Hello there friend named Bobbetto."));
        System.out.println(calculateInterest(100, 10, 2));
        System.out.println(getArrayElement(new String[] {"quiet", "loud", "tall", "small"}, 3));
    }
}