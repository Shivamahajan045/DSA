import java.util.*;

public class Matrices{
    public static boolean search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key is found at index (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key is not found!");
        return false;
    }

    public static void largest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(largest < matrix[i][j]){
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("largest number is : " + largest);
    }

    public static void smallest(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(smallest > matrix[i][j]){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("smallest number is : " + smallest);
    }

    public static void printSpiral(int matrix[][]){
        int startRow = 0; 
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j = startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //Right
            for(int i = startRow + 1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //Bottom
            for(int j = endCol - 1; j>=startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i=endRow - 1; i>=startRow + 1; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;

        }
        
    }

    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        // for(int i = 0; i < matrix.length; i++){
        //     for(int j = 0; j < matrix[0].length; j++){
        //         if(i == j){
        //             sum += matrix[i][j];
        //         }
        //         else if(i+j == matrix.length - 1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        for(int i=0; i<matrix.length; i++){
            sum += matrix[i][i];
            if(i!=matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }

    public static boolean searchInSorted(int matrix[][], int key){
        int row = 0, col = matrix.length - 1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("Key is found at index : (" + row +", " + col + ")");
                return true;
            }
            if(matrix[row][col] < key){
                row++;
            }
            else{
                col--;
            }
        }
        System.out.println("Key is not found");
        return false;
    }

    public static void calculateSum(int matrix[][]){
        int sum = 0;
        int i = 1;
            for(int j=0; j<matrix[0].length; j++){
                sum += matrix[i][j];
            }
        System.out.println(sum);
    }

    public static void transpose(int matrix[][]){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        // int matrix [][] = new int[3][3];

        //Input
        // Scanner sc = new Scanner(System.in);
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }

    //output
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         System.out.print(matrix[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // search(matrix, 5);
        // largest(matrix);
        // smallest(matrix);
        // int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12},{13, 14, 15, 16}};
        // printSpiral(matrix);

        // int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12},{13, 14, 15, 16}};
        // int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // System.out.println(diagonalSum(matrix));

        // int matrix[][] = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
        // int key = 100;
        // searchInSorted(matrix, key);

        // int matrix[][] = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
        // calculateSum(matrix);

        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        transpose(matrix); 
    }
}