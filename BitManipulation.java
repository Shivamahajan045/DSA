public class BitManipulation{
    public static int getIthBit(int n, int i){
        int bitMask = 1 << i;
        if((n & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setIthBit(int n, int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1 << i);
        return n & bitMask;

    }
    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit == 0){
        //    return clearIthBit(n, i);
        // }
        // else{
        //     return setIthBit(n, i);
        // }
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static int clearIthBits(int n, int i){
        int bitMask = ~0 << i;
        return n & bitMask;
    }
    public static void checkEvenOrOdd(int n){
        if((n & 1) != 0){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }
    public static boolean isPowerofTwo(int n){
        return (n & (n-1)) == 0;
    }

    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static void main(String [] args){
        // int n = 10, i = 1;
        // System.out.println(getIthBit(n, i));
        // System.out.println(setIthBit(n, i));
        // System.out.println(clearIthBit(n, i));
        // System.out.println(updateIthBit(10, 2, 1));
        // System.out.println(clearIthBits(15, 2));
        // System.out.println(isPowerofTwo(12));
        System.out.println(countSetBits(15));
    }
}