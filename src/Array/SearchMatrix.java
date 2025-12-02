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
}
