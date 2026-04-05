class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int low = 0, high = k - 1, sum = 0;
        for (int i = low; i <= high; i++) {
            sum = sum + arr[i];
        }
        int res = 0;
        while (high < arr.length) {
            res = Math.max(res, sum);
            low++;
            high++;
            if (high == arr.length)
                break;
            sum = sum - arr[low - 1];
            sum = sum + arr[high];
        }
        return res;
    }
}