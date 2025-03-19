public class TwoD{
    public static void printSpiral(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        int startRow = 0;
        int startCol = 0;
        int endRow = n - 1;
        int endCol = m - 1;

        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j = startCol; j <= endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i = startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1; i>=startRow+1; i--){
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

    public static void diagonalSum(int matrix[][]){  
        int n = matrix.length;
        int sum = 0;
        // for(int i=0; i<n; i++){     //Tc - O(n^2)
        //     for(int j=0; j<matrix[i].length; j++){
        //         //primary diagonal
        //         if(i==j){
        //         sum += matrix[i][j];
        //         }
        //         else if(i + j == n - 1){
        //             //secondary diagonal
        //             sum+= matrix[i][j];
        //         }
        //     }
        // }
        for(int i=0; i<n; i++){
            //Pd
            sum += matrix[i][i];

            //sd
            if(i != n - 1 - i)
            sum += matrix[i][n-1-i];
        }
        System.out.println("diagonal sum = " + sum);
    }

    public static boolean searchInSortedMatrix(int matrix[][], int key){
        int row = 0, col = matrix[0].length - 1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] == key){
                System.out.println("Key is found at index : ("+row+", "+ col+")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key is not found!");
        return false;
    }

    public static void main(String[] args){
        int matrix[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int key = 14;

        System.out.println(searchInSortedMatrix(matrix, key));
    }
}