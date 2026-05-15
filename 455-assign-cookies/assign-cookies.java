class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int p1 = 0,p2 = 0;
        int ans =0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(p1 < g.length && p2 < s.length)
        {
            if(s[p2] >= g[p1])
            {
                p1++;
                ans += 1;
            }
            p2++;
        }
        return ans;
    }
}