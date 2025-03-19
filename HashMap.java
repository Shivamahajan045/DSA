import java.util.*;

public class HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("shiva", 22);
        map.put("kumar", 23);
        map.put("raj", 24);

        for (String i : map.keySet()) {
            System.out.println("key: " + i + " value: " + map.get(i));
        }
    }
}