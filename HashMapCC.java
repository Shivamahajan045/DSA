import java.util.HashMap;
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
    public static void main(String[] args){
        int arr[] = {1, 3};
        majorityElement(arr);
    }
}