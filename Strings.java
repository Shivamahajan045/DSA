// public class Strings{
//     public static boolean isPalindrome(String str){
//         for(int i = 0; i < str.length() / 2; i++){
//             int n = str.length();
//             if(str.charAt(i) != str.charAt(n - i - 1)){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static float getShortestPath(String str){
//         int x = 0, y = 0;
//         for(int i = 0; i < str.length(); i++){
//             char dir = str.charAt(i);
//             if(dir == 'E'){
//                 x++;
//             }
//             else if(dir == 'W'){
//                 x--;
//             }
//             else if(dir == 'N'){
//                 y++;
//             }
//             else{
//                 y--;
//             }
//         }
//             int x2 = x * x;
//             int y2 = y * y;
//             return (float)Math.sqrt(x2 + y2);
// }
//     public static void main(String[] args){
//         // String str = "racepar";
//         // System.out.println(isPalindrome(str));
//         String str = "WNEENESENNN";
//         // System.out.println(getShortestPath(str));
//     }
// }

// public class Strings{
// public static void main(String[] args){
//     String fruits[] = {"apple", "mango", "kiwi", "banana"};
//     String largest = fruits[0];
//     for(int i=1; i<fruits.length; i++){
//         if(largest.compareTo(fruits[i]) < 0){
//             largest = fruits[i];
//         }
//     }
//     System.out.println(largest);
// }
// }

import java.util.*;
public class Strings{
    public static String uppercase(String name){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(name.charAt(0));
        sb.append(ch);
        for(int i=1; i<name.length(); i++){
            if(i < name.length() - 1 && name.charAt(i) == ' '){
                sb.append(name.charAt(i));
                i++;
                sb.append(Character.toUpperCase(name.charAt(i)));
            }
            else{
                sb.append(name.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String stringCompression(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

        public static String compression(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            Integer count = 1;
            while(i<str.length() - 1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        // String name = "hi, i am shiva";
        String str = "aassbbbcccdd";
        System.out.println(stringCompression(str));
    }   
}