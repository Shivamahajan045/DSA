import java.util.*;
public class ArraysCC{
    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE; //-infinity
        for(int i=0; i<arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int getSmallest(int arr[]){
        int smallest = Integer.MAX_VALUE; //+infinity
        for(int i=0; i<arr.length; i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static int binSearch(int arr[], int key){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid] > key){
                //first half - update high
                high = mid - 1;
            }
            else{
                //second half - update low
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int[] reverseArray(int arr[]){
        // int temp [] = new int[arr.length];
        int low = 0;
        int high = arr.length - 1;
        while(low < high){
            //swap
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
        return arr;
    }

    public static void printPairs(int arr[]){
        for(int i=0; i<arr.length - 1; i++){
            for(int j = i+1; j<arr.length; j++){
                System.out.print("("+arr[i] + ", "+ arr[j]+") ");
            }
            System.out.println();   
        }
    }
    public static void main(String [] args){
        int arr [] = {2, 4, 6, 8, 10};
        // int key = 10;
        // System.out.println(binSearch(arr, key));
        // int newArr[] = reverseArray(arr);
        // for(int i = 0; i<newArr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }

        printPairs(arr);
    }
}