public class LongestSubstring 
{
    public int lengthOfLongestSubstring( String s)
    {
        int i = 0;
        int j = i+1;
        int length = s.length();
        int count =1;
        int maxLength = 0;

        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;
        
        while (j < length)
        {
           if(!s.substring(i, j).contains(String.valueOf(s.charAt(j))))
           {
            j++;
            count++;
            maxLength = Math.max(maxLength, count);
           } 
           else
           {
            i++;
            count = 0;
           }
        }

        return maxLength;
    }
    
}
