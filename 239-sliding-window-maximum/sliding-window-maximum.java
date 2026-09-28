import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // Validation for empty inputs
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int ri = 0; // Index for the result array
        
        // Deque stores the indices of array elements
        Deque<Integer> deque = new ArrayDeque<>();
      
