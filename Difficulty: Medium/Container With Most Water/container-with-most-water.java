class Solution {
    public int maxWater(int arr[]) {
        // Code Here
        int l = 0, r = arr.length - 1, max = 0;
        while (l < r) {
            int h = Math.min(arr[l], arr[r]);
            int b = r - l;
            int total = h * b;
            max = Math.max(max, total);
            if (arr[l] < arr[r]) l++;
            else r--;
        }
        return max;
    }
}