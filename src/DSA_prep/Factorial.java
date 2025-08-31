package DSA_prep;

public class Factorial {
    public int fact(int n){
        if (n ==0 || n==1 ){
            return 1;
        }
        return n * fact(n-1);
    }

    public static void main(String[] args) {
        Factorial facto = new Factorial();
        int num=5;
        System.out.println(facto.fact(num));
    }
}
