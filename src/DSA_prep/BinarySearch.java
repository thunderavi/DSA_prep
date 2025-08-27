package DSA_prep;

public class BinarySearch {

    public int search(int[] sortArr, int target) {
        int beginning = 0, end = sortArr.length - 1;

        while (beginning <= end) {
            int mid = beginning + (end - beginning) / 2;

            if (target == sortArr[mid]) {
                return mid; // Found target
            } else if (target < sortArr[mid]) {
                end = mid - 1; // Search left half
            } else {
                beginning = mid + 1; // Search right half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] sortArr = {-8, -5, 0, 3, 7, 11, 15};
        int target = 7;

        BinarySearch searching = new BinarySearch();
        int result = searching.search(sortArr, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index: " + result);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
