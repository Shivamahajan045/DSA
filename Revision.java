// import java.util.*;
// public class Revision {
//     public static void main (String args[]){
//         System.out.println("Hello World");
//     }
// }

// 1)Swap two variables a and b
// a=14 b=15

// import java.util.*;
// public class Revision{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();

//         int temp=a;
//         a=b;
//         b=temp;

//         System.out.println(a);
//         System.out.println(b);

//     }
// }

// Q)largest among two numbers

// public class Revision{
//     public static void main(String[] args) {
//         int a=5;
//         int b=7;

//         if(a>b){
//             System.out.println(a);
//         }
//         else{
//             System.out.println(b);
//         }
//     }
// }

// Q)largest among three numbers
// import java.util.*;
// public class Revision{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();

//         if(a>b && a>c){
//             System.out.println(a);
//         }
//         else if(b>a&&b>c){
//             System.out.println(b);
//         }
//         else{
//             System.out.println(c);
//         }
//     }
// }

// Ternary operator

// pass or Fail
// import java.util.*;
// public class Revision{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int marks=sc.nextInt();
//         String s=(marks>=35?"Pass":"Fail");
//         System.out.println(s);
//     }
// }


// loops
//  Write a program using only while loops to print all the even numbers from 1 to n
// n=10
// import java.util.*;
// public class Revision{
//     public static void main(String[] args) {
//         int n=10;
//         for(int i=1;i<=n;i++){
//             if(i%2==0){
//                 System.out.print(i+" ");
//             }
            
//         }
//         System.out.println();
//   }
// }

// Print the following series using while loop

// 1 4 9 16 25 36 …. n

// Input :-

// n = 49

// Output :-

// 1

// 4

// 9

// 16

// 25

// 36

// 49

// import java.util.*;
// public class Revision{
//     public static void main(String[] args) {
//         for(int i=1;i*i<=49;i++){
//             System.out.println(i*i);
//         }
//     }
// }


// while loop and continue statement

// Print all number from 1 to n but then it should not be divisible by 5
// Input:-

// n=7

// output:-

// 1

// 2

// 3

// 4

// 6

// 7


// public class Revision{
//     public static void main(String[] args) {
//         int n=7;
//         int i=1;
//         while(i<=n){
//             if(i%5==0){
//                 i++;
//                 continue;

//             }
//             System.out.println(i);
//             i++;
//         }
        
//     }
// }


// Write a program to print the digits of a number .

// Input:-

// N - 153 .


// public class Revision{
//     public static void main(String[] args) {
//         int n=153;
//         while(n>0){
//             int lastdigit=n%10;
//             n=n/10;

//             System.out.println(lastdigit);
//         }
//     }
// }

// Write a program to print whether a given number is an Armstrong number or not..

// (Armstrong number is a number in which all the sum of cubes of digits is equal to the number

// Example:-

// Input

// n=153

// Output

// true



// Logic - 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 1 +125 + 27 = 153 which is equal to the original number )



// Input

// 123

// Output

// false


// public class Revision{
//     public static void main(String[] args) {
//         int n=125;
//         int temp=n;
//         int sum=0;
//         while(n>0){
//             int lastdigit=n%10;
//             sum=sum+lastdigit*lastdigit*lastdigit;
//             n=n/10;
//         }
//         if(sum==temp){
//             System.out.println("it is an armstrong number");
//         }
//         else{
//             System.out.println("it is not an armstrong number");
//         }
//     }

// }

// Write a program to return the reverse of a number

// Input

// n=123

// output

// 321

// public class Revision{
//     public static void main(String args[]){
//         int rev=0;
//         int n=123;
//         while(n>0){
//             int last_digit=n%10;
//             rev=(rev*10)+last_digit;
//             n=n/10;
//         }
//         System.out.print(rev);
//     }

// }


// check if a number is prime or not

// import java.util.*;
// public class Revision{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         if(n==2){
//             System.out.println("Prime number");

//         }
//         else{
//             boolean isPrime=true;
//         for(int i=2;i<=Math.sqrt(n);i++){
//             if(n%i==0){
//                 isPrime=false;
//             }
//         }
//         if(isPrime==true){
//             System.out.println("Prime number");
//         }
//         else{
//             System.err.println("Not a prime number");
//         }
//         }
        
//     }
// }


// Write a program that reads a set of integers,and then prints the sum of the even and odd integers.

// import java.util.*;
// public class Revision{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         int n=sc.nextInt();
//         int evensum=0;
//         int oddsum=0;
//         int choice;

//         do{
//             if(n%2==0){
//                 evensum+=n;
//             }
//             else{
//                 oddsum+=n;
//             }
//             System.out.println("Do you want to continue? if Yes press 1 else press 0");
//             choice=sc.nextInt();
//         } while(choice==1);

//       System.out.println("Even integer sum is ="+evensum);
//       System.out.println("odd integer sum is ="+oddsum);

//     }
// }

// factorial of a number

// import java.util.Scanner;

// public class Revision{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int fact=1;
//         for(int i=1;i<=n;i++){
//             fact=fact*i;

