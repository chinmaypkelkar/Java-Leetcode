package Array;

public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int matrixStart = 0;
        int matrixEnd = rows - 1;
        int suitableRow = -1;
        while(matrixStart <= matrixEnd){
            suitableRow = (matrixStart + matrixEnd)/2;
            if(target > matrix[suitableRow][columns - 1]){
                matrixStart = suitableRow + 1;
            }else if(target < matrix[suitableRow][0]){
                matrixEnd = suitableRow - 1;
            }else{
                break;
            }
        }

        int start = 0;
        int end = columns - 1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(target < matrix[suitableRow][mid]){
                end = mid - 1;
            }else if(target > matrix[suitableRow][mid]){
                start = mid + 1;
            }else{
                return true;
            }
        }

        return false;
    }


    public boolean searchMatrixDifferent(int[][] matrix, int target){
        int nRows = matrix.length - 1;
        int nColumns = matrix[0].length - 1;
        int start = 0;
        int end = nRows;
        int desiredRow = -1;
        while(start <= end){
            int row = (start + end)/2;
            if(target > matrix[row][0] && target > matrix[row][nColumns]){
                start = row + 1;
            }else if(target < matrix[row][0]  && target < matrix[row][nColumns]){
                end = row - 1;
            }else {
                desiredRow = row;
                break;
            }
        }

        if(desiredRow == -1){
            return false;
        }

        int left = 0;
        int right = nColumns;

        while(left <= right) {
            int mid = (left + right)/2;
            if(target < matrix[desiredRow][mid] ){
                right = mid - 1;
            }else if(target > matrix[desiredRow][mid] ){
                left = mid + 1;
            }else{
                return true;
            }
        }

        return false;

    }

    }

