
/* Question 1:Given an integer array nums, return true 
if any value appears at least twice in the array, and return false if every element is distinct. */
// import java.util.*;
// import java.util.HashMap;
// public class ArraysAssignment{
//     public static boolean containsDuplicate(int nums[]){ 
//         int n = nums.length;
        // Tc - O(N2) and SC- O(1)
        // for(int i=0; i<n-1; i++){
        //     for(int j = i+1; j<n; j++){
        //         if(nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;


    // TC- O(N) and SC - O(N)
    //     HashMap<Integer, Integer>map = new HashMap<>();
    //     for(int num : nums){
    //         if(map.containsKey(num)){
    //             return true; //Duplicate found
    //         }
    //         map.put(num, 1);
    //     }
    //     return false;
    // }

public class ArraysAssignment{ 
    public static void bubbleSort(int nums[]){
        
        for(int turn = 0; turn < nums.length - 1; turn++){
            boolean swapped = false;
            for(int j = 0; j < nums.length - 1 - turn ; j++){
                if(nums[j] > nums[j+1]){
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
             // If no swaps happened in this pass, break (array is sorted)
            if(!swapped){
                break;
            }
        }
        
    }

    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int maxPos = i;
            for(int j = i+1; j<n; j++){
                if(arr[maxPos] < arr[j]){
                    maxPos = j;
                }
            }
            int temp = arr[maxPos];
            arr[maxPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i - 1;
            while(prev >= 0 && arr[prev] < curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=count.length-1; i>=0; i--){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }


    
    public static void main(String[] args){
        int nums[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        // bubbleSort(nums);
        // for(int i=0; i<nums.length; i++){
        //     System.out.println(nums[i]);   
        // }
        // insertionSort(nums);
        countingSort(nums);
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);   
        }

    }
}