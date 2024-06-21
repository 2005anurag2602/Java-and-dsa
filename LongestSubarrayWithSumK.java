import java.util.HashMap;

public class LongestSubarrayWithSumK {
    
    // Function to find the length of the longest subarray with sum K
    public static int longestSubarrayWithSumK(int[] arr, int K) {
        // HashMap to store the first occurrence of each prefix sum
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        int currentSum = 0;
        int maxLength = 0;
        
        for (int i = 0; i < arr.length; i++) {
            // Update the current sum
            currentSum += arr[i];
            
            // Check if current sum is equal to K
            if (currentSum == K) {
                maxLength = i + 1;
            }
            
            // Check if (currentSum - K) is found in the HashMap
            if (prefixSumMap.containsKey(currentSum - K)) {
                maxLength = Math.max(maxLength, i - prefixSumMap.get(currentSum - K));
            }
            
            // Store the current sum in the HashMap if not already present
            if (!prefixSumMap.containsKey(currentSum)) {
                prefixSumMap.put(currentSum, i);
            }
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int K = 15;
        
        int result = longestSubarrayWithSumK(arr, K);
        System.out.println("The length of the longest subarray with sum " + K + " is: " + result);
    }
}
