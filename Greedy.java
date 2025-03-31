//Activity selection
import java.util.*;
import java.util.Collections;
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

    //Maximum length chain of pairs  - Tc => O(n*logn)
    public static void chainOfPairs(){
        int pairs[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40},{50, 90}};
        
        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int chainEnd = pairs[0][1];

        for(int i=1; i<pairs.length; i++){
            if(pairs[i][0] > chainEnd){ 
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("max length of chain = " + chainLen);
    }
    
    //Indian coins
    public static void indianCoins(){
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        Arrays.sort(coins, Comparator.reverseOrder());
        int amount = 1069;
        int countOfCoins = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<coins.length; i++){
            if(coins[i] <= amount){
                while(coins[i] <= amount){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("total (min) coins used : "+countOfCoins);

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }

    //Job sequencing problem

    //chocola problem
    public static void chocola(){
        int n = 4, m = 6;
        Integer costVer[] = {2, 1, 3, 1, 4};
        Integer costHor[] = {4, 1, 2};

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int v = 0;
        int h = 0;
        int vp = 1;
        int hp = 1;
        int cost = 0;
        while(v < costVer.length && h < costHor.length){
            //vertical cost less than horizontal cost
            if(costVer[v] <= costHor[h]){ //horizontal cut
                cost += (costHor[h] * vp);
                hp++;
                h++;
            }
            else{ //vertical cut
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        while(h < costHor.length){
            cost += costHor[h] * vp;
            hp++;
            h++;
        }

        while(v < costVer.length){
            cost += costVer[v] * hp;
            vp++;
            v++;
        }
        System.out.println("min cost of cuts : " + cost);
    }
    public static void main(String[] args){  
        chocola();
    }
}