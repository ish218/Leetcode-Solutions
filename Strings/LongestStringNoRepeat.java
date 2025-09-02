import java.util.HashSet;

public class LongestStringNoRepeat 
{
    public static int lengthOfLongestSubstring(String str)
    {
        HashSet<Character> hash_set = new HashSet();
        
        int i=0;
        int j=0;
        int LongestSubstring = 0;

        int length = str.length();

        while(j< length)
        {
            char ch = str.charAt(j);
            if(!hash_set.contains(ch))
            {
                hash_set.add(ch);
                j++;
                LongestSubstring = Math.max(hash_set.size(), LongestSubstring);
            }
            else
            {
                hash_set.remove(str.charAt(i));
                i++;
            }
        }

        return LongestSubstring;
    }
    
}
