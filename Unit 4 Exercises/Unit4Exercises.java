import java.util.ArrayList;

public class Unit4Exercises {

    // Method 1: matchingEndSequences
    public static boolean matchingEndSequences(int[] nums, int n) {
        int choice_value = -1;
        int end_value = -1;
        for (int i = 0; i < nums.length; i++) {
            if (i == n) {
                choice_value = nums[i];
            } else if (i == nums.length - 1) {
                end_value = nums[i];
            }
        }
        if (choice_value == end_value) {
            return true;
        }
        return false;
    }

    // Method 2: hasThreeConsecutive
    public static boolean hasThreeConsecutive(int[] nums) {
        int temp_counter_even = 0;
        int temp_counter_odd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                if (temp_counter_odd == 0) {
                    temp_counter_even += 1;
                    if (temp_counter_even == 3) {
                        return true;
                    }
                } else if (temp_counter_odd != 0) {
                    temp_counter_odd = 0;
                    temp_counter_even += 1;
                }
            } else if (nums[i] % 2 == 1) {
                if (temp_counter_even == 0) {
                    temp_counter_odd += 1;
                    if (temp_counter_odd == 3) {
                        return true;
                    }
                } else if (temp_counter_even != 0) {
                    temp_counter_even = 0;
                    temp_counter_odd += 1;
                }
            }
        }
        return false;
    }

    // Method 3: generateNumberSequence
    public static int[] generateNumberSequence(int start, int end) {
        int[] list = new int[start - end];
        for (int i = 0; i < start - end; i++) {
            list[i] = start + i;
        }
        return list;
    }

    // Method 4: fizzBuzz
    public static String[] fizzBuzz(int start, int end) {
        int[] starting_list = generateNumberSequence(start, end);
        String[] final_list = new String[starting_list.length];
        for (int i = 0; i < starting_list.length; i++) {
            if (starting_list[i] % 3 == 0) {
                final_list[i] = "Fizz";
            } else if (starting_list[i] % 5 == 0) {
                final_list[i] = "Buzz";
            } else {
                final_list[i] = Integer.toString(starting_list[i]);
            }
        }
        return final_list;
    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        int num_of_even = 0;
        int num_of_odd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                num_of_even += 1;
            } else {
                num_of_odd += 1;
            }
        }
        int[] temp_even_list = new int[num_of_even];
        int temp_even_num = 0;
        int[] temp_odd_list = new int[num_of_odd];
        int temp_odd_num = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % 2 == 0) {
                temp_even_list[temp_even_num] = nums[j];
                temp_even_num += 1;
            } else {
                temp_odd_list[temp_odd_num] = nums[j];
                temp_odd_num += 1;
            }
        }
        int[] fixed_value_list = new int[nums.length];
        int evens_index = 0;
        int odds_index = 0;
        for (int m = 0; m < nums.length; m++) {
            if (m < temp_even_list.length) {
                fixed_value_list[m] = temp_even_list[evens_index];
                evens_index += 1;
            } else {
                fixed_value_list[m] = temp_odd_list[odds_index];
                odds_index += 1;
            }
        }
        return fixed_value_list;
    }

    // ArrayList Methods

    // Method 1: noNegatives
    public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();

    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

}
