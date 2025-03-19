import java.util.Arrays;
import java.util.Collections;
public class JavaBasics{
    public static int[] bubbleSort(int arr[]){
        int n = arr.length;
            for(int turn = 0; turn < n - 1; turn++){
                for(int j = 0; j < n - 1 - turn; j++){
                    int temp = arr[j];
                    if(arr[j] > arr[j+1]){
                        // swap
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            return arr;
    }

    public static int[] insertionSort(int arr[]){
        int n = arr.length;
            for(int i = 1; i < n; i++){
                int curr = arr[i];
                int prev = i - 1;
                while(prev >= 0 && arr[prev] > curr){
                    arr[prev + 1] = arr[prev];
                    prev--;
                }
                arr[prev + 1] = curr;
            }
            return arr;
    }

    public static int[] selectionSort(int arr[]){
        int n = arr.length;
        int swap = 0;
        for(int i = 0; i < n - 1 ; i++){
            int minPos = i;
            for(int j = i + 1; j < n; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
            swap++;
        }
        System.out.println("No of swaps = " + swap);
        return arr;
    }

    public static int[] countingSort(int arr[]){
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++){
                largest = Math.max(largest, arr[i]);
            }
            int count[] = new int[largest + 1];
            for(int i = 0; i < n; i++){
                count[arr[i]]++;
            }

            //sorting
            int j = 0;
            for(int i = count.length-1; i >= 0; i--){
                while(count[i] > 0){
                    arr[j] = i;
                    j++;
                    count[i]--;
                }
            }

            return arr;
    }

    public static void main(String[] args){
        Integer arr[] = {5, 4, 6, 1, 3, 2};
        // Arrays.sort(arr, 0, 3);
        Arrays.sort(arr, Collections.reverseOrder());
        // countingSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}