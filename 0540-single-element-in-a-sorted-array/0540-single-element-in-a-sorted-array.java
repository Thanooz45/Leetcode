class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Force mid to be an even index so (mid, mid + 1) represents a pair
            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                // Valid even-odd pair: single element is strictly to the right
                left = mid + 2;
            } else {
                // Pattern disrupted: single element is at mid or to the left
                right = mid;
            }
        }

        return nums[left];
    }
}