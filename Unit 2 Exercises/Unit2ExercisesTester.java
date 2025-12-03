import java.util.Arrays;

public class Unit2ExercisesTester {
    public static void main(String[] args) {
        System.out.println(Unit2Exercises.alarmClock(1, false));
        System.out.println(Unit2Exercises.alarmClock(5, false));
        System.out.println(Unit2Exercises.alarmClock(0, false));
        System.out.println(Unit2Exercises.love6(6, 4));
        System.out.println(Unit2Exercises.love6(4, 5));
        System.out.println(Unit2Exercises.love6(1, 5));
        System.out.println(Unit2Exercises.redTicket(2, 2, 2));
        System.out.println(Unit2Exercises.redTicket(2, 2, 1));
        System.out.println(Unit2Exercises.redTicket(0, 0, 0));
        System.out.println(Unit2Exercises.fizzString("fig"));
        System.out.println(Unit2Exercises.fizzString("dib"));
        System.out.println(Unit2Exercises.fizzString("fib"));
        System.out.println(Unit2Exercises.doubleChar("The"));
        System.out.println(Unit2Exercises.doubleChar("AAbb"));
        System.out.println(Unit2Exercises.doubleChar("Hi-There"));
        System.out.println(Unit2Exercises.countHi("abc hi ho"));
        System.out.println(Unit2Exercises.countHi("ABChi hi"));
        System.out.println(Unit2Exercises.countHi("hihi"));
        System.out.println(Unit2Exercises.catDog("catdog"));
        System.out.println(Unit2Exercises.catDog("catcat"));
        System.out.println(Unit2Exercises.catDog("1cat1cadodog"));
        System.out.println(Unit2Exercises.mixString("abc", "xyz"));
        System.out.println(Unit2Exercises.mixString("Hi", "There"));
        System.out.println(Unit2Exercises.mixString("xxxx", "There"));
        System.out.println(Unit2Exercises.repeatEnd("Hello", 3));
        System.out.println(Unit2Exercises.repeatEnd("Hello", 2));
        System.out.println(Unit2Exercises.repeatEnd("Hello", 1));
        System.out.println(Unit2Exercises.endOther("Hiabc", "abc"));
        System.out.println(Unit2Exercises.endOther("AbC", "HiaBc"));
        System.out.println(Unit2Exercises.endOther("abc", "abXabc"));
        System.out.println(Unit2Exercises.countCode("aaacodebbb"));
        System.out.println(Unit2Exercises.countCode("codexxcode"));
        System.out.println(Unit2Exercises.countCode("cozexxcope"));
        System.out.println(Unit2Exercises.countEvens(new int[] {2, 1, 2, 3, 4}));
        System.out.println(Unit2Exercises.countEvens(new int[] {2, 2, 0}));
        System.out.println(Unit2Exercises.countEvens(new int[] {1, 3, 5}));
        System.out.println(Unit2Exercises.bigDiff(new int[] {10, 3, 5, 6}));
        System.out.println(Unit2Exercises.bigDiff(new int[] {7, 2, 10, 9}));
        System.out.println(Unit2Exercises.bigDiff(new int[] {2, 10, 7, 2}));
        System.out.println(Unit2Exercises.sum13(new int[] {1, 2, 2, 1}));
        System.out.println(Unit2Exercises.sum13(new int[] {1, 1}));
        System.out.println(Unit2Exercises.sum13(new int[] {1, 2, 2, 1, 13}));
        System.out.println(Arrays.toString(Unit2Exercises.fizzArray(4)));
        System.out.println(Arrays.toString(Unit2Exercises.fizzArray(1)));
        System.out.println(Arrays.toString(Unit2Exercises.fizzArray(10)));
        System.out.println(Unit2Exercises.haveThree(new int[] {3, 1, 3, 1, 3}));
        System.out.println(Unit2Exercises.haveThree(new int[] {3, 1, 3, 3}));
        System.out.println(Unit2Exercises.haveThree(new int[] {3, 4, 3, 3, 4}));
        System.out.println(Arrays.toString(Unit2Exercises.fizzArray2(4)));
        System.out.println(Arrays.toString(Unit2Exercises.fizzArray2(10)));
        System.out.println(Arrays.toString(Unit2Exercises.fizzArray2(2)));
        System.out.println(Arrays.toString(Unit2Exercises.zeroFront(new int[] {1, 0, 0, 1})));
        System.out.println(Arrays.toString(Unit2Exercises.zeroFront(new int[] {0, 1, 1, 0, 1})));
        System.out.println(Arrays.toString(Unit2Exercises.zeroFront(new int[] {1, 0})));
        System.out.println(Arrays.toString(Unit2Exercises.wordsWithout(new String[]
            {"a", "b", "c", "a"}, "a")));
        System.out.println(Arrays.toString(Unit2Exercises.wordsWithout(new String[]
            {"a", "b", "c", "a"}, "b")));
        System.out.println(Arrays.toString(Unit2Exercises.wordsWithout(new String[]
            {"a", "b", "c", "a"}, "c")));
        System.out.println(Unit2Exercises.scoresAverage(new int[] {2, 2, 4, 4}));
        System.out.println(Unit2Exercises.scoresAverage(new int[] {4, 4, 4, 2, 2, 2}));
        System.out.println(Unit2Exercises.scoresAverage(new int[] {3, 4, 5, 1, 2, 3}));
        System.out.println(Unit2Exercises.scoresIncreasing(new int[] {1, 3, 4}));
        System.out.println(Unit2Exercises.scoresIncreasing(new int[] {1, 3, 2}));
        System.out.println(Unit2Exercises.scoresIncreasing(new int[] {1, 1, 4}));
        System.out.println(Unit2Exercises.scoresSpecial(new int[] {12, 10, 4},
            new int[] {2, 20, 30}));
        System.out.println(Unit2Exercises.scoresSpecial(new int[] {20, 10, 4},
            new int[] {2, 20, 10}));
        System.out.println(Unit2Exercises.scoresSpecial(new int[] {12, 11, 4},
            new int[] {2, 20, 31}));
        System.out.println(Unit2Exercises.firstTwo("hello"));
        System.out.println(Unit2Exercises.firstTwo("hi"));
        System.out.println(Unit2Exercises.firstTwo("h"));
        System.out.println(Unit2Exercises.firstTwo(""));
        System.out.println(Unit2Exercises.divide(5, 2));
        System.out.println(Unit2Exercises.divide(2, 5));
        System.out.println(Unit2Exercises.divide(4, 2));
        System.out.println(Unit2Exercises.divide(10, 55));
    }
}
