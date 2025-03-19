//Activity selection
import java.util.*;
public class Greedy{
    public static void activitySelection(int start[], int end[]){
        //sorting
        int activities[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //lamda expression
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
       
        //end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i=1; i<start.length; i++){
            if(activities[i][1] > lastEnd){
                //activity select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }
        System.out.println("max activities = "+ maxAct);
       for (int i : ans) {
            System.out.print("A" + i + " ");
        }
        System.out.println();
    }

    public static void fractionalKnapsack(int val[], int weight[], int w){
        double ratio[][] = new double[val.length][2];
        //0th col => idx and 1st col => ratio

        for(int i=0; i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = w;
        int finalValue = 0;
        for(int i=ratio.length - 1; i>=0; i--){
            int idx =(int)ratio[i][0];
            if(capacity >= weight[idx]){ //include full item
                finalValue += val[idx];
                capacity -= weight[idx];
            }
            else{
                //include fractional item
                finalValue += capacity * ratio[i][1];
                capacity = 0;
                break;
            }
        }
        System.out.println("final value = "+ finalValue);  //final value = 240
    }
    public static void main(String[] args){  
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int w = 50;
        fractionalKnapsack(val, weight, w);
    }
}