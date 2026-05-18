class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++)
        {
            int max = nums1[i];
            int j = 0, temp = -1;
            while( j < nums2.length)
            {
                if( max == nums2[j])
                {
                    for(int k = j+1; k < nums2.length; k++)
                    {
                        if(nums2[k] > max)
                        {
                            temp = nums2[k];
                            break;
                        }
                    }
                }
                j++;
            }
            
            
            list.add(temp);
        }
        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}