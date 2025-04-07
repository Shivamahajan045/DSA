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
    public static void main(String[] args){
        String s = "tulip";
        String t = "lipid";
        System.out.println(validAnagram(s, t));
    }
}