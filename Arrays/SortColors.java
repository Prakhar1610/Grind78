package Arrays;

public class SortColors 
{
	public void sortColors(int[] nums) 
    {
        // Arrays.sort(nums);
        // System.out.println(nums);

        //Counter Approach
        int zeros = 0;
        int ones = 0;
        int len = nums.length;

        for(int num : nums) 
        {
            if(num == 0) 
               zeros++;
            else if(num == 1)
               ones++;
        }  

        for(int i=0 ; i<zeros ; i++) 
            nums[i] = 0;

        for(int i=zeros ; i<zeros + ones ; i++) 
            nums[i] = 1;

        for(int i=zeros + ones ; i<len ; i++) 
            nums[i] = 2;
    }
}
