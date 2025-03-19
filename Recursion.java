public class Recursion {
    public static int sumOfNnums(int n){
        if(n == 1){
            return 1;
        }
        return n + sumOfNnums(n-1);
    }
    public static int printFactorial(int n){
        if(n == 0){
            return 1;
        }
        return n * printFactorial(n-1);
    }
    public static void printnums(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printnums(n-1);
    }
    public static void main(String[] args) {
        // System.out.println(printFactorial(0));
        System.out.println(sumOfNnums(4));
    }
}
