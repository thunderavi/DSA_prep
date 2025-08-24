package DSA_prep;

public class BubbleSort {
    public void swap(int[] num,int i,int j){
        int temp = num[i];
        num[i]=num[j];
        num[j]=temp;
    }

    private void sort(int[] num){
        int n = num.length;
        for (int i = 0; i <n-1 ; i++) {

            for (int j = 0; j <n-1-i ; j++) {
                if (num[j] > num[j+1]){
                   swap(num ,j,j+1);
                }
            }

        }
    }
    public static void main(String[] args) {
        int num[] = {4,5,8,9,2,7};
        BubbleSort sorted = new BubbleSort();
        System.out.println("Bubble Sorted number :");
        sorted.sort(num);
        for (int i : num) {
            System.out.print(" "+i);
        }
        System.out.println();

    }
}
