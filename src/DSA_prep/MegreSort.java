package DSA_prep;

public class MegreSort  extends SelectionSort {

    @Override
    public void sort(int[] nums) {
        mergesort(nums);
    }

    private void mergesort(int[] nums) {
        int n = nums.length;
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = nums[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = nums[i];
        }
        mergesort(left);
        mergesort(right);

        merge(nums, left, right);
    }

    private void merge(int[] result, int[] first, int[] second) {
        int i = 0, j = 0, k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] <= second[j]) {
                result[k] = first[i];

            } else {
                result[k++] = second[j];
            }
        }
        while (i < first.length) {
            result[k++] = first[i++];
        }
        while (j < second.length) {
            result[k++] = second[j++];
        }

        {
            int[] arr = {8, 6, 14, 77, 1, 13};
            int n = arr.length;

            SortingAlgo sort = new MegreSort();
            sort.sort(arr);
            System.out.println("Soter array:");
            for (int r : arr) {
                System.out.println(" " + r);
            }
            System.out.println();
        }
    }
}