package Arrays;


import java.util.HashMap;

public class Subarray_with_given_sum {
    public static void main(String[] args) {
        // Define an array of integers and the target sum
        int[] numbers = {1, 4, 20, 3, 10, 5};
        int targetSum = 33;

        // Call the method to find the subarray with the given sum
        findSubarrayWithGivenSum(numbers, targetSum);
    }

    /**
     * Method to find a subarray with a given sum
     * @param array - input array of integers
     * @param sum - target sum
     */
    public static void findSubarrayWithGivenSum(int[] array, int sum) {
        // HashMap to store the cumulative sum and corresponding index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Initialize the current sum to 0
        int currentSum = 0;

        for (int i = 0; i < array.length; i++) {
            // Add the current element to the current sum
            currentSum += array[i];

            // If the current sum is equal to the target sum, we found a subarray
            if (currentSum == sum) {
                System.out.println("Subarray found from index 0 to " + i);
                return;
            }

            // If (currentSum - sum) exists in the map, we found a subarray
            if (map.containsKey(currentSum - sum)) {
                System.out.println("Subarray found from index " + (map.get(currentSum - sum) + 1) + " to " + i);
                return;
            }

            // Store the current sum with the index
            map.put(currentSum, i);
        }

        // If no subarray is found
        System.out.println("No subarray with the given sum found.");
    }
}
