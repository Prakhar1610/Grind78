package BinarySearch;

public class BinarySearch 
{
	public int search(int[] nums, int target) 
    {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right)
        {
            int mid = (left + right) / 2;

            if(nums[mid] == target)
               return mid;
            else if(nums[mid] > target)
               right = mid - 1;
            else
               left = mid + 1;
        }
        return -1;
        
        
        // int res = Arrays.binarySearch(nums, target);
        // int index = (res >= 0) ? res : -1;
        // return index;
    }
}
