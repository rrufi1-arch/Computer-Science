import java.util.Arrays;

public class Unit2Exercises {

    public static String alarmClock(int day, boolean vacation) {
        if (day > 0 && day < 7 && !vacation) {
            return "7:00";
        } else if ((day < 1 || day > 6) && !vacation) {
            return "10:00";
        } else if (day > 0 && day < 7 && vacation) {
            return "10:00";
        }
        return "off";
    }

    public static boolean love6(int a, int b) {
        int stringA = Math.abs(a);
        int stringB = Math.abs(b);
        if (stringA == 6 || stringB == 6 || stringA + stringB == 6
            || Math.abs(stringA - stringB) == 6) {
            return true;
        }
        return false;
    }

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && a == b && b == c) {
            return 10;
        } else if (a == 1 && a == b && b == c) {
            return 5;
        } else if (a == 0 && a == b && b == c) {
            return 5;
        } else if (a != b && a != c) {
            return 1;
        }
        return 0;
    }

    public static String fizzString(String str) {
        if (str.length() == 0) {
            return str;
        }
        if ((str.substring(0, 1).toUpperCase().equals("F"))
            && (str.substring(str.length() - 1).toUpperCase().equals("B"))) {
            return "FizzBuzz";
        } else if (str.substring(str.length() - 1).toUpperCase().equals("B")) {
            return "Buzz";
        } else if (str.substring(0, 1).toUpperCase().equals("F")) {
            return "Fizz";
        }
        return str;

    }

    public static String doubleChar(String str) {
        String finalString = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1) {
                finalString += str.substring(i) + str.substring(i);
            } else {
                finalString += str.substring(i, i + 1) + str.substring(i, i + 1);
            }
        }
        return finalString;

    }

    public static int countHi(String str) {
        int instancesOfHi = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1) {
                if (str.substring(i, i + 2).toLowerCase().equals("hi")) {
                    instancesOfHi += 1;
                }
            }
        }
        return instancesOfHi;
    }

    public static boolean catDog(String str) {
        int instancesOfCat = 0;
        int instancesOfDog = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i <= str.length() - 3) {
                if (str.substring(i, i + 3).toLowerCase().equals("cat")) {
                    instancesOfCat += 1;
                } else if (str.substring(i, i + 3).toLowerCase().equals("dog")) {
                    instancesOfDog += 1;
                }
            }
        }
        if (instancesOfCat == instancesOfDog) {
            return true;
        }
        return false;
    }

    public static String mixString(String a, String b) {
        String finalString = "";
        if (a.length() < b.length()) {
            for (int i = 0; i < b.length(); i++) {
                if (i < a.length()) {
                    finalString += "" + a.charAt(i) + b.charAt(i);
                } else {
                    finalString += b.charAt(i);
                }
            }
        } else if (b.length() > a.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (i < b.length()) {
                    finalString += "" + a.charAt(i) + b.charAt(i);
                } else {
                    finalString += a.charAt(i);
                }
            }
        } else {
            for (int i = 0; i < a.length(); i++) {
                finalString += "" + a.charAt(i) + b.charAt(i);
            }
        }
        return finalString;

    }

    public static String repeatEnd(String str, int n) {
        String stringToRepeat = str.substring(str.length() - n, str.length());
        String finalString = "";
        for (int i = 0; i < n; i++) {
            finalString += stringToRepeat;
        }
        return finalString;
    }

    public static boolean endOther(String a, String b) {
        String shorterString = (a.length() < b.length()) ? a.toLowerCase() : b.toLowerCase();
        String longerString = (a.equals(shorterString)) ? b.toLowerCase() : a.toLowerCase();
        if (shorterString.equals(longerString.substring(longerString.length()
            - shorterString.length(), longerString.length()))) {
            return true;
        }
        return false;
    }

    public static int countCode(String str) {
        int instancesOfCode = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i <= str.length() - 4) {
                if (str.substring(i, i + 2).toLowerCase().equals("co")
                    && str.substring(i + 3, i + 4).toLowerCase().equals("e")) {
                    instancesOfCode += 1;
                }
            }
        }
        return instancesOfCode;
    }

    public static int countEvens(int[] nums) {
        int instancesOfEvenNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[i] % 2) != 1) {
                instancesOfEvenNumber += 1;
            }
        }
        return instancesOfEvenNumber;
    }

    public static int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return max - min;
    }

    public static int sum13(int[] nums) {
        int totalValue = 0;
        int index = 0;
        while (index < nums.length) {
            if (nums[index] != 13) {
                totalValue += nums[index];
            } else {
                break;
            }
            index += 1;
        }
        return totalValue;
    }

    public static int[] fizzArray(int n) {
        int[] fizzArray = new int[n];
        if (n > 0) {
            int number = 0;
            while (number + 1 <= n) {
                fizzArray[number] = number;
                number += 1;
            }
            return fizzArray;
        }
        return new int[0];
    }

    public static boolean haveThree(int[] nums) {
        int numberOfThrees = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                if (i + 1 > nums.length - 1) {
                    numberOfThrees += 1;
                } else {
                    if (nums[i + 1] != 3) {
                        numberOfThrees += 1;
                    }
                }
            }
        }
        if (numberOfThrees == 3) {
            return true;
        }
        return false;

    }

    public static String[] fizzArray2(int n) {
        String[] fizzArray2 = new String[n];
        if (n > 0) {
            int number = 0;
            while (number + 1 <= n) {
                fizzArray2[number] = String.valueOf(number);
                number += 1;
            }
            return fizzArray2;
        }
        return new String[0];
    }

    public static int[] zeroFront(int[] nums) {
        Arrays.sort(nums);
        return nums;
    }

    public static String[] wordsWithout(String[] words, String target) {
        int newArrayLength = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i] != target) {
                newArrayLength += 1;
            }
        }
        String[] finalArray = new String[newArrayLength];
        int currentIndex = 0;
        for (int j = 0; j < words.length; j++) {
            if (!words[j].equals(target)) {
                finalArray[currentIndex] = words[j];
                currentIndex += 1;
            }
        }
        if (newArrayLength > 0) {
            return finalArray;
        }
        return new String[0];
    }

    public static int scoresAverage(int[] scores) {
        int firstHalfTotal = 0;
        int secondHalfTotal = 0;
        for (int i = 0; i < scores.length; i++) {
            if (i < (scores.length) / 2) {
                firstHalfTotal += scores[i];
            } else {
                secondHalfTotal += scores[i];
            }
        }
        if (firstHalfTotal / ((scores.length) / 2) >= secondHalfTotal / ((scores.length) / 2)) {
            return firstHalfTotal / ((scores.length) / 2);
        } else if (secondHalfTotal / ((scores.length) / 2)
            > firstHalfTotal / ((scores.length) / 2)) {
            return secondHalfTotal / ((scores.length) / 2);
        }
        return 0;
    }

    public static boolean scoresIncreasing(int[] scores) {
        boolean scoresIncreasing = true;
        int currentInt = 0;
        for (int i = 0; i < scores.length; i++) {
            if (i == 0) {
                currentInt = scores[i];
            } else if (i != 0) {
                if (currentInt > scores[i]) {
                    scoresIncreasing = false;
                }
                currentInt = scores[i];
            }
        }
        return scoresIncreasing;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        int aLargestSpecialNum = 0;
        int bLargestSpecialNum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 10 == 0 && aLargestSpecialNum == 0) {
                aLargestSpecialNum = a[i];
            } else if (a[i] % 10 == 0 && aLargestSpecialNum % 10 == 0
                && a[i] > aLargestSpecialNum) {
                aLargestSpecialNum = a[i];
            }
        }
        for (int j = 0; j < b.length; j++) {
            if (b[j] % 10 == 0 && bLargestSpecialNum == 0) {
                bLargestSpecialNum = b[j];
            } else if (b[j] % 10 == 0 && bLargestSpecialNum % 10 == 0
                && b[j] > bLargestSpecialNum) {
                bLargestSpecialNum = b[j];
            }
        }
        return aLargestSpecialNum + bLargestSpecialNum;
    }

    public static String firstTwo(String str) {
        if (str.length() == 0) {
            return "**";
        } else if (str.length() == 1) {
            return str + "*";
        } else if (str.length() == 2) {
            return str;
        } else {
            return str.substring(0, 2);
        }
    }

    public static double divide(int a, int b) {
        if (a > b) {
            if (b != 0) {
                return (double) a / b;
            }
        } else {
            if (a != 0) {
                return (double) b / a;
            }
        }
        return 0.0;
    }
}
