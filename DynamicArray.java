import java.util.*;
import java.util.ArrayList;
/*
ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int i=1; i<=5; i++){
            list1.add(i);
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=1; i<=5; i++){
            list2.add(2*i);
        }
        ArrayList<Integer> list3 = new ArrayList<>();
        for(int i=1; i<=5; i++){
            list3.add(3*i);
        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);
        for(int i = 0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j = 0; j<currList.size(); j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }  
*/

public class DynamicArray{
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        for(int i=0; i<height.size(); i++){
            for(int j = i+1; j<height.size(); j++){
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;
    }
    public static void main(String[] args){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }
}