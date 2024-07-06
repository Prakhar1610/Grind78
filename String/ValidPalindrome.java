package String;

public class ValidPalindrome 
{
	public boolean isPalindrome(String s) 
    {
        int left = 0;
        int right = s.length()-1;
        char leftch;
        char rightch;
        s = s.toLowerCase();

        while(left < right)
        {
            leftch = s.charAt(left);
            rightch = s.charAt(right);

            if(!(leftch >= 'a' && leftch <= 'z' || leftch >= '0' && leftch <= '9'))
            {
                left++;
                continue;
            }
            
            if(!(rightch >= 'a' && rightch <= 'z' || rightch >= '0' && rightch <= '9'))
            {
                right--;
                continue;
            }
            
            if(leftch == rightch)
            {
                left++;
                right--;
                continue;
            }
            else
                return false;

        }
        return true;
       
    }
}
