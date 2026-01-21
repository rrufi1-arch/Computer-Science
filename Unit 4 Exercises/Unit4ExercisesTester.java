import java.util.Arrays;

public class Unit4ExercisesTester {
    public static void main(String[] args) {
        System.out.println(Unit4Exercises.matchingEndSequences(new int[] {5, 6, 45, 99, 13, 5, 6}, 1) == false ? "Success!" : "Failure");
        System.out.println(Unit4Exercises.matchingEndSequences(new int[] {5, 6, 45, 99, 13, 5, 6}, 2) == true ? "Success!" : "Failure");
        System.out.println(Unit4Exercises.matchingEndSequences(new int[] {5, 6, 45, 99, 13, 5, 6}, 3) == false ? "Success!" : "Failure");

        System.out.println(Unit4Exercises.hasThreeConsecutive(new int[] {2, 1, 3, 5}) == true ? "Success!" : "Failure");
        System.out.println(Unit4Exercises.hasThreeConsecutive(new int[] {2, 1, 2, 5}) == false ? "Success!" : "Failure");
        System.out.println(Unit4Exercises.hasThreeConsecutive(new int[] {2, 4, 2, 5}) == true ? "Success!" : "Failure");

        System.out.println(Arrays.toString(Unit4Exercises.generateNumberSequence(5, 10)) == "[5, 6, 7, 8, 9]" ? "Success!" : "Failure");
        System.out.println(Arrays.toString(Unit4Exercises.generateNumberSequence(11, 18)) == "[11, 12, 13, 14, 15, 16, 17]" ? "Success!" : "Failure");
        System.out.println(Arrays.toString(Unit4Exercises.generateNumberSequence(1, 3)) == "[1, 2]" ? "Success!" : "Failure");
        
        System.out.println(Arrays.toString(Unit4Exercises.generateNumberSequence(1, 6)) == "[1, 2, Fizz, 8, Buzz]" ? "Success!" : "Failure");
        System.out.println(Arrays.toString(Unit4Exercises.generateNumberSequence(1, 8)) == "[1, 2, Fizz, 4, Buzz, Fizz, 7]" ? "Success!" : "Failure");
        System.out.println(Arrays.toString(Unit4Exercises.generateNumberSequence(1, 11)) == "[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz]" ? "Success!" : "Failure");

        System.out.println(Arrays.toString(Unit4Exercises.moveEvenBeforeOdd(new int[] {1, 0, 1, 0, 0, 3, 1})) == "[0, 0, 0, 1, 1, 3, 1]" ? "Success!" : "Failure");
        System.out.println(Arrays.toString(Unit4Exercises.moveEvenBeforeOdd(new int[] {3, 3, 2})) == "[2, 3, 3]" ? "Success!" : "Failure");
        System.out.println(Arrays.toString(Unit4Exercises.moveEvenBeforeOdd(new int[] {2, 2, 2})) == "[2, 2, 2]" ? "Success!" : "Failure");
    }
    
}
