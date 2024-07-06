package Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate 
{
	public static boolean containsDuplicate(int[] nums) 
    {
        Set<Integer> s = new HashSet<>();

        for(int i=0 ; i<nums.length ; i++)
        s.add(nums[i]);
        
        if(s.size() < nums.length)
        return true;
        else
        return false;
    }
}
