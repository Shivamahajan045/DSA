

/*
public class StackB{
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            if(isEmpty()) return -1;
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek(){
            if(isEmpty()) return -1;
            return list.get(list.size() - 1);
        }
    } 

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack{
        static Node head = null;

        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            if(isEmpty()) return -1;
            int top = head.data;
            head = head.next;
            return top;
        }

         public static int peek(){
            if(isEmpty()) return -1;
            return head.data;
        }
    }

    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

*/


import java.util.*;

public class StackB{

    public static void pushAtBottom(Stack<Integer> s, int data){
        //Recursion
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int i = 0;
        while(i < str.length()){
            char curr = str.charAt(i);
            s.push(curr);
            i++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            result.append(s.pop());
        }
        return result.toString();
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top); 
        
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void stockSpan(int stocks[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for(int i=1; i<stocks.length; i++){
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice > stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i] = i+1;
            }
            else{
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }

    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            //opening
            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }
            //closing
            else{
                //initially closing coming
                if(s.isEmpty()){
                    return false;
                }
                //check pair
                if((s.peek() == '(' && ch == ')') || (s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']')){
                    s.pop();
                }
                else{
                    return false; // invalid pair
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            //closing
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true; //Duplicate exists
                }
                else{
                    s.pop(); //opening pair remove
                }
            }
            //opening
            else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args){
        String str = "((a+b))";
        System.out.println(isDuplicate(str));
    }
}

/*
int arr[] = {6, 8, 0, 1, 3};
        int ngeR[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i<arr.length; i++){
            //remove indexes
            while(!s.isEmpty() && arr[i] > arr[s.peek()]){
                s.pop();
            }

            //find ngeR
            if(s.isEmpty()){
                ngeR[i] = -1;
            }
            else{
                ngeR[i] = arr[s.peek()];
            }

            // push idx into stack
            s.push(i);
        }


        for(int i=0; i<ngeR.length; i++){
            System.out.print(ngeR[i]+" ");
        }
        System.out.println();

        */
//ngeL = reverse the main loop; i=0 to n and i++
//nseR = change only condition; arr[i] < arr[s.peek()] loop remains same n-1 to 0; i--
//nseL = change both loop; i=0 to n; i++ and arr[i] < arr[s.peek()];

