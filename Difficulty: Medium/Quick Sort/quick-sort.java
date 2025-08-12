class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if (low >= high) return;
        int pivotIndex = partition(arr, low, high);
        quickSort(arr, low, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, high);
    }

    private int partition(int[] arr, int low, int high) {
        
        // code here
        int pivot = arr[high];
        int pivotIndex = low;
        for (int i = low; i < high; i++) {
            if (arr[i] <= pivot) {
                swap(arr, i, pivotIndex);
                pivotIndex++;
            }
        }
        swap(arr, pivotIndex, high);
        return pivotIndex;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}