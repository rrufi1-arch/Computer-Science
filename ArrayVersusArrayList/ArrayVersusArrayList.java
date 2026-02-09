import java.util.ArrayList;

public class ArrayVersusArrayList {

    public static void main(String[] args) {

        System.out.println("== Testing Arrays lastComesFirst() ==");
        testLastComesFirst1();
        System.out.println();

        System.out.println("== Testing ArrayLists lastComesFirst() ==");
        testLastComesFirst2();
        System.out.println();

        System.out.println("== Testing Arrays firstComesLast() ==");
        testFirstComesLast1();
        System.out.println();

        System.out.println("== Testing ArrayLists firstComesLast() ==");
        testFirstComesLast2();

    }

    // modifies the given array by moving the last element to the first index, and
    // shifting all
    // other elements to the right.
    public static void lastComesFirst(String[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Cannot use a null array.");
        }
        String[] fixedArray = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                fixedArray[0] = arr[i];
            } else {
                fixedArray[i + 1] = arr[i];
            }
        }
        for (int i = 0; i < fixedArray.length; i++) {
            arr[i] = fixedArray[i];
        }
    }

    // modifies the given array by moving the last element to the first index, and
    // shifting all
    // other elements to the right.
    public static void lastComesFirst(ArrayList<String> arrList) {
        if (arrList.isEmpty()) {
            throw new IllegalArgumentException("Cannot use a null array.");
        }
        ArrayList<String> fixed = new ArrayList<>(arrList.size());

        for (int i = 0; i < arrList.size(); i++) {
            fixed.add(null);
        }

        for (int i = 0; i < arrList.size(); i++) {
            if (i == arrList.size() - 1) {
                fixed.set(0, arrList.get(i));
            } else {
                fixed.set(i + 1, arrList.get(i));
            }
        }

        for (int i = 0; i < arrList.size(); i++) {
            arrList.set(i, fixed.get(i));
        }
    }

    // modifies the given array by moving the first element to the last index, and
    // shifting all
    // other elements to the left.
    public static void firstComesLast(String[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Cannot use a null array.");
        }
        String[] fixedArray = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                fixedArray[arr.length - 1] = arr[0];
            } else {
                fixedArray[i - 1] = arr[i];
            }
        }
        for (int i = 0; i < fixedArray.length; i++) {
            arr[i] = fixedArray[i];
        }

    }

    // modifies the given array by moving the first element to the last index, and
    // shifting all
    // other elements to the left.
    public static void firstComesLast(ArrayList<String> arrList) {
        if (arrList.isEmpty()) {
            throw new IllegalArgumentException("Cannot use a null array.");
        }
        ArrayList<String> fixed = new ArrayList<>(arrList.size());

        for (int i = 0; i < arrList.size(); i++) {
            fixed.add(null);
        }

        for (int i = 0; i < arrList.size(); i++) {
            if (i == 0) {
                fixed.set(arrList.size() - 1, arrList.get(0));
            } else {
                fixed.set(i - 1, arrList.get(i));
            }
        }

        for (int i = 0; i < arrList.size(); i++) {
            arrList.set(i, fixed.get(i));
        }

    }

    // Test Methods
    // method to print an array
    public static String printArray(String[] arr) {
        String arrayStr = "[";
        for (int k = 0; k < arr.length; k++) {
            if (k < arr.length - 1) {
                arrayStr += arr[k] + ", ";

            } else {
                arrayStr += arr[k] + "]";
            }
        }

        return arrayStr;
    }

    public static void testLastComesFirst1() {
        String[] strArray = { "first", "second", "third", "fourth", "fifth" };
        String[] expectedArray = { "fifth", "first", "second", "third", "fourth" };

        System.out.println("\tTesting lastComesFirst():");
        System.out.println("\tOriginal: " + printArray(strArray));
        System.out.println("\tExpecting: " + printArray(expectedArray));

        lastComesFirst(strArray);
        System.out.println("\tOutput: " + printArray(strArray));
        System.out.println("\tResult: "
                + (printArray(expectedArray).equals(printArray(strArray)) ? "PASS" : "FAIL"));

    }

    public static void testFirstComesLast1() {
        String[] strArray = { "one", "two", "three", "four", "five" };
        String[] expectedArray = { "two", "three", "four", "five", "one" };

        System.out.println("\tTesting firstComesLast():");
        System.out.println("\tOriginal: " + printArray(strArray));
        System.out.println("\tExpecting: " + printArray(expectedArray));

        firstComesLast(strArray);
        System.out.println("\tOutput: " + printArray(strArray));
        System.out.println("\tResult: "
                + (printArray(expectedArray).equals(printArray(strArray)) ? "PASS" : "FAIL"));
    }

    public static void testLastComesFirst2() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("fifth");

        ArrayList<String> expectedList = new ArrayList<String>();
        expectedList.add("fifth");
        expectedList.add("first");
        expectedList.add("second");
        expectedList.add("third");
        expectedList.add("fourth");

        System.out.println("\tTesting lastComesFirst():");
        System.out.println("\tOriginal: " + list);
        System.out.println("\tExpecting: " + expectedList);

        lastComesFirst(list);

        System.out.println("\tOutput: " + list);
        boolean result = (expectedList).equals(list);
        System.out.println("\tResult: " + (result ? "PASS" : "FAIL"));

    }

    public static void testFirstComesLast2() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        ArrayList<String> expectedList = new ArrayList<String>();
        expectedList.add("two");
        expectedList.add("three");
        expectedList.add("four");
        expectedList.add("five");
        expectedList.add("one");

        System.out.println("\tTesting firstComesLast():");
        System.out.println("\tOriginal: " + list);
        System.out.println("\tExpecting: " + expectedList);

        firstComesLast(list);

        System.out.println("\tOutput: " + list);
        boolean result = (expectedList).equals(list);
        System.out.println("\tResult: " + (result ? "PASS" : "FAIL"));

    }

}
