class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i = 0; i< n ; i++){
            for(int j = 0; j<n ; j++){
                if(i == j || i + j == (n-1)){
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}

//===============================================================

// The condition i+j == n-1 checks if the element at (i, j) is on the secondary diagonal of the matrix. In a square matrix, the secondary diagonal is the line of elements that starts from the top-right corner and ends at the bottom-left corner, and all the elements on this line have the property that the sum of their row and column indices is equal to n-1, where n is the size of the matrix.
// 1 2 3 4
// 5 6 7 8
// 9 10 11 12
// 13 14 15 16
// The elements on the secondary diagonal are 4, 7, 10, and 13. If we calculate the sum of their row and column indices, we get:
// i + j     0   1   2   3
// -----------------------
//    3  |    4
//    2  |        7
//    1  |            10
//    0  |                13