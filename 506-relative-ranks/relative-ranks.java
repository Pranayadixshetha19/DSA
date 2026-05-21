class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < score.length; i++)
        {
            map.put(score[i],i);
        }
        Integer[] sorted = new Integer[score.length];
        for (int i = 0; i < score.length; i++) {
            sorted[i] = score[i];
        }
        Arrays.sort(sorted, Collections.reverseOrder());
        String[] ans = new String[score.length];
        for(int i = 0; i < score.length; i++)
        {
            int index = map.get(sorted[i]);
            if( i == 0)
            {
                ans[index] = "Gold Medal";
            }
            else if( i == 1)
            {
                ans[index] = "Silver Medal";
            }
            else if( i == 2 )
            {
                ans[index] = "Bronze Medal";
            }
            else
            {
                ans[index] = String.valueOf(i + 1);;
            }
        }
        return ans;
    }
}