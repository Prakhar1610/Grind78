package Arrays;

public class MajorityElement 
{
	public int majorityElement(int[] nums) 
    {
        // Approach1
        // Arrays.sort(nums);
        // return nums[(int)Math.ceil(nums.length/2)];

        // Approach 2: Moore's Voting Algorithm
        int majority = nums[0];
        int votes = 1;

        for(int i=1 ; i<nums.length ; i++)
        {
            if(votes == 0)
            {
                votes++;
                majority = nums[i];
            }
            else if(nums[i] == majority)
                votes++;
            else
                votes--;
        }
        return majority;
    }
}
