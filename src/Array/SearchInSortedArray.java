package Array;

public class SearchInSortedArray {

   public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int deviationPoint;
        while(start < end){
            int mid = (start + end)/2;
            if(nums[mid] > nums[end]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }

        deviationPoint = start;
        start = 0;
        end = nums.length - 1;

        int index = binarySerach(nums, deviationPoint, end, target);
        if(index != -1){
            return index;
        }
        return binarySerach(nums, start, deviationPoint - 1, target);
    }

    private int binarySerach(int[] nums, int start, int end, int target){
         while(start <= end){
            int mid = (start + end) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(target < nums[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
