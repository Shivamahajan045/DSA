
public class Recursion{
    public static void printDec(int num){
        if(num == 1){
            System.out.println(num);
            return;
        }
        System.out.println(num+" ");
        printDec(num - 1);
    }

    public static void printInc(int num){
        if(num == 1){
            System.out.println(num);
            return;
        }
        printInc(num-1);
        System.out.println(num);
    }

    public static int printFactorial(int n){
        if(n == 0){
            return 1;
        }
        int fact = n * printFactorial(n - 1);
        return fact;
    }

    public static int calSum(int n){
        if(n == 1){
            return 1;
        }

        int sn = n + calSum(n - 1);
        return sn;
    }

    public static int fibN(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibN(n - 1) + fibN(n - 2);
    }

    public static boolean isSorted(int arr[], int index){
        if(index == arr.length -1 ){
            return true;
        }
        if(arr[index] > arr[index+1]){
            return false;
        }
        return isSorted(arr, index+1);
    }


    public static int firstOccurance(int arr[], int i, int key){
        if(i == arr.length - 1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurance(arr, i+1, key);
    }

    public static int lastOccurance(int arr[], int i, int key){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccurance(arr, i+1, key);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n){
        if(n == 1){
            return x;
        }
        if(n == 0){
            return 1;
        }

        return x * power(x, n-1);
    }


    public static int optimizedPower(int x, int n){
        if(n == 0){
            return 1;
        }

        int halfPower = optimizedPower(x, n / 2);
        int halfPowerSq = halfPower * halfPower;

        // odd
        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }


    public static int tilingProblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return tilingProblem(n - 1) + tilingProblem(n - 2);
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar- 'a'] == true){
            removeDuplicates(str, idx + 1, newStr, map);
        }
        else{
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }
    public static int friendsPair(int n){
        if(n == 1 || n == 2){
            return n;
        }

        //single
        int fnm1 = friendsPair(n-1);

        //pair
        int fnm2 = n - 1 * friendsPair(n-2);

        return fnm1 + fnm2;
    }

    public static int search(int arr[], int target, int si, int ei){
        // base case
        if(si > ei){
            return -1;
        }
        //kaam
        int mid = si + (ei - si) / 2;

        // Found
        if(arr[mid] == target){
            return mid;
        }

        //case 1 : mid on L1
        if(arr[si] <= arr[mid]){
            //case a : left
            if(arr[si] <= target && target <= arr[mid]){
               return search(arr, target, si, mid - 1);
            }
            else{
                return search(arr, target, mid + 1, ei);
            }
        }
        else{ //mid on L2
            //case c : right
            if(arr[mid] >= target && target <= arr[ei]){
                return search(arr, target, mid + 1, ei);
            }
            //case d : left
            else{
                return search(arr, target, si, mid - 1);
            }
        }
    }
    public static void mergeSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei){
        int i = si;
        int j = mid + 1;
        int k = 0;
        int temp [] = new int [ei - si + 1];
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
            while(i <= mid){
                temp[k] = arr[i];
                i++;
                k++;
            }
            while(j <= ei){
                temp[k] = arr[j];
                j++;
                k++;
            }
       
        i = si;
        for(k = 0; k < temp.length; k++){
            arr[i] = temp[k];
            i++;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
        printArr(arr);
    }
}
