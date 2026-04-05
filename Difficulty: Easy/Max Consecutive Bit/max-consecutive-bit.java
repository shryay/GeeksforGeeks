class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int c0 = 0, c1 = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                c0++;
                c1 = 0;
            }
            
            else {
                c1++;
                c0 = 0;
            }
            max = Math.max(max, Math.max(c0, c1));
        }
        return max;
    }
}
