package Arrays;

public class ProductOfArrayExceptSelf 
{
	public int[] productExceptSelf(int[] nums) 
    {
        int[] answer = new int[nums.length];

        int left_prod = 1;
        int right_prod = 1;

        // storing product of element which are on left side of specific element
        answer[0] = 1; // there is no left element of first element
        for(int i=1 ; i<answer.length ; i++)
        {
            left_prod = left_prod * nums[i-1];
            answer[i] = left_prod;
        }
            

        // multipying product of element which are on right side of specific element with left elements product
        for(int i=answer.length-2 ; i>=0 ; i--)
        {
            right_prod = right_prod * nums[i+1];
            answer[i] = answer[i] * right_prod;
        }
            

        return answer;
            



        // Brute Force
        // for(int i=0 ; i<nums.length ; i++)
        // {
        //     answer[i] = 1;
        //     for(int j=0 ; j<nums.length ; j++)
        //     {
        //         if(i == j)
        //           continue;
        //         else
        //           answer[i] = answer[i] * nums[j];
        //     }
        // }
        // return answer;
    }        
}
