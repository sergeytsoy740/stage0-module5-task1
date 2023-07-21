package com.epam.mjc.stage0;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {
   /* public static void main(String[] args) {
        for (int[] e : sortRaggedArray(new int[][]{{1, 2, 5, 4, 3, 0}, {9, 8, 7, 3}, {2, 1}})) {
            System.out.println(Arrays.toString(e));
        }

        //toBubbleSortArray(new int[] {3, 2, 1, 1, 0, 5, 5, 10, 6});
    }*/

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[]{"winter", "spring", "summer", "autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers
     * starting at 1 of the given length (length parameter > 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1]
     * length = 3  -> [1, 2, 3]
     * length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] nums = new int[length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        return nums;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9
     * arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array.
     * If there is no such element in the array, return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2
     * arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int numberIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                numberIndex = i;
                return numberIndex;
            }
        }
        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array
     * by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"]
     * arr = ["pineapple", "apple", "pen"] -> ["pen", "apple", "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String buffer = "";
        for (int i = 0; i <= arr.length / 2; i++) {
            buffer = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = buffer;
        }
        return arr;
    }

    /**
     * Return new int[] array obtained from arr int[] array
     * by choosing positive numbers only.
     * P.S. 0 is not a positive number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3]
     * arr = [-1, -2, -3]   -> []
     * arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int positives = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positives++;
            }
        }

        int[] arrOfPositives = new int[positives];

        int d = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arrOfPositives[d] = arr[i];
                ++d;
            }
        }
        return arrOfPositives;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules:
     * Incoming one-dimensional arrays must be arranged in ascending order of their length;
     * numbers in all one-dimensional arrays must be in ascending order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]]
     * arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
        int[] buffer = null;
        for (int i = 0; i < arr.length; i++) {
            toBubbleSortArray(arr[i]);
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].length > arr[j + 1].length) {
                    buffer = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buffer;
                }
            }
        }
        return arr;
    }

    private static void toBubbleSortArray(int[] array) {
        int buffer2 = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    buffer2 = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer2;
                }
            }
        }
    }
}
