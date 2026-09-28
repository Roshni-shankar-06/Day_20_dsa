class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            
            if (currentSum == target) {
                // The problem requires 1-indexed results
                return new int[] {left + 1, right + 1};
            } else if (currentSum < target) {
                // Sum is too small, move left pointer to increase the sum
                left++;
            } else {
                // Sum is too large, move right pointer to decrease the sum
                right--;
            }
       
