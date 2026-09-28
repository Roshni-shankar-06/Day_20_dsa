import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // Validation for empty inputs
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        
     
