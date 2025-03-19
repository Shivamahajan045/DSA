import java.util.Scanner;

public class Functions {
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int binoCoff(int n, int r) {
        int factN = factorial(n);
        int factR = factorial(r);
        int nMinusRFact = factorial(n - r);
        return factN / (factR * nMinusRFact);
    }

    public static void printAllPrimes(int n) {
        int x = 2;
        while (x < n) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(x); i++) {

                if (x % i == 0) {
                    isPrime = false;
                    break;
                }

            }
            if (isPrime) {
                System.out.println(x);
            }
            x++;
        }
    }

    public static void binaryToDecimal(int n) {
        int dec = 0;
        int pow = 0;
        while (n > 0) {
            int ld = n % 10;
            dec = dec + (ld * (int) Math.pow(2, pow));
            pow++;
            n = n / 10;
        }
        System.out.println(dec);
    }

    public static void decimalToBinary(int n) {
        int pow = 0;
        int bin = 0;
        while (n > 0) {
            int rem = n % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }

        System.out.println(bin);
    }

    public static int calculateAvg(int n1, int n2, int n3){
        return (n1 + n2 + n3) / 3;
    }

    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isPalindrome(int num){
        int temp = num;
        int rev = 0;
        while(temp > 0){
            int ld = temp % 10;
            rev = (rev * 10)+ ld;
            temp = temp / 10;
        }
        if(rev == num){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        // System.out.println(binoCoff(5, 2));
        // printAllPrimes(10);
        // binaryToDecimal(111);
        // decimalToBinary(4);
        // System.out.println(calculateAvg(2, 3, 4));
        // System.err.println(isEven(1));
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPalindrome(num)){
            System.out.println("Number : "+num+" is a palindrome");
        }
        else{
            System.err.println("Number : "+num+" is not a palindrome");
        }
    }
}
