package Graph;

public class SetMatrixZeros {
      public void setZeroes(int[][] matrix) {
        int[][] zeroMatrix = new int[matrix.length][matrix[0].length];
        int nRows = matrix.length - 1;
        int nColumns = matrix[0].length - 1;

        for(int i = 0; i < matrix.length ; i++){
            for(int j = 0;j< matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    zeroMatrix[i][j] = 0;
                }else{
                    zeroMatrix[i][j] = -1;
                }
            }
        }

        for(int i = 0; i < matrix.length ; i++){
            for(int j = 0;j< matrix[0].length;j++){
                 if(matrix[i][j] == 0 && zeroMatrix[i][j] == 0){
                    rowDFS(matrix, i , j, nRows);
                    columnDFS(matrix, i, j, nColumns);
                 }
            }
        }
        
    }

    private void rowDFS(int[][] matrix, int row, int column, int nRows){
        if(row > nRows || row < 0  || matrix[row][column] == 0){
            return;
        }
        matrix[row][column] = 0;
        rowDFS(matrix,row + 1,column, nRows);
        rowDFS(matrix,row - 1,column, nRows);

    }

    private void columnDFS(int[][] matrix, int row, int column, int nColumns){
        if(column > nColumns || column < 0 || matrix[row][column] == 0 ){
            return;
        }
        matrix[row][column] = 0;
        columnDFS(matrix,row,column + 1, nColumns);
        columnDFS(matrix,row,column - 1, nColumns);
    }

}
