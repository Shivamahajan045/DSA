import java.util.*;
/*
public class BinaryTreeB{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
        public static void preOrder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }

         public static void inOrder(Node root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

        public static void postOrder(Node root){
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }

        public static void levelOrder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                    q.add(currNode.right);
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        
        tree.levelOrder(root);
    }
}

*/


//Height of a tree
public class BinaryTreeB{
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int heightOfTree(Node root){
        if(root == null){
            return 0;
        }
        int lh = heightOfTree(root.left);
        int rh = heightOfTree(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);

        return leftCount + rightCount + 1;
    }

    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    public static int diameter2(Node root){
        if(root == null){
            return 0;
        }
        int leftDia = diameter2(root.left);
        int leftHt = heightOfTree(root.left);
        int rightDia = diameter2(root.right);
        int rightHt = heightOfTree(root.right);

        int selfDia = leftHt + rightHt + 1;

        return Math.max(selfDia, Math.max(leftDia, rightDia));
    }


    static class Info{
        int dia;
        int ht;

        public Info(int dia, int ht){
            this.dia = dia;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root){
        if(root == null){
            return new Info(0, 0);
        }

        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int dia = Math.max(Math.max(leftInfo.dia, rightInfo.dia), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(dia, ht);
    }

    public static boolean isIdentical(Node node, Node subroot){
        if(node == null && subroot == null){
            return true;
        }
        else if(node == null || subroot == null || node.data != subroot.data){
            return false;
        }

        if(!isIdentical(node.left, subroot.left)){
            return false;
        }
        if(!isIdentical(node.right, subroot.right)){
            return false;
        }

        return true;
    }
    public static boolean isSubTree(Node root, Node subroot){
        if(root == null){
            return false;
        }

        if(root.data == subroot.data){
            if(isIdentical(root, subroot)){
                return true;
            }
        }

        return isSubTree(root.left, subroot) || isSubTree(root.right, subroot);

    }
    public static void KLevel(Node root, int level, int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data+" ");
            return;
        }
        KLevel(root.left, level+1, k);
        KLevel(root.right, level+1, k);
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        // Node subroot = new Node(2);
        // subroot.left = new Node(4);
        // subroot.right = new Node(5);
        int k = 3;
        KLevel(root, 1, k);
    }
}