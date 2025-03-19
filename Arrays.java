// Write a program to declare an array of size n and store the numbers 1,2,3,4 ...n in the array and return the array.
// import java.util.*;
// public class Arrays{
//     public static int[] createarray(int n){
//         int a[]=new int [n];
//         int count=0;
//         for(int i=1;i<=n;i++){
//             a[count]=i;
//             count++;
//         }
//         return a;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
//         int output[]=createarray(n);
//         for(int i=0;i<n;i++){
//             System.out.println(output[i]);
//         }
        
//     }
// }


// Given an array find the maximum in it and return it 
// Example:-
// Input:-
// Arr=[5, 4, 7, 2, 6]
// Ouput:-
// 7

// import java.util.Scanner;
// public class Arrays{
//     public static int find_the_Maximum(int a[]){
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<a.length;i++){
//             if(a[i]>max){
//                 max=a[i];
//             }
//         }
//         return  max;
//     }
//     public static void main(String[] args) {

//          Taking Input
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int a[]=new int[5];
//         for(int i=0;i<n;i++){
//             a[i]=sc.nextInt();
//         }
//         System.out.println(find_the_Maximum(a));
//     }
// }


// Minimum element in an array

// Complete the function to find the minimum in the array and return it

// Input :- Array and the length of the array

// [5,6,2,9,-2] , 5

// Output:-

// -2

// import java.util.*;
// public class Arrays{
//     public static int find_the_Minimum(int a[]){
//         int min=Integer.MAX_VALUE;
//         for(int i=0;i<a.length;i++){
//             if(a[i]<min){
//                 min=a[i];
//             }
//         }
//         return min;
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int a[]=new int[n];
//         for(int i=0;i<n;i++){
//             a[i]=sc.nextInt();
//         }
//         System.out.println(find_the_Minimum(a));
//     }
// }


// Write a program to store first n prime numbers in an array . After storing return the array.﻿

// Input:-n=5
// Output:- Return the output in the form of an array.

// 2
// 3
// 5
// 7
// 11

// import java.util.*;
// public class Arrays{
//     public static int[] store_primenums(int n){
//         int a[]=new int[n];
//         int counter=0;
//         int x=2;
        
//         while(counter<n){
//             boolean isPrime=true;
//             for(int i=2;i<x;i++){
//                 if((x%i)==0){
//                     isPrime=false;
//                     break;
//                 }
//             }
//             if(isPrime==true){
//             a[counter]=x;
//             counter++;
//             }
//              x++;
//         }
//        return a;
//     }
//     public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int output[]=store_primenums(n);
//     for(int i=0;i<n;i++){
//         System.out.println(output[i]);
//     }
//     }
// }


// Subarrays
// Input:-
// [1,2,3,4,5]
// Output:-
// 1
// 12
// 123
// 1234
// 12345

// 2
// 23
// 234
// 2345

// 3
// 34
// 345

// 4
// 45

// 5


// public class Arrays{
//     public static void Subarrays(int a[]){
//         for(int i=0;i<a.length;i++){
//             for(int j=i;j<a.length;j++){
//                 for(int k=i;k<=j;k++){
//                     System.out.print(a[k]);
//                 }
//                 System.out.println();
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int a[]={1,2,3,4,5};
//         Subarrays(a);
//     }
// }

// Maximum Sum Subarray
// Given an array find the maximum sum subarray. Return the maximum sum of the subarray.
// Input:-
// [5, 2, -4, -5, 3, -1, 2, 3, 1]
// Output:-
// 8
// Reason :- 3,-1,2,3,1 is the maximum subarray possible.

// public class Arrays{
//     public static int Maximum_subarray_sum(int a[]){
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<a.length;i++){
//             for(int j=i;j<a.length;j++){
//                 int sum=0;
//                 for(int k=i;k<=j;k++){
//                     sum+=a[k];
//                 }
//             if(sum>max){
//             max=sum;
//             }
//           }
//         }   
//         return max;
//     }
//     public static void main(String[] args) {
//         int a[]={5,2,-4,-5,3,-1,2,3,1};
//         System.out.println(Maximum_subarray_sum(a));
//     }
// }


// Running Sum of 1d Array

// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].


// public class Arrays{
//     public static int[] running_sum(int nums[]){
//         // nums[0]=1;
//         for(int i=1;i<nums.length;i++){
//             nums[i]=nums[i]+nums[i-1];
//         }
//         return nums;
//     }
//     public static void main(String []args){
//         int nums[]={1,2,3,4};
//         int output[]=running_sum(nums);
//         for(int i=0;i<nums.length;i++){
//             System.out.print(output[i]+" " );
//         }
//     }
// }



/*
Maximum in 2D array
Example 1:
Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.

Example 2:
Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation: 
1st customer has wealth = 6
2nd customer has wealth = 10 
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.

Example 3:
Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
Output: 17  
*/
// public class Arrays{
//     public static int maximumin2D(int accounts[][]){
//         int max=Integer.MIN_VALUE; 
//             for(int i=0;i<accounts.length;i++){
//             int sum=0;
//             for(int j=0;j<accounts[i].length;j++){
//                 sum+=accounts[i][j];
//             }
//             if(sum>max){
//                 max=sum;
//             }
//         }
//         return max;
//     }
//     public static void main(String[] args) {
//         int accounts[][]={{1,2,3},{3,2,1}};
//         System.out.println(maximumin2D(accounts));
//     }
// }

// Sum of Odd length Subarrays

// Input: arr = [1,4,2,5,3]
// Output: 58
// Explanation: The odd-length subarrays of arr and their sums are:
// [1] = 1
// [4] = 4
// [2] = 2
// [5] = 5
// [3] = 3
// [1,4,2] = 7
// [4,2,5] = 11
// [2,5,3] = 10
// [1,4,2,5,3] = 15
// If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58

// public class Arrays{
//      public static int oddlengthsubarraysum(int arr[]){
//          int sum=0;
//             for(int i=0;i<arr.length;i++){
//                 for(int j=i;j<arr.length;j+=2){
//                     for(int k=i;k<=j;k++){
//                         sum+=arr[k];
//                     }
//                 }
//             }
//             return sum;
//         }     
//     public static void main(String[] args) {
//        int arr[]={1,4,2,5,3};
//        System.out.println(oddlengthsubarraysum(arr));
//     }
// }


// Missing number
// Input: nums = [3,4,1]

// Output: 2

// Explanation: n = 4 since there are 3 numbers, so all numbers are in the range [1,4]. 2 is the missing number
//  in the range since it does not appear in nums.


// public class Arrays{
//     public static int missing_number(int nums[]){
//         int sum1=0;
//         for(int i=0;i<nums.length;i++){
//             sum1+=nums[i];
//         }
//         int sum2=0;
//         for(int i=1;i<=nums.length+1;i++){
//             sum2+=i;
//         }
//         return sum2-sum1;
//     }
//     public static void main(String[] args) {
//         int nums[]={3,4,1};
//         System.out.println(missing_number(nums));
//     }
// }
// import java.util.*;
// import java.util.ArrayList;

// public class Arrays{
//     public static int maximumin2DArray(int matrix[][]){
//         int maxPrimarydiagonal=matrix[0][0];
//         int maxSecondarydiagonal=matrix[matrix.length-1][0];
        
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix[i].length;j++){
//                 if(i==j){
//                     if(matrix[i][j]>maxPrimarydiagonal){
//                         maxPrimarydiagonal=matrix[i][j];   
                                
//                     }
                      
//                 }
              
                
                

//                 if((i+j)==(matrix.length-1)){
//                     if(matrix[i][j]>maxSecondarydiagonal){
//                         maxSecondarydiagonal=matrix[i][j];               
//                     }
//                 }
//             }
           
//         }
//         System.out.println(maxPrimarydiagonal);
//         return maxSecondarydiagonal;
        
//         // System.out.println(maxPrimarydiagonal+" "+maxSecondarydiagonal);
        
// }
//     public static void main(String[] args) {
//         // int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
//         int matrix[][]={{-1,2,-3},{-4,5,-6},{-7,-8,9}};
//         System.out.println(maximumin2DArray(matrix));

//     }
// }


// import java.util.*;
// public class Arrays{
//     public static void main(String[] args) {
//         try (Scanner sc = new Scanner(System.in)) {
//             int n=sc.nextInt();
//             for(int i=0;i<=n;i++){
//                 if((n+i)%69==0){
//                     System.out.print(i);
//                     break;
//                 }
//             }
//         }
//     }
// }

import java.util.*;

public class Arrays{
    
    public static int[] duplicate(int nums[]){
        int temp[]=new int[nums.length];
      for(int i=0;i<nums.length;i++){
        temp[i]=nums[i];
      }
      return temp;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3};
        System.out.println(duplicate(nums));
    }
}