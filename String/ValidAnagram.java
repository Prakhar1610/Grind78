package String;

public class ValidAnagram 
{
	public boolean isAnagram(String s, String t) 
    {
        if(s.length() != t.length())
           return false;

        s = s.toLowerCase();
        s = s.replace(" " , "");

        t = t.toLowerCase();
        t = t.replace(" " , "");

        int[] bucket = new int[26];

        for(int i=0 ; i<s.length() ; i++)
           bucket[s.charAt(i) - 'a']++;
        
        for(int i=0 ; i<t.length() ; i++)
           bucket[t.charAt(i) - 'a']--;

        for(int count : bucket)
        {
            if(count != 0)
              return false;
        }
        return true;

        

        // BRUTE FORCE
        // if(s.length() != t.length())
        // return false;

        // char[] charArrays = s.toCharArray();
        // char[] charArrayt = t.toCharArray();

        // Arrays.sort(charArrays);
        // Arrays.sort(charArrayt);
 
        // return Arrays.equals(charArrays, charArrayt);
    }
}
