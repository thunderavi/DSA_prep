package DSA_prep;

public class LinearSearch {
    public static int linearSearch(int[] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){

            return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={10,25,36,47,59,68};
        int target = 47;

        int result = linearSearch(arr,target);
        if (result != -1){
            System.out.println("Element "+ target + " Found at index "+ result
            );
        }else {
            System.out.println("Element "+target + "not found ");
        }
    }
}
