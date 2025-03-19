/*
public class QueueB{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;

        Queue(int n){
            arr = new int [n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public static void add(int data){
            if(rear == size - 1){
                System.out.println("Queue is Full");
                return;
            }

            rear = rear + 1;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear = rear - 1;
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Emmpty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String [] args){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2); 
        q.add(3);
        q.add(4);
            while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

*/


import java.util.*;
public class QueueB{
    public static void printNonRepeating(String str){
        Queue<Character> q = new LinkedList<>();
        int freq[] = new int [26];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;
            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1 ){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print("-1"+ " ");
            }
            else{
                System.out.print(q.peek()+" ");
            }
        }
    }

    public static void interLeave(Queue<Integer> q){
        Queue<Integer> firstQueue = new LinkedList<>();
        int size = q.size();
        for(int i=0; i<size/2; i++){
            firstQueue.add(q.remove());
        }

        while(!firstQueue.isEmpty()){
            q.add(firstQueue.remove());
            q.add(q.remove());
        }
    }
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interLeave(q);
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        System.out.println();
    }
}