//         }
//     }
// }

// patterns

// *
// **
// ***
// ****
// public class Revision{
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// ****
// ***
// **
// *

//  public class Revision{
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for(int j=4;j<=8-i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// 1
// 12
// 123
// 1234

// public class Revision{
//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }

// A
// BC
// DEF
// GHIJ

// public class Revision{
//     public static void main(String[] args) {
//         char ch='A';
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(ch);
//                 ch++;
//             }
//             System.out.println();
//         }
//     }
// }


// *****

// ****

// ***

// **

// *

// *

// **

// ***

// ****

// *****


// public class Revision{
//     public static void main(String[] args) {
//         for(int i=1;i<=10;i++){
//             for(int j=1;j<=6-i;j++){
//                 System.out.print("*");
//             }
            
//             for(int j=1;j<=i-5;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// *    *
// **   **
// ***  ***
// **** ****
// **********
// public class Revision{
//     public static void main(String[] args) {
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             for(int j=1;j<=5-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// Array--It is an object which store fixed number of element of same datatype

// Array is a non primitive datatype 

// in java and c++ it is a static defined datatype(size fixed)
// In python and JavaScript it is Dynamically defined\

// indexing starts from zero and java initially stores zero 

// Store elements in an array

// import java.util.Scanner;

// public class Revision{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int [n];
//         int counter=0;
//         for(int i=1;i<=n;i++){
//             arr[counter]=i;
//             counter++;
//         }
        
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }

// Write a program to declare an array of size n and store the numbers 1,2,3,4 ...n in the array and return the array.
// import java.util.Scanner;

// public class Revision{


//     public static int[] store_elements(int n){

//         int arr[]=new int [n];
//         int counter=0;
//         for(int i=1;i<=n;i++){
//             arr[counter]=i;
//             counter++;
//         }
//         return arr;
//     }
//     public static void main(String[] args) {   
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();

//        int output[]=store_elements(n);
//         for(int i=0;i<n;i++){
//             System.out.print(output[i]+" ");
//         }
//     }
// }


// Given an array find the maximum in it and return it 



// Example:-

// Input:-

// Arr=[5, 4, 7, 2, 6]

// Ouput:-

// 7


// public class Revision{
//     public static int find_the_Maximum(int arr[]){
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//         return max;
//     }
//     public static void main(String[] args) {
//         int arr[]={5,4,7,2,6};
//         System.out.println(find_the_Maximum(arr));
//     }
// }


// store first n prime numbers in an array

// import java.util.Scanner;

// public class Revision{
//     public static int [] prime_numbers(int n){
       
//         int a[]=new int[n];
//          int x=2;
//         int counter=0;
        
//         while(counter<n){
//             boolean isprime=true;
//             for(int i=2;i<x;i++){
//                  if(x%i==0){
//                 isprime=false;
//                 break;
//                 }
//             }
//            if(isprime==true){
//             a[counter]=x;
//             counter++;
//            }
//            x++;
//         }
//         return a;
//     }
//     public static void main(String[] args) {
//          Scanner sc=new Scanner(System.in);
//         int n =sc.nextInt();
        
//         int[] output = prime_numbers(n);
//         for(int i=0;i<n;i++)
//             System.out.println(output[i]);
//     }
//     }

// subarray --it is a contiguous part of array

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


// public class Revision{

//     public static void subarray(int a[]){
//         for(int i=0;i<a.length;i++){
//             for(int j=0;j<a.length;j++){
//                 for(int k=i;k<=j;k++){
//                     System.out.print(a[k]);
//                 }
//                 System.out.println();
//             }
           
//         }
        
//     }
//     public static void main(String[] args) {
//         int a[]={1,2,3,4,5};
//         subarray(a);
//     }
// }

/*Given an array find the maximum sum subarray. Return the maximum sum of the subarray.

Input:-

[5,2,-4,-5, 3,-1,2,3,1]

Output:-

8

Reason :- 3,-1,2,3,1 is the maximum subarray possible. */


// public class Revision{
//     public static int Maximum_subarray_sum(int arr[]){
//         int max=Integer.MIN_VALUE;
        
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length;j++){
//                 int sum=0;
//                 for(int k=i;k<=j;k++){
//                     sum+=arr[k];

//                     if(sum>max){
//                         max=sum;
//                 }
//             }
        
//         }
      
//     }
//       return max;
// }
//     public static void main(String[] args) {
//         int arr[]={5,2,-4,-5,3,-1,2,3,1};
//         System.out.println(Maximum_subarray_sum(arr));
//     }
// }

// Bubble sort -Jenny lectures 
//  compare with adjacent elements if it is in incorrect order then swap else leave

// public class Revision{
//     public static int [] bubblesort(int arr[]){
        // for(int i=0;i<arr.length-1;i++){    --no of passes
//             for(int j=0;j<arr.length-1-i;j++){   ---no of comparision and depend on i value
//                 if(arr[j]>arr[j+1]){

//                     // swap
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//         return arr;
//     }

//     public static void main(String[] args) {
//         int arr[]={3,5,2,4,7};
//        bubblesort(arr); 

//        for(int i=0;i<arr.length;i++){
//         System.out.print(arr[i]+" ");
//        }
//     }
// }


// insertion sort

// public class Revision{
//     public static int[] insertion_sort(int arr[]){
//         for(int i=1;i<arr.length;i++){
//             int temp=arr[i];
//             int j=i-1;
//             while(j>=0 && arr[j]<temp){
//                 arr[j+1]=arr[j];
//                 j--;
//             }

//             arr[j+1]=temp;
//         }
//         return arr;
//     }
//     public static void main(String[] args) {
//         int arr[]={4,2,5,6,1};
//         insertion_sort(arr);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }
//     }
// }


// Selection sort

// public class Revision{

//     public static int [] SelectionSort(int arr[]){
//         for(int i=0;i<arr.length-1;i++){
//             int min=i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[j]<arr[min]){
//                     min=j;
//                 }
//             }
//             if(min!=i){
//                 int temp=arr[i];
//                 arr[i]=arr[min];
//                 arr[min]=temp;
//             }
//         }
//         return arr;
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,5,3,7};
//         SelectionSort(arr);
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+" ");
//         }

