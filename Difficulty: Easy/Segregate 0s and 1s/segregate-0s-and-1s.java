// User function Template for Java

class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int n = arr.length;

        int j = 0;   // denotes for 0
        int k = n - 1; // denotes for 1

        while (j <= k) {
            if (arr[j] == 0) {
                j++;
            } else {
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                k--;
            }
        }
    }
}
