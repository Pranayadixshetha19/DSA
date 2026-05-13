class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int p1=0,p2=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(p1 < nums1.length && p2 < nums2.length)
        {
            if(nums1[p1] == nums2[p2])
            {
                list.add(nums1[p1]);
                p1++;
                p2++;
            }       
            else if(nums1[p1] < nums2[p2])
            {
                p1++;
            }
            else
            {
                p2++;
            }
        }

        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i] = list.get(i);
        }
        return arr;
    }
}