//     }
// }

// Missing number

// public class Revision{
//     public static int missing_number(int arr[]){
//         int sum1=0;
//         for(int i=0;i<arr.length;i++){
//             sum1+=arr[i];
//         }
//         int sum2=0;
//         for(int j=1;j<=arr.length+1;j++){
//             sum2+=j;
//         }
//         return sum2-sum1;
//     }
//     public static void main(String[] args) {
//         int arr[]={3,4,1};
//        System.out.println(missing_number(arr));
//     }
// }


// maximum in 2d array

// Input: accounts = [[1,5],[7,3],[3,5]]

// Output: 10

// public class Revision{
//     public static int Maximum_in_2darray(int accounts[][]){
//         int max=Integer.MIN_VALUE;
        
//         for(int i=0;i<accounts.length;i++){
//             int sum=0;
//             for(int j=0;j<accounts[i].length;j++){
//                 sum+=accounts[i][j];
//                  if(sum>max){
//                 max=sum;
//             }
//             }
           
//         }
//         return max;
//     }
//     public static void main(String[] args) {
//         int accounts[][]={{1,5},{7,3},{3,5}};
//         System.out.println(Maximum_in_2darray(accounts));
//     }
// }

// Given an integer array, return the maximum difference between any 2 adjacent elements.

// Input: [1, 2, 4, 7, 11]

// Output: 4


// public class Revision{

//         public static int max_diff(int arr[]){
//                 int max=Integer.MIN_VALUE;
//                 for(int i=0;i<arr.length-1;i++){
//                         int diff=Math.abs(arr[i]-arr[i+1]);

//                         if(diff>max){
//                                 max=diff;
//                         }
//                 }
//                 return max;
//         }
//         public static void main(String[] args) {
//                 int arr[]={1, 2, 4, 7, 11};

//                System.out.println(max_diff(arr));
//         }
// }


// public class Revision{
//         public static int maxfromBothdiagonals(int arr[][]){
//                 int maxPrimarydiagonal=arr[0][0];
//                 int maxSecondarydiagonal=arr[0][arr.length-1];

//                 for(int i=0;i<arr.length;i++){
//                         for(int j=0;j<arr[i].length;j++){
//                                 if(i==j){
//                                         if(arr[i][j]>maxPrimarydiagonal){
//                                                 maxPrimarydiagonal=arr[i][j];
//                                         }
//                                 }

//                                 if(i+j==arr.length-1){
//                                         if(maxSecondarydiagonal<arr[i][j]){
//                                                 maxSecondarydiagonal=arr[i][j];
//                                         }
//                                 }
//                         }
//                 }
//                 System.out.print(maxPrimarydiagonal+" ");
//                 return maxSecondarydiagonal;
//         }
//         public static void main(String[] args) {
//                 int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

//                 System.out.println(maxfromBothdiagonals(arr));

//         }
// }

// public class Revision{
//         public static int[] Selectionsort(int arr[]){
//                 int swap=0;
//                 for(int i=0;i<arr.length-1;i++){
//                         int min=i;
                        
//                         for(int j=i+1;j<arr.length;j++){
//                                 if(arr[j]<arr[min]){
//                                         min=j;
//                                 }
//                         }
//                         if(min!=i){
                                
//                                 int temp=arr[i];
//                                 arr[i]=arr[min];
//                                 arr[min]=temp;

//                                 swap++;

                                
//                         }
//                 }
//                 System.out.println(swap);
//                 return arr;
//         }
//         public static void main(String args[]){
//                 int arr[]={2,8,5,4};
//                 Selectionsort(arr);
//                 for(int i=0;i<arr.length;i++){
//                         System.out.print(arr[i]+" ");
//                 }
                

//         }
// }



// New Era 21/06/24

// Store elements in an array
public class Revision{
        public static void main(String[] args) {
                System.out.println("Hello world!");
        }
}

