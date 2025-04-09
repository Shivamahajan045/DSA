import java.util.HashMap;
import java.util.HashSet;
public class HashMapCC{
    public static void majorityElement(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for(Integer it: map.keySet()){
            if(map.get(it) > arr.length / 3){
                System.out.println(it);
            }
        }
    }

    public static boolean validAnagram(String s, String t){
        HashMap<Character, Integer> map = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(map.get(ch) != null){
                if(map.get(ch) == 1){
                    map.remove(ch);
                }
                else{
                    map.put(ch, map.get(ch) - 1);
                }
            }
            else{
                return false;
            }
        }
        return map.isEmpty();
    }

    public static void countDistinctElements(int nums[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        System.out.println("Distinct elements are : " + set.size());
    }

    public static void unionAndIntersection(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        for(int i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        System.out.println("Union count : " + set.size());
        
        for(Integer it : set){
            System.out.print(it+" ");
        }
        System.out.println();

        set.clear();

        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        int count = 0;
        for(int i=0; i<arr2.length; i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
                System.out.print(arr2[i] + " ");
            }
        }
        System.out.println("Intersection count : "+ count);
    }
    public static void longestSubarrayWithZeroSum(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = 0;
        int sum = 0;
        for(int j=0; j<arr.length; j++){
            sum += arr[j];

            if(map.containsKey(sum)){
                len = Math.max(len, j - map.get(sum));
            }else{
            map.put(sum, j);
            }
        }
        System.out.println("Longest subarray with zero sum : " + len);
    }
    public static void subarraySumEqualToK(int arr[], int k){
        int sum = 0;
        int ans = 0;
        HashMap<Integer, Integer>map = new HashMap<>();
        map.put(0, 1);
        for(int j = 0; j<arr.length; j++){
            sum += arr[j];
            if(map.containsKey(sum - k)){
                ans += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println("Subarray Sum Equal To K = " + ans);
    }
    public static void main(String[] args){
       int arr[] = {10, 2, -2, -20, 10};
       int k = -10;
       subarraySumEqualToK(arr, k);
    }
}