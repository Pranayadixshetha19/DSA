class Solution {
    public String runLE(String s)
    {
        StringBuilder sb = new StringBuilder();
        char[] n2= s.toCharArray();
        char c = n2[0];
        int count = 0;

        for(char num : n2)
        {
            if(num == c)
            {
                count++;
            }
            else
            {
                sb.append(count);
                sb.append(c);
                c = num;
                count = 1;
            }
        }
        
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }
    public String countAndSay(int n) {
      if( n == 1 )
      {
        return "1";
      } 
      return runLE(countAndSay(n - 1));
    }
    
}