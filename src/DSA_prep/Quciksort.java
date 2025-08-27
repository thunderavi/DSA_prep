package DSA_prep;

public class Quciksort extends SelectionSort{

    private void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
    @Override
    public void sort(int[] nums) {
        quicksort(nums,0,nums.length-1);
    }

    private void quicksort(int[] nums,int low, int high){
        if (low < high){
            int partitionIndex = partition(nums,low,high);
            quicksort(nums,0,partitionIndex-1);
            quicksort(nums,partitionIndex+1,high);
        }
    }
    private int partition(int[] nums, int low, int high){
        int pivot = nums[high];
        int i =low;

        for (int j = low; j < high ; j++) {
            if (nums[j] < pivot){
                swap(nums,i,j);
                i++;
            }
        }
        swap(nums,i,high);

        return i;
    }

    public static void main(String[] args) {
        int[] arr ={8,6,16,77,1,13};
        int n = arr.length;

        SelectionSort sort = new Quciksort();
        sort.sort(arr);
        System.out.println("Sorted array:");
        for (int r : arr) {
            System.out.println(" "+r);
        }
        System.out.println();
    }
}
