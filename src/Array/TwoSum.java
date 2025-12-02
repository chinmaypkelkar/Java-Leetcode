package Array;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int[] output = new int[2];
        for(int i = 0;i <numbers.length; i++){
            int numberToSearch = target - numbers[i];
            int index = binarySearch(i+1,numbers.length - 1,numberToSearch, numbers);
            if(index != -1){
                output[0] = i+1;
                output[1] = index+1;
                break;
            }
        }
        return output;
    }

    private int binarySearch(int start, int end, int numberToSearch, int numbers[]){

        while(start <= end){
            int mid = (start+ end)/2;
            if(numberToSearch < numbers[mid] ){
                end = mid - 1;
            }else if(numberToSearch > numbers[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
